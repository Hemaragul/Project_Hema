package org.bike;

public class ktm implements Bike{
	
	@Override
	public void cost() {
		System.out.println("Cost");
	}
	@Override
	public void speed() {
		System.out.println("Speed");
	}

	public static void main(String[] args) {
		
		ktm obj = new ktm();
		obj.cost();
		obj.speed();
	}

}
