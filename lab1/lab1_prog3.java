/*215890102 
  nCr*/
import java.util.Scanner;
class ncr{
	static int fact(int n){
		if(n==1)
			return 1;
		return n*fact(n-1);
	}
	static int ncr(int n,int r){
		return fact(n)/(fact(r)*fact(n-r));
	}
	public static void main(String args[]){
		Scanner o=new Scanner(System.in);
		int n,r;
		System.out.print("enter n and r:");
		n=o.nextInt();
		r=o.nextInt();
		int c=ncr(n,r);
		System.out.println(n+"C"+r+"="+c);
	}
}