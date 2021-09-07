package org.edu;

public class Art extends Education {

	public void bsc1() {
		System.out.println("Bachelor of Science");
	}
	
	public void bed1() {
		System.out.println("Bachelor of Education");
	}
	
	public void ba1() {
		System.out.println("Bachelor of Arts");
	}
	
	public void bba1() {
		System.out.println("Bachelor of Business Administration");
	}
	@Override
	public void ug() {
		System.out.println("UG");
	}
	@Override
	public void pg() {
		System.out.println("PG");
	}
	public static void main(String[] args) {
		Art e = new Art();
		e.ug();
		e.bed();
		e.bba();
		e.bsc();
		e.ba();
		e.pg();
		
	}
}
