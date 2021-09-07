package org.company;

import org.si.client.SingleInheritClient;

public class SingleInheritCompany extends SingleInheritClient{
	
	
	private void companyName1() {
		System.out.println("Name : CTS");
	}
	
	public static void main(String[] args) {
		
		SingleInheritCompany objcomp = new SingleInheritCompany();
		
		objcomp.companyName1();
		objcomp.clientname();
	}
}
