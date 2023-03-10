package finalMock;

import java.util.Collection;
import java.util.HashMap;
import java.util.Set;

public class F1 {
	
	public static void main(String[] args) {
		HashMap h1 = new HashMap();
		h1.put("hello", 1);
		h1.put(2, "hello");
		
		Set s1 = h1.keySet();
		for(Object o : s1) {
			System.out.println(o);
		}
		
		Collection c = h1.values();
		for(Object o : c) {
			System.out.println(o);
		}
		
		Set s = h1.entrySet();
		for(Object o : s) {
			System.out.println(o);
		}
		
	}

}
