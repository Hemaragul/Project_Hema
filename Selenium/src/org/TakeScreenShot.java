package org;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TakeScreenShot {
	public static void main(String[] args) throws IOException {
		
		System.setProperty("webdriver.chrome.driver", "./Driver/chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://www.facebook.com/");
		
		TakesScreenshot tk = (TakesScreenshot)driver;
		
		File temp = tk.getScreenshotAs(OutputType.FILE);
		
		File perm = new File("./Screen/Facebook.png");
		
		FileUtils.copyFile(temp, perm);
		
		System.out.println("Done");
	}

}
