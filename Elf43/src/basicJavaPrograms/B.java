package basicJavaPrograms;

import java.util.Scanner;
public class B {
	public static void main(String[] args) {
		int number = 1234;
		String s1=number+"";
		int key = 0;
		int i=0;
		int j=0;
		while(number>0) {
			key++;
			int reminder = number % 10;
			if(key==1 || key==s1.length() ) {
				i+=reminder;
			}
			else {
				j+=reminder;
			}
			number /=10;
		}
		if(i==j) {
			System.out.println("Xylem");
		}
		else {
			System.out.println("phloem");
		}	
	}
}