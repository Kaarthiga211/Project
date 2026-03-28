package com.selenium.UIFrameworkOrangeHRM;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
public class PimPage {
	
		public WebDriver driver;

		public PimPage(WebDriver driver){
			this.driver=driver;
			PageFactory.initElements(driver, this);
		}

		//Add - button
		@FindBy(xpath = "//button[normalize-space()='Add']")
		private WebElement add_btn;

		//Getters and setters of Add button
		public WebElement getAdd_btn() {
			return add_btn;
		}

		public void clickAdd_btn() {
			getAdd_btn().click();
		}
}
