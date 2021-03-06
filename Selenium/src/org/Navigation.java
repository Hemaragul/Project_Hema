package org;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Navigation {
	public static void main(String[] args) throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver", "./Driver/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.navigate().to("https://en-gb.facebook.com");
		driver.manage().window().maximize();
		/*Thread.sleep(3000);
		driver.navigate().back();
		Thread.sleep(3000);
		driver.navigate().forward();
		Thread.sleep(3000);
		driver.navigate().refresh();*/
		
		WebElement username = driver.findElement(By.id("email"));
		boolean d = username.isDisplayed();
		System.out.println("Visibility:"+d);
		
		WebElement loginBtn = driver.findElement(By.name("login"));
		boolean e = loginBtn.isEnabled();
		System.out.println("Enable :"+e);
		
		WebElement create = driver.findElement(By.xpath("//a[text()='Create New Account']"));
		create.click();
		Thread.sleep(3000);
		WebElement radio = driver.findElement(By.xpath("//input[@value='1']"));
		boolean s1= radio.isSelected();
		System.out.println("Before:"+s1);
		radio.click();
		boolean s2= radio.isSelected();
		System.out.println("After:"+s2);	
		
	}

}
