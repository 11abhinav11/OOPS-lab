import java.util.Scanner;
class complex{
	double real;
	double img;
	complex(){
		System.out.println("default constructor");
		real=0;
		img=0;}
	complex(double real,double img){
		System.out.println("parameterized constructor");
		this.real=real;
		this.img=img;}
		
	void display() {
		System.out.println(real+"+"+img+"i");
		return;
	}
	complex add(complex ob){
		complex sum=new complex();
		sum.real=ob.real+real;
		sum.img=ob.img+img;
		return sum;
	}
	complex sub(complex ob){
		complex diff=new complex();
		diff.real=real-ob.real;
		diff.img=img-ob.img;
		return diff;
	}
	
}
class main{
	public static void main(String args[]) {
		Scanner o=new Scanner(System.in);
		System.out.print("enter a complex number:");
		double a=o.nextInt();
		double b=o.nextInt();
		complex ob1=new complex(a,b);
		ob1.display();
		complex ob2=new complex();
		ob2.display();
	}
}
