/*215890102
  Create a class time with methods assign,display,add,subtract and compare*/
import java.util.Scanner;
class time{
	int h,m,s;
	time(int hours,int minutes,int seconds){
		h=hours;
		m=minutes;
		s=seconds;
	}
	void display(){
		System.out.println(h+":"+m+":"+s);
		return;	
	}
	time sub(time ob){
		time diff=new time(0,0,0);
		if((s-ob.s)<0){
			diff.m--;
			diff.s=(60+(s-ob.s));
		}
		else
			diff.s=s-ob.s;
		if((m-ob.m)<0){
			diff.h--;
			diff.m+=(60-(m-ob.m));
		}
		else
			diff.m+=m-ob.m;
		if((h-ob.h)<0)
			diff.h+=(24+(h-ob.h));
		else
			diff.h+=(h-ob.h);
		return diff;
	}
	time add(time ob){
		time sum=new time(0,0,0);
		if((s+ob.s)>=60){
			sum.m=1;
			sum.s=(s+ob.s)%60;
		}
		else
			sum.s=(s+ob.s);
		if((sum.m+m+ob.m)>=60){
			sum.h=1;
			sum.m=(sum.m+m+ob.m)%60;
		}
		else
			sum.m+=(m+ob.m);
		
		sum.h=(sum.h+h+ob.h)%24;
		return sum;
	}
	void comp(time ob){
		if((this.h==ob.h) && (this.m==ob.m) && (this.s==ob.s)){
			System.out.println("the two times are equal");
			return;
		}
		boolean b;
		b=(this.h>ob.h?this.m>ob.m?this.s>ob.s?true:false:false:false);
		if(b)
			System.out.println("the first time is greater");
		else 
			System.out.println("the first time is lesser");
	}
}

class main{
	public static void main(String args[]){
		Scanner o=new Scanner(System.in);
		System.out.print("enter time 1:");
		int h=o.nextInt();
		int m=o.nextInt();
		int s=o.nextInt();
		time ob1=new time(h,m,s);
		System.out.print("enter time 2:");
		h=o.nextInt();
		m=o.nextInt();
		s=o.nextInt();
		time ob2=new time(h,m,s);
		time ob3;
		ob3=ob1.add(ob2);
		ob3.display();
		ob3=ob1.sub(ob2);
		ob3.display();
		ob1.comp(ob2);	
	}
}










			