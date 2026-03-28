package com.swaglabs.seleniumuiframework;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class checkout {
	WebDriver driver;
public checkout(WebDriver driver) {
	this.driver=driver;
	PageFactory.initElements(driver,this);
}
@FindBy(css="[class='shopping_cart_badge']")
private WebElement addtocartly;

@FindBy(id="checkout")
private WebElement checkout;
public WebElement getAddtocartly() {
	return addtocartly;
}

public void clickAddtocartly() {
	getAddtocartly().click();
	}

public WebElement getCheckout() {
	return checkout;
}

public void clickCheckout() {
	getCheckout().click();
	}


}
