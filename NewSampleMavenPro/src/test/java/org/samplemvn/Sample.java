package org.samplemvn;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Sample {

	public static void main(String[] args1) {
		System.setProperty("webdriver.chrome.driver", "./Driver/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		//driver.get("https://www.w3schools.com/html/tryit.asp?filename=tryhtml5_draganddrop");
		WebElement usernamectrl = driver.findElement(By.id("email"));
		usernamectrl.sendKeys("Hemamalini");
	}
		
}

