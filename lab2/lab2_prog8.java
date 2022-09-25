/*215890102
  symmetric matrix*/
import java.util.Scanner;
class symmetric{
	public static void main(String args[]){
		Scanner o=new Scanner(System.in);
		System.out.print("enter size of array:");
		int n=o.nextInt();
		int arr[][]=new int[n][n];
		System.out.println("enter elements of array");
		for(int i=0;i<n;i++){
			for(int j=0;j<n;j++){
				arr[i][j]=o.nextInt();
			}
		}
		boolean s=true;
		for(int i=0;i<n;i++){
			for(int j=0;j<n;j++){
				if(arr[i][j]!=arr[j][i]){
					s=false;
					break;
				}
			}
			if(!s) break;
		}
		if(s)
			System.out.println("the matrix is symmetric");
		else
			System.out.println("the matrix is not symmetric");
	}
}