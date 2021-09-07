package org;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class sample {
	
	
	public static void main(String[] args) {
	//To configure chrome path
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\hemam\\Downloads\\chromedriver_win32\\chromedriver.exe");
		//System.setProperty("webdriver.chrome.driver", "./Driver/chromedriver.exe");
	
	    //To launch the browser
		WebDriver driver = new ChromeDriver();
		
		//To maximize the screen
		driver.manage().window().maximize();
		
		//To launch the url
		driver.get("https://www.annauniv.edu/");
		
		
		String title = driver.getTitle();
		System.out.println(title);
		
		String url = driver.getCurrentUrl();
		System.out.println(url);
		
		//To close the Browser
		driver.quit();
		
		
	}

}
