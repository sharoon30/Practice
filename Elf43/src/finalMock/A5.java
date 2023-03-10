package finalMock;
import java.util.Collection;
import java.util.HashMap;
import java.util.Set;
public class A5 {
	public static void main(String[] args) {
		String value = "hi";
		HashMap h1 = new HashMap();
		h1.put(1, "hi");
		h1.put(2, "bye");
		h1.put(3, "hi");
		h1.put(4, "tar");
		h1.put(5, "hi");
		h1.put(6, "hai");
		int count=0;
		Collection <String> col = h1.values();
		for(String val : col) {
			if(value.equals(val)) {
				count++;
			}
		}
		System.out.println(count);
	}
}
