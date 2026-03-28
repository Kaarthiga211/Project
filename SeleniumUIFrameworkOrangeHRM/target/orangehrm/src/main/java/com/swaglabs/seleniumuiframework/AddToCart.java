package com.swaglabs.seleniumuiframework;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AddToCart {
WebDriver driver;
public AddToCart(WebDriver driver) {
	this.driver=driver;
	PageFactory.initElements(driver,this);
}
@FindBy(id="add-to-cart-sauce-labs-backpack")
private WebElement addtocart;

@FindBy(id="add-to-cart-sauce-labs-bike-light")
private WebElement addtocarts;


public WebElement getAddtocart() {
	return addtocart;
}

public void clickAddtocart() {
	getAddtocart().click();
}

public WebElement getAddtocarts() {
	return addtocarts;
}

public void clickAddtocarts() {
	getAddtocarts().click();
}



}
