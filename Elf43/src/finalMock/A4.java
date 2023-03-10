package finalMock;

public class A4 {
	public static void main(String[] args) {
		int rowCount = 7;
		int colCount  = rowCount;
		int mid = (colCount/2)+1;
		for(int i=1;i<=rowCount;i++) {
			for(int j=1;j<=colCount;j++) {
				if(j==1||j==colCount) {
					System.out.print("*"+" ");
				}
				else if(j<=mid && j==i){
					System.out.print("*"+" ");
				}
				else if(j==(colCount+1)-i  && j>=mid) {
					System.out.print("*"+" ");
				}
				else {
					System.out.print(" "+" ");
				}
			}
			System.out.println();
		}
	}

}
