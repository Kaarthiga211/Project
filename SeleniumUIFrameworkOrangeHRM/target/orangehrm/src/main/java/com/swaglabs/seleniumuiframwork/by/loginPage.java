package com.swaglabs.seleniumuiframwork.by;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class loginPage {
WebDriver driver;
public loginPage(WebDriver driver) {
	this.driver=driver;
}
By username=By.name("user-name");
By password=By.name("password");
By login=By.cssSelector("[id='login-button']");

public void entercredentials(String un,String pass) {
driver.findElement(username).sendKeys(un);
driver.findElement(password).sendKeys(pass);
driver.findElement(login).click();
}
}
