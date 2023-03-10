package basicJavaPrograms;
public class Emp {
	public static void main(String[] args) {
		int alpha=65;
		int num=1;
		int rowCount=5;
		int colCount=5;
		for(int i=1;i<=rowCount;i++) {
			for(int j=1;j<=colCount+1-i;j++) {
				if(i%2==1 && (j==1||j==(colCount+1-i))) {
					System.out.print((char)alpha++ +" ");
				}
				else if((i%2==0 && (j==1||j==(colCount+1-i)))) {
					System.out.print(num++ +" ");
				}
				else {
					System.out.print("*"+" ");
				}
			}
			System.out.println();
		}
		
	}	
}
