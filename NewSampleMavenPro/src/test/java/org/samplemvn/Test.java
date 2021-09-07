package org.samplemvn;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test {
	public static void main(String[] args1) {
		System.setProperty("webdriver.chrome.driver", "./Driver/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		
		WebElement usernamectrl = driver.findElement(By.id("email"));
		usernamectrl.sendKeys("Hemamalini");
		
		WebElement passwordctrl = driver.findElement(By.name("pass"));
		passwordctrl.sendKeys("123456");
		
		WebElement loginbtnctrl = driver.findElement(By.name("login"));
		loginbtnctrl.click();
		
		
	}

}
