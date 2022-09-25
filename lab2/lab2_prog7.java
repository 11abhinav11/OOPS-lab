/*215890102
  sum of diagonal elements*/
import java.util.Scanner;
class sum{
	public static void main(String args[]){
		Scanner o=new Scanner(System.in);
		System.out.print("enter size of array nxm:");
		int n=o.nextInt();
		int m=o.nextInt();
		int arr[][]=new int[n][m];
		System.out.println("enter elements of array");
		for(int i=0;i<n;i++){
			for(int j=0;j<m;j++){
				arr[i][j]=o.nextInt();
			}
		}
		int sum=0;
		for(int i=0;i<n;i++){
			for(int j=0;j<m;j++){
				if(i==j){
					sum+=arr[i][j];
					System.out.print(arr[i][j]+" ");
				}
			}
		}
		System.out.println("the sum of diagonal elements is "+sum);
	}
}