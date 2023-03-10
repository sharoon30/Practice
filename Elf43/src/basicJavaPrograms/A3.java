package basicJavaPrograms;

public class A3 {
	public static void main(String[] args) {
		int rowCount=8;
		int colCount=rowCount;
		int mid=(rowCount/2)-1;
		for(int i=1;i<=rowCount;i++) {
			for(int j=1;j<=colCount;j++) {
				if(i==1||i==rowCount) {
					System.out.print('*'+" ");
				}
				else if(j==1||j==rowCount) {
					System.out.print('*'+" ");
				}
				else if( (i>=mid && i<=(rowCount-mid)+1)&&(j>=(mid) && j<=(colCount-(mid-1)))){
					System.out.print('*'+" ");
				}
				else {
					System.out.print('#'+" ");
				}
			}
			System.out.println();
		}
		
		
		
	}
}