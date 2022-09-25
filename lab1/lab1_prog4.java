/*215890102 
  frist n prime numbera*/
import java.util.Scanner;
import java.lang.Math;
class prime{
	static boolean prime(int n){
		boolean p=true;
		for(int i=2;i<=Math.sqrt(n);i++){
			if(n%i==0){
				p=false;
				break;
			}
		}
		return p;
	}
	public static void main(String args[]){
		Scanner o = new Scanner(System.in);
		int n;
		System.out.print("enter number:");
		n=o.nextInt();
		for(int i=2;i<n;i++){
			if(prime(i))
				System.out.print(i+" ");
		}
	}
} 