package com.swaglabs.seleniumuiframwork.by;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class checkout {
WebDriver driver;
public checkout(WebDriver driver) {
	this.driver=driver;
}
By click=By.className("shopping_cart_link");
By click1=By.id("checkout");

public void clicks() {
	driver.findElement(click).click();
	driver.findElement(click1).click();
}

}
