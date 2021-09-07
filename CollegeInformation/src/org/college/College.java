package org.college;

public class College extends Dept {
	private void collegeName() {
		System.out.println("psvpce");
	}
	
	private void collegeCode() {
		System.out.println("123456");
	}
	
	private void collegeRank() {
		System.out.println("rank no : 3");
	}

	public static void main(String args[])
	{
		College objcol = new College();
		//Student objstud = new Student();
		//Dept objdept = new Dept();
		//Hostel objhos = new Hostel ();
		
		objcol.collegeName();
		objcol.collegeCode();
		
		objcol.collegeRank();
		objcol.studentName();
		objcol.studentId();
		objcol.studentName();
		objcol.deptName();
		objcol.hostelName();
	}
}
