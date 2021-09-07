package org.bank;

public class SingleInheritBank extends SingleInheritAxis{
	
	private void savings1() {
		System.out.println("SB Account");
	}
	
	private void fixed1() {
		System.out.println("FD Account");
	}
	   @Override
	   public void deposit1() {
		   System.out.println("Deposit Amount is 20000");
	   }

	public static void main(String[] args) {
		
		SingleInheritBank objbank = new SingleInheritBank();
		
		objbank.savings1();
		objbank.fixed1();
		objbank.deposit1();
	}
	
	
}
