package javapractice;

public class Employee {
	
	String name;
	String eid;
	String[] Emp_details;
	
	public Employee (String name,String eid){
		this.name=name;
		this.eid=eid;
		Emp_details=new String[]{name,eid};
	}
	
	public static void EmployeeDetails(Employee[] a) {
		for(int i=0;i<=a.length-1;i++) {
			System.out.println(a[i].name+"-"+a[i].eid);
		}
	}
	
}
