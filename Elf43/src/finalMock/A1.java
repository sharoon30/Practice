package finalMock;

import java.util.LinkedHashMap;

public class A1 {
	static LinkedHashMap<String,Integer> l1=new LinkedHashMap<String,Integer>();
	public static void main(String[] args) {
		String s1[]= {"Apple","Mango","Banana"};
		String s2[]= {"Mango","Grapes","Pineapple"};
		String s3[]= {"Mango","Lichi","Mango"};
		String s[][]= {s1,s2,s3};
		int count=0;
		int count1=0;
		int count2=0;
		for(int i=0;i<s1.length;i++) {
			for(int j=0;j<s2.length;j++) {
				if(s1[i]==s1[j]) {
					count2++;
					System.out.println(count2);
				}
				if(s1[i]==s2[j]) {
					count++;
					System.out.println(count);
				}
				if(s1[i]==s3[j]) {
					count1++;
					System.out.println(count1);
				}
			}
			
		}
		System.out.println(count+" "+count1+" "+count2);
	}
}

