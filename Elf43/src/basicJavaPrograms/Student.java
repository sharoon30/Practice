package basicJavaPrograms;

public class Student {
	String name;
	int roll;
	public static void main(String[] args) {
		Student s1=new Student();
		s1.name="shashank";
		s1.roll=101;
		Student s2=new Student();
		s2.name="Rani";
		s2.roll=201;
		Student s3=new Student();
		s3.name="Lokesh";
		s3.roll=301;
		System.out.println(s3.name+" "+s3.roll);
	}

}
