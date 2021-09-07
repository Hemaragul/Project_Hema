package org.india;

import org.tamilnadu.TamilNadu;

public class India extends TamilNadu{
	
	private void india()
	{
		System.out.println("This is the country name INDIA.");
	}
	
	public static void main(String[] args) {
		India i = new India();
		i.india();
		i.tamilnadu();
		i.kerala();
		i.andrapradesh();
	}
}
