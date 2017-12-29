package codeForce.dp;

/*
    Basic programing template
    update : Dec 29, 2017
*/

import java.io.*;
import java.util.Arrays;
import java.util.StringTokenizer;

    public class A337Puzzles {

        static FastScanner in;
        static PrintWriter out;
        static final int mod = 1000000007;
        static final long modL = 100000000000000000l;

        static int caseCounter = 1;

// ----------------------- my solution starts -----------------------
        static void solve() {
            int n = in.nextInt();
            int m = in.nextInt();
            int []F=in.getArrayInt(m);

            out.print("output");
        }



// ====================== my solution ends ==========================

        // part of pre-defined template

        static void gcjPrint(Object o) {
            out.print("Case #" + caseCounter + ": ");
            out.println(o);
            caseCounter++;
        }

        static long modI(long i, Boolean isMod) {
            if (isMod) {
                if (i >= mod)
                    i = i % mod;
                return i;
            }
            if (i > modL)
                i = i % mod;
            return i;
        }

        public static void run() {
            in = new FastScanner();
            out = new PrintWriter(new BufferedWriter(new OutputStreamWriter(System.out)));
            solve();
            out.close();
        }

        public static void main(String[] args) {
            run();
        }

        private static class FastScanner {
            BufferedReader br;
            StringTokenizer st;

            public FastScanner(String s) {
                try {
                    br = new BufferedReader(new FileReader(s));
                } catch (FileNotFoundException e) {
                    // TODO Auto-generated catch block
                    e.printStackTrace();
                }
            }

            public FastScanner() {
                br = new BufferedReader(new InputStreamReader(System.in));
            }

            String nextToken() {
                while (st == null || !st.hasMoreElements()) {
                    try {
                        st = new StringTokenizer(br.readLine());
                    } catch (IOException e) {
                        // TODO Auto-generated catch block
                        e.printStackTrace();
                    }
                }
                return st.nextToken();
            }

            int[] getArrayInt(int n) {
                int[] arr = new int[n];
                for (int i = 0; i < n; i++) {
                    arr[i] = nextInt();
                }
                return arr;
            }

            long[] getArrayLong(int n) {
                long[] arr = new long[n];
                for (int i = 0; i < n; i++) {
                    arr[i] = nextLong();
                }
                return arr;
            }

            int nextInt() {
                return Integer.parseInt(nextToken());
            }

            long nextLong() {
                return Long.parseLong(nextToken());
            }

            double nextDouble() {
                return Double.parseDouble(nextToken());
            }
        }

    }