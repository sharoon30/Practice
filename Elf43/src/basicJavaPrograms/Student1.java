package basicJavaPrograms;
public class Student1{
	static {
		System.out.println(1);
	}
	static {
		System.out.println(2);
	}
	Student1(){
		System.out.println(3);
	}
	Student1(int a){
		System.out.println(4);
	}
	{
		System.out.println(5);
	}
	{
		System.out.println(6);
	}
	{
		System.out.println(7);
	}
	static {
		System.out.println(8);
	}
	public static void main(String[] args) {
		System.out.println(9);
		Student1 s1=new Student1();
		System.out.println(10);
	}
}