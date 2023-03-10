package finalMock;
public class A {
	public static void main(String[] args) {
		String s1="sumantha";
		String rev = "";
		String rev1 = "";
		for(int i=0;i<s1.length();i++) {
			char var = s1.charAt(i);
			int num=0;
			if(i>=s1.length()-4) {
				num=1;
			}
			else {
				num=2;
			}
			switch(num) {
			case 1:
				rev1 = var + rev1 ;
				break;
			case 2:
				rev = rev + var;
			}	
		}
		System.out.println(rev+rev1);	
	}
}
