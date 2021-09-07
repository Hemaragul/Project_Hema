package org.transport;

import org.air.Air;
import org.road.Road;
import org.water.Water;

public class Transport {
	
	private void transportform() {
		System.out.println("My Transport form is below :");
	}
public static void main(String[] args) {
	Transport t = new Transport();
	t.transportform();
	
	Air a = new Air();
	a.aeroplane();
	a.helicopter();
	
	Road r = new Road();
	r.bike();
	r.bus();
	r.cycle();
	r.car();
	
	Water w= new Water();
	w.ship();
	w.boat();
}
}
