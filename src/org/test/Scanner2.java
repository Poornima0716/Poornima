package org.test;

import java.util.Scanner;

public class Scanner2 {
	public static void main(String[]args) {
			
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the empId");
		short empId = s.nextShort();
		System.out.println("Enter the empName");
		String empName = s.next();
		System.out.println("Enter the empEmail");
		String empEmail = s.next();
		System.out.println("Enter the empPhoneno");
		long empPhoneno = s.nextLong();
		System.out.println("Enter the empSalary");
		long empSalary = s.nextLong();
		System.out.println("Enter the empGender");
		String empGender = s.next();
		System.out.println("Enter the empCity");
		String empCity = s.next();
		
		System.out.println("EmpId is :"+empId);
		System.out.println("EmpName is:"+empName);
		System.out.println("EmpEmail is"+empEmail);
		System.out.println("EmpPhoneno is: "+empPhoneno);
		System.out.println("EmpSalary is: "+empSalary);
		System.out.println("EmpGender is:"+empGender);
		System.out.println("EmpCity is:"+empCity);
	}

}
