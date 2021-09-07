package org.lang;


public class SingleInheritLangInfo extends SingleInheritStateDetails {
	
	private void tamilLanguage1() {
		System.out.println("Tamil");
	}
	private void hindiLanguage1() {
		System.out.println("Hindi");
	}
	private void englishLanguage1() {
		System.out.println("English");
		}
	
		public static void main(String[] args) {
			
			SingleInheritLangInfo objlang = new SingleInheritLangInfo();
			objlang.southIndia1();
			objlang.northIndia1();
			objlang.tamilLanguage1();
			objlang.englishLanguage1();
			objlang.hindiLanguage1();
			
		}
		

}
