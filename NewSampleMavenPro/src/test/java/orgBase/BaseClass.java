package orgBase;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.support.ui.Select;
import org.pom.LoginPage;

public class BaseClass  {
	
	 public static  WebDriver driver ;
	//Browser Launch
	public static void browserLaunch(String browser)
	{
		if(browser.equals("Chrome"))
		{
		System.setProperty("webdriver.chrome.driver", "./Driver/chromedriver.exe");
		driver = new ChromeDriver();
	    }
		else if(browser.equals("Firefox")) {
			System.setProperty("webdriver.gecko.driver", "./Driver/geckodriver.exe");
			driver = new FirefoxDriver();
		}
		else  {
			System.setProperty("webdriver.ie.driver", "./Driver/IEDriverServer.exe");
			driver = new InternetExplorerDriver();
		}	
	}
	//Launc Url
	public static void launchUrl(String url) {
		driver.get(url);
		driver.manage().window().maximize();
	}
	
	public static String getTheTitle()
	{
	String title = driver.getTitle();
	System.out.println(title);
	return title;
	}
	
	public static void getTheUrl()
	{
		String url = driver.getCurrentUrl();
		System.out.println(url);
	}
	
	public static void fillTheTextBox(WebElement e,String value)
	{
		e.sendKeys(value);
	}
	
	public static void TakeScreenshot(String savelocation) throws IOException
	{
        TakesScreenshot tk = (TakesScreenshot)driver;
		File temp = tk.getScreenshotAs(OutputType.FILE);
		File perm = new File(savelocation);
		FileUtils.copyFile(temp, perm);
		System.out.println("Done");
	}
	public static void SingleSelectDdValue(WebElement e1,String v1) 
	{	
		Select s1 = new Select(e1);
		s1.selectByValue(v1);
		boolean mul = s1.isMultiple();
		System.out.println(mul);
	}
	
	public static void SingleSelectDdVisibleText(WebElement e2,String v2)
	{
		Select s2 = new Select(e2);
		s2.selectByVisibleText(v2);
		boolean mul = s2.isMultiple();
		System.out.println(mul);
	}
	
	public static void clickTheButton(WebElement x) {
	 x.click();
	}
	
	public static void quitBrowser(String quitmsg) {
		if(quitmsg.equals("close"));
		driver.quit();
	}
}
