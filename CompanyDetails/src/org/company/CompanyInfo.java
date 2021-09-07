package org.company;

public class CompanyInfo {
	
	private void companyName() {
		System.out.println("Name : Tata Consultancy Services");
	}
	
	private void companyName(String x) {
		System.out.println(x);
	}
	private void companyId() {
		System.out.println("ID : 67534XD890");
	}
	private void companyAddress() {
		System.out.println("Address : 24, Kumaran Nagar, \nOld Mahabalipuram Rd, TNHB,\n Sholinganallur, Chennai 6001190.");
	}
	public static void main(String[] args) {
		
		CompanyInfo objcompdetail = new CompanyInfo();
		System.out.println("Company Details");
		System.out.println("");
		//Overloaded the method companyname
		objcompdetail.companyName();
		objcompdetail.companyName("CTS");
		
		System.out.println("");
		objcompdetail.companyId();
		System.out.println("");
		objcompdetail.companyAddress();
	}
}

