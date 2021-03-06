package org;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Frames {
	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "./Driver/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://netbanking.hdfcbank.com/netbanking/");
		WebElement frame = driver.findElement(By.xpath("//frame[@name='login_page']"));
		driver.switchTo().frame(frame);
		
		WebElement custId = driver.findElement(By.xpath("//input[@name='fldLoginUserId']"));
		custId.sendKeys("504525532");
		WebElement continuebtn = driver.findElement(By.xpath("//a[@class='btn btn-primary login-btn']"));
		continuebtn.click();
	}

}
