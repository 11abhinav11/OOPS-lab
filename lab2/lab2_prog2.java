/*215890102
  type casting*/
import java.util.Scanner;
class typecasting{
	public static void main(String args[]){
		Scanner o=new Scanner(System.in);
		System.out.print("enter integer:");
		int i=o.nextInt();
		System.out.print("enter double:");
		double d=o.nextDouble();
		System.out.print("enter character:");
		char c=o.next().charAt(0);
		System.out.println("integer converted to byte "+(byte)i);
		System.out.println("character converted to integer "+(int)c);
		System.out.println("double converted to byte "+(byte)d);
		System.out.println("double converted to integer "+(int)d);
	}
}