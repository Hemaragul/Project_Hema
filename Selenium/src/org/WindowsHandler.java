package org;

//import java.awt.AWTException;
//import java.awt.List;
//import java.awt.Robot;
//import java.awt.event.KeyEvent;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowsHandler {
	public static void main(String[] args)  {
		
	System.setProperty("webdriver.chrome.driver", "./Driver/chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://www.flipkart.com/");
	
	WebElement search = driver.findElement(By.name("q"));
	search.sendKeys("mobiles");
	/*Robot r = new Robot();
	r.keyPress(KeyEvent.VK_ENTER);
	r.keyRelease(KeyEvent.VK_ENTER);*/
	
	Set<String> all = driver.getWindowHandles();

	for(String x:all) {
		System.out.println(x);
	}
	List<String>l = new ArrayList<String>();
	l.addAll(all);
	driver.switchTo().window((String) l.get(1));
	System.out.println(driver.getTitle());
	
	
	//WebElement usernamectrl = driver.findElement(By.id("email"));
	//usernamectrl.sendKeys("Hemamalini");
	
	
}

}
