/*215890102
  class bank account with methods to deposit,withdraw,display details 
and display rate of interest*/
import java.util.Scanner;
class account{
	String name;
	int anum;
	String atype;
	double amount;
	static int rate=7;
	account(){}
	account(String name,int anum,String atype,double amount){
		this.name=name;
		this.anum=anum;
		this.atype=atype;
		this. amount= amount;}
	void deposit(double num){
		this.amount+=num;
		System.out.println("account balance:"+this.amount);
		return;}
	void withdraw(double num){
		if(this.amount-num<0){
			System.out.println("insufficient funds");
			return;}
		this.amount-=num;
		System.out.println("account balance:"+this.amount);
		return;}
	void display(){
		System.out.println("name of account holder:"+this.name);
		System.out.println("account number:"+this.anum);
		System.out.println("type of account:"+this.atype);
		System.out.println("account balance:"+this.amount);
		System.out.println("Rate of interest:"+this.rate);
		return;}
	static void interest(){
		System.out.println("Interest Rate:"+rate);
		return;}
}
class main{
	public static void main(String args[]){
		Scanner o=new Scanner(System.in);
		System.out.print("enter name:");
		String name=o.nextLine();
		System.out.print("enter account type:");
		String atype=o.nextLine();
		System.out.print("enter account number:");
		int anum=o.nextInt();
		System.out.print("enter balance amount:");
		double amount=o.nextDouble();
		account ob1=new account(name,anum,atype,amount);
		ob1.deposit(2000);
		ob1.withdraw(500);
		ob1.display();
		account.interest();
		account ob2=new account();
		ob2.rate=12;
		System.out.println("the interest rate is "+ob1.rate);
	}
}
		