/*215890102
  four-function calculator*/
import java.util.Scanner;
class calculator{
	public static void main(String args[]){
		Scanner o=new Scanner(System.in);
		char ans='y';
		do{
			System.out.print("Enter first number, operator, second number:");
			double a=o.nextInt();
			char c=o.next().charAt(0);
			double b=o.nextInt();
			switch(c){
				case '+':
					System.out.println(a+"+"+b+"="+(a+b));
					break;
				case '-':
					System.out.println(a+"-"+b+"="+(a-b));
					break;
				case '*':
					System.out.println(a+"*"+b+"="+(a*b));
					break;
				case '/':
					if(b!=0)
						System.out.println(a+"/"+b+"="+(a/b));
					else
						System.out.println("invalid input");
					break;
			}
			System.out.print("Do another (y/n)?");
			ans=o.next().charAt(0);
		}while(ans=='y');
	}
}