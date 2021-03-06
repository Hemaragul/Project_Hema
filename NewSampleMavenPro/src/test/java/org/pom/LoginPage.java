package org.pom;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import orgBase.BaseClass;

public class LoginPage extends BaseClass{
	
	public LoginPage() {
		PageFactory.initElements(driver, this);
	}
	
  @FindBy(id="email")
  private WebElement txtUserName;
  @FindBy(name="pass")
  private WebElement txtPassword;
  @FindBy(name="login")
  private WebElement btnLogin;
  
public WebElement getTxtUserName() {
	return txtUserName;
}
public WebElement getTxtPassword() {
	return txtPassword;
}
public WebElement getBtnLogin() {
	return btnLogin;
}
  
}
