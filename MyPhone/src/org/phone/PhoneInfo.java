package org.phone;

public class PhoneInfo {
// Methods overload
	private void phoneinfo() {
		System.out.println("Galaxy 8");
	}
	
	private void phoneinfo(int mname) {
		System.out.println("Galaxy" +mname);
	}
	private void phoneinfo(String name,int mname) {
		System.out.println(name+mname);
	}
//private void phoneName() {
		//System.out.println("Name: Galaxy S8");
	//}
private void phoneMieiNum() {
	System.out.println("IMEI: 5335577743445");
	}
private void camera() {
	System.out.println("Camera: 12Mp");
}
private void storage() {
	System.out.println("Storage: 128Gb");
}
private void osName() {
	System.out.println("Os: Android");
}
public static void main (String[] args) {
	//object creation
	PhoneInfo objphone = new PhoneInfo();
	System.out.println("Phone Info");
	System.out.println("");
	
	objphone.phoneinfo();
	objphone.phoneinfo(11);
	objphone.phoneinfo("Galaxy",12);
	
	//objphone.phoneName();
	System.out.println("");
	objphone.phoneMieiNum();
	System.out.println("");
	objphone.camera();
	System.out.println("");
	objphone.storage();	
	System.out.println("");
	objphone.osName();
}
}
