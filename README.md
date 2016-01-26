
/*
    Basic programing template
    update : Jan 26, 2016
*/

import java.io.*;
import java.util.*;

public class MyTemplate {

	public static void main(String[] args) {
		FastScanner in = new FastScanner();
		PrintWriter out = new PrintWriter(new BufferedWriter(new OutputStreamWriter(System.out)));

		
		
		// out.println("my output");
		out.close();
	}

	public static class FastScanner {
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





/*
    Some frequently used function
*/

public static int binarySearch(long arr[], int l, int r, long x) {
		int m = 0;
		if (r >= l) {
			int mid = l + (r - l) / 2;
			m = mid;
			if (arr[mid] == x)
				return mid;
			if (arr[mid] > x)
				return binarySearch(arr, l, mid - 1, x);
			return binarySearch(arr, mid + 1, r, x);
		}
		return -1;
	}

  public static int getMaxof3(int a, int b, int c){
		return Math.max(a, Math.max(b, c));
	}
	
	public static int getMinof3(int a, int b, int c){
		return Math.min(a, Math.min(b, c));
	}
	











