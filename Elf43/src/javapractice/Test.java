package javapractice;

import java.util.Scanner;

public class Test {

	public static void main(String[] args) {
		System.out.println("enter how many datas");
		Employee e[]=new Employee[10];
		for(int i=0;i<=e.length-1;i++) {
			e[i]=new Employee("Sharoon","1342");
		}
		
		Employee.EmployeeDetails(e);

	}

}
