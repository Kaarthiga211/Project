package ObjectRepository;

import org.openqa.selenium.By;

import org.openqa.selenium.WebDriver;

public class loginPage {
WebDriver driver;
public loginPage(WebDriver driver) {
	this.driver=driver;
}
	//username
	By username=By.id("user-name");
	//password
	By password=By.id("password");
	//login btn
	By loginBtn=By.id("login-button");
	
	
	//business logic(login action)
	public void enterurl(String Url) {
		driver.get(Url);;
	}
	
	
	
	public void entercredentials(String un,String pwd) {
		driver.findElement(username).sendKeys(un);
		driver.findElement(password).sendKeys(pwd);

	}
	
	public void clickLogin() {
		driver.findElement(loginBtn).click();
	}


	
	
}

