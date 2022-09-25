/*215890102
  matrix sum and multiplication*/
import java.util.Scanner;
class matrix{
	public static void main(String args[]){
		Scanner o=new Scanner(System.in);
		System.out.print("enter size of matrix 1:");
		int n=o.nextInt();
		int m=o.nextInt();
		int a[][]=new int[n][m];
		System.out.println("enter elements of matrix");
		for(int i=0;i<n;i++){
			for(int j=0;j<m;j++){
				a[i][j]=o.nextInt();
			}
		}
		System.out.print("enter size of matrix 2:");
		int x=o.nextInt();
		int y=o.nextInt();
		int b[][]=new int[x][y];
		System.out.println("enter elements of matrix");
		for(int i=0;i<x;i++){
			for(int j=0;j<y;j++){
				b[i][j]=o.nextInt();
			}
		}
		if(n==x && m==y){
			for(int i=0;i<n;i++){
				for(int j=0;j<m;j++){
					System.out.print(a[i][j]+b[i][j]+" ");
				}
				System.out.println("");
			}
		}
		int c[][]=new int[n][y];
		if(m==x){
			for(int i=0;i<n;i++){
				for(int j=0;j<y;j++){
					c[i][j]=0;
					for(int k=0;k<m;k++)
						c[i][j]+=a[i][k]*b[k][j];
				}
			}
		}
		for(int i=0;i<n;i++){
			for(int j=0;j<y;j++){
				System.out.print(c[i][j]+" ");
			}
			System.out.println("");
		}
	}
}