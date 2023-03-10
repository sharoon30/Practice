package basicJavaPrograms;
import java.util.Scanner;
//program for Linear search
public class A4{
	public static void main(String[] args) {
		int a[]= {12,2,11,2,21};
		int check=2;
		boolean key=false;
		for(int i=0;i<a.length;i++) {
			if(a[i]==check) {
				key=true;
				break;
			}
		}
		if(key==true) {
			System.out.println("present");
		}
		else {
			System.out.println("not present");
		}	
	}
}