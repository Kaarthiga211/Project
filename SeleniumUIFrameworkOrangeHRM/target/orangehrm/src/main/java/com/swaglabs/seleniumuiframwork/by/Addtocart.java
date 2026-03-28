package com.swaglabs.seleniumuiframwork.by;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.asserts.SoftAssert;


public class Addtocart {
WebDriver driver;
public Addtocart(WebDriver driver) {
	this.driver=driver;
}

By add=By.cssSelector("[class='product_sort_container']");
By add1=By.id("add-to-cart-sauce-labs-onesie");
public void start() {
WebElement element =driver.findElement(add);
element.click();
element.sendKeys(Keys.ARROW_DOWN,Keys.ARROW_DOWN,Keys.ARROW_DOWN,Keys.ARROW_DOWN);
element.sendKeys(Keys.ENTER);
driver.findElement(add1).click();
}
public void stop() {
	
	SoftAssert ass =new SoftAssert();
	String a="Sauce Labs Onesie";
	String b="Sauce Labs Onesie1";
if(a.equals(b)) {
System.out.println("pass");
}
else {
	System.out.println("fail");
}
ass.assertAll();
}




}
