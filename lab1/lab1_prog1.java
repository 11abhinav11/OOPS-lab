/*215890102
  maximum of three numbers */
import java.util.Scanner;  
class max{
	static int maximum(int a,int b,int c){
		int d;
		d=(a>b)?(a>c)?a:c:(b>c)?b:c;
		return d;
	}
	public static void main(String args[]){
		Scanner o = new Scanner(System.in);  
		int a,b,c;
		System.out.print("enter three numbers:");
		a=o.nextInt();
		b=o.nextInt();
		c=o.nextInt();
		int d;
		d=maximum(a,b,c);
		System.out.println("the maximum number is "+d);
	}
}
