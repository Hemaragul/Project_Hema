package org;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
public class ActionsWorking {

	//Actions and Robotclass working
	//username given, selecting un and rc copy and paste in pwd action is done
	//Special task given for Actions and Robot
	
	public static void main(String[] args1) throws AWTException  {
	System.setProperty("webdriver.chrome.driver", "./Driver/chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://www.facebook.com/");
	//driver.get("https://www.w3schools.com/html/tryit.asp?filename=tryhtml5_draganddrop");
	WebElement usernamectrl = driver.findElement(By.id("email"));
	usernamectrl.sendKeys("Hemamalini");
	WebElement passwordctrl = driver.findElement(By.name("pass"));
	
	Actions a = new Actions(driver);
	a.doubleClick(usernamectrl).perform();
	a.contextClick(usernamectrl).perform();
	Robot r = new Robot();
	for(int i=1;i<=6;i++) {
		
	r.keyPress(KeyEvent.VK_DOWN);
	r.keyRelease(KeyEvent.VK_DOWN);
	}
	r.keyPress(KeyEvent.VK_ENTER);
	r.keyRelease(KeyEvent.VK_ENTER);
	
	r.keyPress(KeyEvent.VK_TAB);
	r.keyRelease(KeyEvent.VK_TAB);
	
	a.contextClick(passwordctrl).perform();
	
	for(int i=1;i<=4;i++) {
	r.keyPress(KeyEvent.VK_DOWN);
	r.keyRelease(KeyEvent.VK_DOWN);
	}
	r.keyPress(KeyEvent.VK_ENTER);
	r.keyRelease(KeyEvent.VK_ENTER);
	
	WebElement loginbtnctrl = driver.findElement(By.name("login"));
	a.click(loginbtnctrl).perform();
	}
	
}
