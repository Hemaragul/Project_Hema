package org.emp;

import org.client.Client;
import org.comp.Company;
import org.project.Project;

public class Employee {

	
	public void empName() {
		System.out.println(" Hemamalini");
	}
	
	public static void main (String args[])
	{
		Employee objemp = new Employee();
		Client objclient = new Client();
		Company objcomp = new Company();
		Project objpro = new Project();
		
		objemp.empName();
		objclient.clientName();
		objcomp.companyName();
		objpro.projectName();
	}
}