package org.edu;

public class Education extends Medicine {
	
	public void ug() {
		System.out.println("Undergraduate Courses");
	}
	
	public void pg() {
		System.out.println("Postgraduate Courses");
	}

	public static void main(String[] args) {
		Education e = new Education();
		e.ug();
		e.bed();
		e.bba();
		e.bsc();
		e.ba();
		e.bds();
		e.be();
		e.btech();
		e.pg();
		e.mbbs();
		e.physio();
	}
}
