package MyStringMethods;

public class Reverse {
	public static void main(String[] args) {
		String s1="i have 200 Apples";
		String arr[]=s1.split(" ");
		String s2="200";
		String rev="";
		for(int i=0;i<arr.length;i++) {
			if(arr[i].equals(s2)) {
				String r="";
				for(int j=arr[i].length()-1;j>=0;j--) {
					r+=arr[i].charAt(j);
				}
				rev+=r+" ";
			}else {
				rev+=arr[i]+" ";
			}
		}
		System.out.println(rev);

	}
}
