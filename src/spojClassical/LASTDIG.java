//http://www.spoj.com/problems/LASTDIG/
// submitted
package spojClassical;
import java.util.Scanner;

public class LASTDIG {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int T=in.nextInt();
		while(T-- > 0){
			int b=in.nextInt();
			int i=in.nextInt();
			int l=1;
			int c=b%10;
			for(int j=0;j<i;j++){
				if((i-j)%2==0){
					i=i/2;
					j=0;
					c=(c*c)%10;
				}
				l=l*c;
				l=l%10;
			}
			System.out.println(l);
		}
	}
}
