package org.network;

public class Wifi {
	
	private void wifi()
	{
		System.out.println("Wifi details :");
	}
    public static void main(String[] args) {
		
    	Wifi w = new Wifi();
    	w.wifi();
    	
    	MobileData md=new MobileData();
    	md.mobiledata();
    	
    	Lan l = new Lan();
    	l.lan();
    	
    	Wireless wl = new Wireless();
    	wl.wireless();
	}
}
