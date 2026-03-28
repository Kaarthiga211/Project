package com.swaglabs.seleniumuiframework;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
 WebDriver driver;
public LoginPage(WebDriver driver) {
	this.driver=driver;
	PageFactory.initElements(driver,this);
}
@FindBy(name="user-name")
private WebElement username;

@FindBy(name="password")
private WebElement password;


@FindBy(id="login-button")
private WebElement loginbtn;
public WebElement getUsername() {
	return username;
}


public void setUsername(String username) {
	getUsername().sendKeys(username);
}


public WebElement getPassword() {
	return password;
}


public void setPassword(String password) {
	getPassword().sendKeys(password);
}


public WebElement getLoginbtn() {
	return loginbtn;
}


public void clickLoginbtn() {
	getLoginbtn().click();
}

public void enterusername(String un) {
	setUsername(un);

}
public void enterpass(String pass) {
	setPassword(pass);
}




}
