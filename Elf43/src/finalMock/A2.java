package finalMock;

import java.util.Scanner;

public class A2 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("ENTER A NUMBER");
		int rowCount = sc.nextInt();
		int colCount = rowCount;
		int mid = rowCount/2;
		int left=2;
		int right=rowCount-1;
		for(int i=1;i<=rowCount;i++) {
			int k=mid+2;
			for(int j=1;j<=colCount;j++) {
				if(i==1 || i==rowCount || j==1 || j==colCount ) {
					System.out.print('*'+" ");
				}
				else if(j==(k-i) || j==(mid+i)) {
					System.out.print('*'+" ");
				}
				else if((i>=k) && ((j==left)||j==right)) {
					System.out.print('*'+" ");	
				}
				else if(i==mid+1 && j==mid+1 ) {
					System.out.print('*'+" ");
				}
				else {
					System.out.print(' '+" ");
				}
			}
			if(i>=k) {
				left++;
				right--;
			}
			System.out.println();
		}   
	}
}