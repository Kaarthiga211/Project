package com.selenium.UIFrameworkOrangeHRM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class vacancyPage {
WebDriver driver;
public vacancyPage(WebDriver driver) {
	PageFactory.initElements(driver,this);
}

@FindBy(css = "[class='oxd-button oxd-button--medium oxd-button--secondary']")
private WebElement click_btn;


public WebElement getClick_btn() {
	return click_btn;
}

public void clickClick_btn() {
	getClick_btn().click();
}








}

