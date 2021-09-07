package org.lang;

public class StateDetails {

	private void southIndia() {
		System.out.println("TN, AP,KA, etc");
	}
	
	private void northIndia() {
		System.out.println("MP,UP, etc");
	}
	
public static void main(String[] args) {
	
	System.out.println("states :");
	StateDetails objstate = new StateDetails();
	objstate.southIndia();
	objstate.northIndia();
	
	System.out.println("Languages");
	LanguageInfo objlang = new LanguageInfo();
	objlang.englishLanguage();
	objlang.tamilLanguage();
	objlang.hindiLanguage();
	
}
}
