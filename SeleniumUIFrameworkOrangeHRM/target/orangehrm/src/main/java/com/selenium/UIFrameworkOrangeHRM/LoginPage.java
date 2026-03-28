package com.selenium.UIFrameworkOrangeHRM;

import org.openqa.selenium.WebDriver;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
public class LoginPage {

	public WebDriver driver;

	public LoginPage(WebDriver driver){
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	//Textbox - username
	@FindBy(name = "username")
	private WebElement username;
	
	//Textbox - pwd
	@FindBy(name = "password")
	private WebElement password;
	
	//Submit - button
	@FindBy(xpath = "//button[@type='submit']")
	private WebElement login_btn;
	
	
	@FindBy(css="[class='oxd-userdropdown-tab']")
	private WebElement logout1;
	
	
	
	@FindBy(linkText="Logout")
    	private WebElement logout2;
	
	public WebElement getLogout2() {
		return logout2;
	}

	public void clickLogout2() {
		getLogout2().click();
	}

	public WebElement getLogout1() {
		return logout1;
	}

	public void clickLogout1() {
		getLogout1().click();
	}

	//Getters and setters of Username
	public WebElement getUsername() {
		return username;
	}

	public void setUsername(String valid_username) {
		getUsername().sendKeys(valid_username);
	}

	//Getters and setters of Password
	public WebElement getPassword() {
		return password;
	}

	public void setPassword(String valid_password) {
		getPassword().sendKeys(valid_password);
	}

	//Getters and setters of Login-button
	public WebElement getLogin_btn() {
		return login_btn;
	}

	public void clickLogin_btn() {
		getLogin_btn().click();
	}
	
	


	
	//Business logic of login
	public void login(String valid_uname, String valid_pwd) {
		setUsername(valid_uname);
		setPassword(valid_pwd);
		clickLogin_btn();
	}

	}

