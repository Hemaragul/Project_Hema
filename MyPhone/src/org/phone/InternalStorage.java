package org.phone;

public class InternalStorage {
	
	private void ramSize() {
		System.out.println("16GB");
		
	}
	
	private void processorSpeed()
	{
		System.out.println("5GHz");
	}
	public static void main(String[] args) {
		
		InternalStorage i = new InternalStorage ();
		i.ramSize();
		i.processorSpeed();
		
		ExternalStorage e = new ExternalStorage();
		e.size();
		
	}

}
