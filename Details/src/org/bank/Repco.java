package org.bank;

public class Repco extends Bank{

	private void repco() {
		System.out.println("Repco Bank :");
	}
	
	public static void main(String[] args) {
		
		Repco r = new Repco();
		r.repco();
		r.deposit();
		r.savings();
}
}