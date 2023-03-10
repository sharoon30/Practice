package basicJavaPrograms;

public class Te {
	public static void main(String[] args) {
		String s1="test yantra";
		String arr[]=s1.split(" ");
		String str="";
		for(String var : arr) {
			String dum="";
			for(int i=0;i<var.length();i++) {
				if(i==0) {
					String s2=""+var.charAt(i);
					dum=dum+s2.toUpperCase();
				}
				else {
					dum+=var.charAt(i);
				}
			}
			str=str+dum+" ";
		}
		System.out.println(str);
		
	}

}
