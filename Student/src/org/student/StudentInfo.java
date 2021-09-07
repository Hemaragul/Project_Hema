package org.student;

import java.util.Scanner;

public class StudentInfo {
	
public static void main(String[] args) {
		
		Scanner objsinfo= new Scanner(System.in);
		
		System.out.println("Type your Id :");
		long id = objsinfo.nextLong();
		objsinfo.nextLine();	
		System.out.println("Type your Name :");
		String name = objsinfo.nextLine();
		objsinfo.nextLine();	
		System.out.println("Type your Email :");
		String email = objsinfo.nextLine();
		
		System.out.println("Type your Phoneno :");
		long phone = objsinfo.nextLong();
		objsinfo.nextLine();
		System.out.println("Type your Department :");
		String depart = objsinfo.nextLine();
		
		System.out.println("Type your Gender :");
		String gender = objsinfo.next();
		objsinfo.nextLine();	
		System.out.println("Type your City :");
		String city = objsinfo.nextLine();	
		
		System.out.println("Id :"+id);
		System.out.println("Name :"+name);
		System.out.println("Email :"+email);
		System.out.println("Phoneno :"+phone);
		System.out.println("Department :"+depart);
		System.out.println("Gender :"+gender);
		System.out.println("City :"+city);
}
}
