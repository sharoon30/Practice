package finalMock;

public class Emp {
	Emp(){
		System.out.println("123");
	}
	Emp(int a){
		System.out.println("987459");
	}
	Emp(String s1){
		System.out.println(s1);
	}
	public static void main(String[]args) {
		Emp e1 = new Emp();
		Emp e2= new Emp(9);
		Emp e3 = new Emp("megha");
		
		
		
	}
}
