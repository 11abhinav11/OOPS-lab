/*215890102
  Define a class Mixer with methods accept,display and mix*/
import java.util.Scanner;
class mixer{
	Scanner o=new Scanner(System.in);
	int n;
	int arr[]=new int[100];
	mixer(int a){
		n=a;
	}
	void accept(){
		for(int i=0;i<n;i++)
			this.arr[i]=o.nextInt();
	}
	void display(){
		for(int i=0;i<n;i++)
			System.out.print(arr[i]+" ");
	}
	mixer mix(mixer ob){
		mixer un=new mixer(this.n+ob.n);
		int unar[]=new int[100];
		int count=0,i=0,j=0;
		while(true){
			if(this.arr[i]==ob.arr[j]){
				unar[count]=this.arr[i];
				count++;
				i++;
				j++;
			}
			else if(this.arr[i]<ob.arr[j]){
				unar[count]=this.arr[i];
				count++;
				i++;
			}
			else if(this.arr[i]>ob.arr[j]){
				unar[count]=ob.arr[j];
				count++;
				j++;
			}

			if(i>=this.n){
				for(int k=j;k<ob.n;k++){
					unar[count]=ob.arr[k];
					count++;
				}
				break;
			}				
			if(j>=ob.n){ 
				for(int k=i;k<this.n;k++){
					unar[count]=this.arr[k];
					count++;
				}
				break;
			}
		}
		un.n=count;
		for(i=0;i<=count;i++)
			un.arr[i]=unar[i];
		return un;
	}
}
class main{
	public static void main(String args[]){
		Scanner o=new Scanner(System.in);
		System.out.print("enter size of array:");
		int n=o.nextInt();
		mixer ob1=new mixer(n);
		ob1.accept();
		System.out.print("enter size of array:");
		n=o.nextInt();
		mixer ob2=new mixer(n);
		ob2.accept();
		mixer m;
		m=ob1.mix(ob2);
		m.display();
	}
}
		
		