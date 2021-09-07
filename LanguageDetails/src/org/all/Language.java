package org.all;

import org.tamil.Tamil;

public class Language extends Tamil{
	
	private void languageclasses() {
		System.out.println("The following are about language classes.");
	}

	public static void main(String[] args) {
		
		Language l =new Language();
		l.languageclasses();
		l.englishlang();
		l.tamillang();
		l.telgulang();
	}
}
