package org;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.WebDriverWait;


public class Waits {
	
	//Waits
	// 1.Static Wait
	// 2.Dynamic Wait
	public static void main(String[] args) throws InterruptedException {
	WebDriver driver = new ChromeDriver();
	
	// Static Wait
	Thread.sleep(3000);
	
	//2.Dynamic Wait
	//Implicitly Wait
	//Explicitly Wait
	
	//Implicitly Wait
	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	
	//Explicitly Wait
	//a) Webdriver Wait
	//b) Fluent Wait
	
	//a.Wetbdriver Wait
	WebDriverWait w = new WebDriverWait(driver,10);
	WebElement loginbtn = w.until(ExpectedConditions.elementToBeClickable(By.name("login")));
	loginbtn.click();
	
	//b.Fluent Wait
	FluentWait<WebDriver> fw = new FluentWait<WebDriver>(driver);
	fw.withTimeout(Duration.ofMillis(2000)).pollingEvery(Duration.ofMillis(200))
	.ignoring(Throwable.class).until(ExpectedConditions.alertIsPresent());
	
	}
}
