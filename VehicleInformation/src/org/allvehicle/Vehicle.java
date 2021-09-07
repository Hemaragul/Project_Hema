
package org.allvehicle;

import org.fourwheeler.FourWheeler;
import org.threewheeler.ThreeWheeler;
import org.twowheeler.TwoWheller;

public class Vehicle {
	
public void vehicleNecessary() {
		
		System.out.println("Following are the vehicles Necessary");
	}
 
public static void main(String[] args) {
	
	/*Vehicle v = new Vehicle();
	TwoWheller tw =new TwoWheller();
	ThreeWheeler thw = new ThreeWheeler();
	FourWheeler fw = new FourWheeler();
	v.vehicleNecessary();
	tw.bike();
	tw.cycle();
	thw.auto();
	fw.bus();
	fw.car();
	fw.lorry();*/
	
	for (int i =1;i<=4;i++)
	{		
		for (int j=1;j<=i;j++)
			{
			System.out.print(" ");	
			System.out.print(j);	
	}
		System.out.println();
	}
	System.out.println();
	for (int x =1;x<=4;x++)
	{	
		for (int y=1;y<=x;y++)
			{
			System.out.print(" ");	
			System.out.print('*');	
	}
		System.out.println();
	}
	System.out.println();
	for (int m=1;m<=4;m++)
	{		
		for (int n=m;n<=4;n++)
			{
			System.out.print(" ");	
			System.out.print('*');	
	}
		System.out.println();
	}
	System.out.println();
	for (int a =1;a<=4;a++)
	{	
		for (int b=1;b<=a;b++)
			{
			System.out.print(" ");	
			System.out.print(a);	
	}
		System.out.println();	
	}
		
	
}}














