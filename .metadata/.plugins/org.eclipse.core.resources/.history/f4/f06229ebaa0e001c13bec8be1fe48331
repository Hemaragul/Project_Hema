package org;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Dropdown {
	
	public static void main(String[] args) throws Exception {
		
	System.setProperty("webdriver.chrome.driver", "./Driver/chromedriver.exe");
	
	WebDriver driver = new ChromeDriver();
	
	driver.manage().window().maximize();
	
	driver.get("https://en-gb.facebook.com/");
	
	driver.findElement(By.xpath("//a[text()='Create New Account']")).click();
	
	Thread.sleep(3000);
	
	WebElement day = driver.findElement(By.id("day"));
	Select s1 = new Select(day);
	s1.selectByValue("4");
	WebElement month = driver.findElement(By.name("birthday_month"));
	Select s2 = new Select(month);
	s2.selectByVisibleText("Apr");
	boolean mul = s1.isMultiple();
	System.out.println(mul);
}
}
