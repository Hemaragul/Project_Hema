package org.emp;

public class Employee {
	
  private void empId() {
	 System.out.println("Employee Id : 548755");
	}
  private void empId(int abc) {
		 //System.out.println("Employee Id : 548755");
		 int x = abc +1;
		 System.out.println(x);
		}
  private void empName() {
	  System.out.println("Employee Name : Hemamalini");
  }
  private void empDob() {
	  System.out.println("Employee DOB : 5-10-1991");
  }
  private void empPhone() {
	  System.out.println("Employee Phone : 9988776655");
  }
  private void empEmail() {
	  System.out.println("Employee Email :hema@gmail.com");
  }
  private void empAddress() {
	  System.out.println("Employee Address: No 1, SaiLakshmi Enclave, Chennai");
  }
  
  public static void main (String[] args) {
	  
	  //object creation
	  Employee empdetail = new Employee();
	  //calling Methods
	  empdetail.empId();
	  empdetail.empId(12);
	  empdetail.empName();
	  empdetail.empDob();
	  empdetail.empPhone();
	  empdetail.empEmail();
	  empdetail.empAddress();
}
}
