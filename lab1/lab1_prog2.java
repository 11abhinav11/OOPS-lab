/*215890102
  roots of quadratic equations*/
import java.util.Scanner;
import java.lang.Math;
class quad{
	static void roots(double a,double b,double c){
		double d=b*b-4*a*c,x,y;
		switch((d>=0)?d==0?1:2:3){
			case 1:
				d=(-b/(2*a));
				System.out.println("the root is "+d);
				break;
			case 2:
				x=((-b+Math.sqrt(d))/(2*a));
				y=((-b-Math.sqrt(d))/(2*a));
				System.out.println("the roots are "+x+" and "+y);
				break;
			case 3:
				x=-b/(2*a);
				y=(Math.sqrt(-d))/(2*a);
				System.out.println("the roots are "+x+"+i"+y+" and "+x+"-i"+y);
				break;
		}
	}
	public static void main(String args[]){
		Scanner o = new Scanner(System.in);
		int a,b,c;
		System.out.print("enter a b and c:");
		a=o.nextInt();
		b=o.nextInt();
		c=o.nextInt();
		roots(a,b,c);
	}
}