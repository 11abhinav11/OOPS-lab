/*215890102
  multiplication and divition by 2 using bitwise operator*/
import java.util.Scanner;
class bit{
	public static void main(String args[]){
		Scanner o=new Scanner(System.in);
		System.out.print("enter a number:");
		int i=o.nextInt();
		System.out.println(i+"X2="+(i<<1));
		System.out.println(i+"/2="+(i>>1));
	}
}