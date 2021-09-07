package org.bank;

public class Indian extends Bank{
	
	private void indian() {
		System.out.println("Indian Bank :");
	}
	
	public static void main(String[] args) {
		
		Indian i = new Indian();
		i.indian();
		i.deposit();
		i.savings();
	}

}
