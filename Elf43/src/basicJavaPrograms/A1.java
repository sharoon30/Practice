package basicJavaPrograms;

import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.Set;

public class A1 {
	public static void main(String[] args) {
		String s1="sharoon";
		char c[]=s1.toCharArray();
		LinkedHashSet<Character> s = new LinkedHashSet<Character>();
		for(char var : c) {
			s.add(var);
		}
		for(char var : s) {
			int count = 0;
			for(int i = 0 ; i<s1.length();i++) {
				char var2 = s1.charAt(i);
				if(var == var2) {
					count++;
				}
			}
			System.out.println(var + " "+ count);	
		}
	}
}