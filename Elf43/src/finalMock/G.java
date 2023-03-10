package finalMock;

import java.util.Arrays;
import java.util.LinkedHashSet;

public class G {
	public static void main(String[] args) {
		LinkedHashSet<Integer> l1 = new LinkedHashSet();
		int a[]= {2,1,3,4,5,5,5,5};
		Arrays.sort(a);
		int b[]=new int[a.length];
		int k=0;
		for(int i=0;i<a.length-1 ;i++) {
			if(a[i]==a[i+1]) {
				System.out.println(a[i]);
			}
		}
		b[k]=a[a.length-1];
		for(int i=0;i<=k;i++) {
			System.out.println(b[i]);
		}
		
	}

}
