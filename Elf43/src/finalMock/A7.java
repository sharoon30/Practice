package finalMock;

import java.util.Scanner;
public class A7 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the rowSize");
		int rowsize = sc.nextInt();
		int arr[][]=new int[rowsize][];
		for(int i=0;i<arr.length;i++) {
			System.out.print("Enter the col size for "+i+" row");
			arr[i]=new int[sc.nextInt()];
			System.out.println("enter "+arr[i].length+" elements");
			for(int j=0;j<arr[i].length;j++) {
				arr[i][j]=sc.nextInt();
			}
		}
		for(int i=0;i<arr.length;i++) {
			for(int j=0;j<arr[i].length;j++) {
				System.out.print(arr[i][j]);
			}
			System.out.println();
		}
	}
}
