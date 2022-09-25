/*215890102
  Define a class complex with methods assign,display,add and subtract*/
import java.util.Scanner;
class complex{
	double real;
	double img;
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
		complex ob1=new complex();
		System.out.print("enter complex number 1:");
		ob1.real=o.nextDouble();
		ob1.img=o.nextDouble();
		complex ob2=new complex();
		System.out.print("enter complex number 2:");
		ob2.real=o.nextDouble();
		ob2.img=o.nextDouble();
		complex ob3=new complex();
		ob3=ob1.add(ob2);
		ob3.display();
		ob3=ob1.sub(ob2);
		ob3.display();
	}
}
