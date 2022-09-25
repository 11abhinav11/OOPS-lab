/*215890102
  create a stack for storing integers*/
import java.util.Scanner;
class stack{
	int arr[]=new int[1000];
	int top=-1,max_size;
	stack(int n){
		max_size=n;}
	void push(int data){
		if(top>max_size){
			System.out.println("stack overflow");
		 	return;
		}
		top++;
		arr[top]=data;
		return;
	}
	void pop(){
		if(top==-1){
			System.out.println("stack underflow");
			return;
		}
		top--;
		return;
	}
	void display(){
		for(int i=top;i>=0;i--)
			System.out.print(arr[i]+" ");
		System.out.println();
		return;
	}
}
class main{
	public static void main(String args[]){
	Scanner o=new Scanner(System.in);
	System.out.print("enter size of stack:");
	int n=o.nextInt();
	stack ob=new stack(n);
	System.out.println("1)push\n2)pop\n3)display\n4)exit");
	while(true){
		System.out.print("enter:");
		int c=o.nextInt();
		boolean x=false;
		switch(c){
			case 1:
				System.out.print("enter data:");
				int data=o.nextInt();
				ob.push(data);
				break;
			case 2:
				ob.pop();
				break;
			case 3:
				ob.display();
				break;
			case 4:
				x=true;
				break;
		}
		if(x) break;
	}
}
}




