package orgBase;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.pom.LoginPage;

public class ExecutionClass extends BaseClass {
	
	public static void main(String[] args) throws IOException, InterruptedException {
		
		browserLaunch("Chrome");
		launchUrl("https://en-gb.facebook.com/");
		
		//WebElement uname=driver.findElement(By.id("email"));
		//WebElement pwd=driver.findElement(By.id("pass"));
		//WebElement login=driver.findElement(By.name("login"));
		
		LoginPage l = new LoginPage();
		fillTheTextBox(l.getTxtUserName(),"Hema");
		fillTheTextBox(l.getTxtPassword(),"123456");
		driver.navigate().refresh();
		fillTheTextBox(l.getTxtUserName(),"Malini");
		
		/*WebElement createNewUser =driver.findElement(By.xpath("//a[text()='Create New Account']"));
		clickTheButton(createNewUser);
		Thread.sleep(3000);
		WebElement day = driver.findElement(By.id("day"));
		WebElement month = driver.findElement(By.name("birthday_month"));
		
		SingleSelectDdValue(day,"4");
		SingleSelectDdVisibleText(month,"Apr");
		
		String loc = "./Screen/CreateUser.png";
		TakeScreenshot(loc);*/
		
		getTheTitle();
		getTheUrl();
		//quitBrowser("close");
	}

}
