package finalMock;

public class Constructor{
	public static void main(String[] args) {
		int arr[]= {41,42,43,44,45,46,47,48,49};
		int num=0;
		int j=0;
		for(int i=arr[0];i<arr[arr.length-1];i++) {
			try {
				if(i==arr[j++]) {
					continue;
				}
				else {
					num=i;
					break;
				}
			}
			catch(Exception e) {
				continue;
			}
		}
		System.out.println(num);
	}	
}



