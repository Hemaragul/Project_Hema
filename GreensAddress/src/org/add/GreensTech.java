package org.add;

public class GreensTech {
	private void greensAdyar() {
		System.out.println("Greens Technologies Adyar");
		System.out.println("No.11, First Street,\r\n" + 
				"Padmanabha Nagar,Adyar,\r\n" + 
				"Chennai-600 020");
	}
    private void greensTambaram() {
    	System.out.println("Greens Technologies Tambaram");
    	System.out.println("No.1, Appa Rao colony,\r\n" + 
    			"Tambaram,Sanatorium,\r\n" + 
    			"Chennai - 600047");
    }
    private void greensVelacherry() {
    	System.out.println("Greens Technologies Velacherry");
    	System.out.println("No.149, 1C/1D,\r\n" + 
    			"1st Floor, IT Park,\r\n" + 
    			"Velacherry, Chennai - 600089.");
    }
    //overload concept
    private void greensOmr() {
		System.out.println("Greens Technologies OMR");
		System.out.println("1st Floor, Plot No. 19 &20,\r\n"+"American Advent Christian Layout, Perumbakkam,\r\n" + 
				"(next to OMR food street )\r\n" + 
				"Chennai - 600 100.");
	}
		private void greensOmr(int dno, String city) {
			System.out.println("Greens Technologies OMR");
			System.out.println("1st Floor, Plot No. "+dno+",American Advent Christian Layout, Perumbakkam,\r\n" +
					"(next to OMR food street )\r\n" 
					+city+" - 600 100.");
	}
    private void greensAnnanagar() {
    	System.out.println("Greens Technologies Annanagar");
    	System.out.println("No 12, Rajiv Gandhi Salai\r\n" + "Annanagar");
    }
    public static void main(String[] args) {
    	GreensTech objaddr=new GreensTech();
    	objaddr.greensOmr();
    	System.out.println("");
    	objaddr.greensOmr(34,"chennai");
    	System.out.println("");
    	objaddr.greensAdyar();
    	System.out.println("");
    	objaddr.greensTambaram();
    	System.out.println("");
    	objaddr.greensVelacherry();
    	System.out.println("");
    	objaddr.greensAnnanagar();
    }
}
