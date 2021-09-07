package org.student;

import java.util.Scanner;

public class ScanStudent {
	
public static void main(String[] args) {
		
		Scanner sobj = new Scanner(System.in);
		
		System.out.println("Type your Id :");
		long id = sobj.nextLong();
		sobj.nextLine();	
		System.out.println("Type your Name :");
		String name = sobj.nextLine();
		
		
		System.out.println("Type your Mark 1 :");
		int m1 = sobj.nextInt();
		
		System.out.println("Type your Mark 2 :");
		int m2 = sobj.nextInt();
		
		System.out.println("Type your Mark 3 :");
		int m3 = sobj.nextInt();
		
		System.out.println("Type your Mark 4 :");
		int m4 = sobj.nextInt();
		
		System.out.println("Type your Mark 5 :");
		int m5 = sobj.nextInt();
		
		int total = m1+m2+m3+m4+m5;
		float avg = total/5;
		
		System.out.println("Id :"+id);
		System.out.println("Name :"+name);
		
		System.out.println("Total :"+total);
		System.out.println("Average :"+avg);
		
			}

}
