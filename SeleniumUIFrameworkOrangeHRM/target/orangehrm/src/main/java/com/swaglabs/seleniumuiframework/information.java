package com.swaglabs.seleniumuiframework;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class information {
 WebDriver driver;
public information(WebDriver driver) {
	this.driver=driver;
	PageFactory.initElements(driver,this);
}
@FindBy(name="firstName")
WebElement firstn;

@FindBy(name="lastName")
WebElement lastn;

@FindBy(name="postalCode")
WebElement postal;

@FindBy(name="continue")
WebElement con;

public void credentials(String fn,String ln,String post) {
	firstn.sendKeys(fn);
	lastn.sendKeys(ln);
	postal.sendKeys(post);
	con.click();
}
}
