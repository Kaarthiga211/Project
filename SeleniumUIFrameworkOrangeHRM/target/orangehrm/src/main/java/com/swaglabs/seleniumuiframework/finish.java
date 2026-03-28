package com.swaglabs.seleniumuiframework;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class finish {
 WebDriver driver;
public finish(WebDriver driver) {
	this.driver=driver;
	PageFactory.initElements(driver,this);
}
@FindBy(name="finish")
private WebElement finish;
public WebElement getFinish() {
	return finish;
}
public void clickFinish() {
	getFinish().click();
	driver.quit();
	}


}
