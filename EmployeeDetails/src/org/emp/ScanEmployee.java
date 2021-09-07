package org.emp;

import java.util.Scanner;

public class ScanEmployee {
/*empId
             empName
             empEmail
             empPhoneno
             empSalary
             empGender
             empCity*/
	
	public static void main(String[] args) {
		
		Scanner objempdet = new Scanner(System.in);
		
		System.out.println("Type your Id :");
		long id = objempdet.nextLong();
		objempdet.nextLine();	
		System.out.println("Type your Name :");
		String name = objempdet.nextLine();
		objempdet.nextLine();	
		System.out.println("Type your Email :");
		String email = objempdet.nextLine();
		
		System.out.println("Type your Phoneno :");
		long phone = objempdet.nextLong();
		
		System.out.println("Type your Salary :");
		int salary = objempdet.nextInt();
		
		System.out.println("Type your Gender :");
		String gender = objempdet.next();
		objempdet.nextLine();	
		System.out.println("Type your City :");
		String city = objempdet.nextLine();	
		
		System.out.println("Id :"+id);
		System.out.println("Name :"+name);
		System.out.println("Email :"+email);
		System.out.println("Phoneno :"+phone);
		System.out.println("Salary:"+salary);
		System.out.println("Gender :"+gender);
		System.out.println("City :"+city);
		
			}
}
