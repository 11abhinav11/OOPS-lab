/*215890102
  find if year is a leap year*/
import java.util.Scanner;
class leapyear{
	static boolean leap(int y){
		if(y%4!=0)
			return false;
		else if(y%100!=0)
			return true;
		else if(y%400!=0)
			return false;
		else 
			return true;
	}
	public static void main(String args[]){
		Scanner o=new Scanner(System.in);
		int y;
		System.out.print("enter year:");
		y=o.nextInt();
		if(leap(y))
			System.out.println(y+" is a leap year");
		else
			System.out.println(y+" is a not leap year");
	}
}