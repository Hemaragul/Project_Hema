package org.bank;

public class Axis extends Bank{
	
	private void axis() {
		System.out.println("Axis Bank :");
	}
	
	public static void main(String[] args) {
		
		Axis a = new Axis();
		a.axis();
		a.deposit();
		a.savings();
	}

}
