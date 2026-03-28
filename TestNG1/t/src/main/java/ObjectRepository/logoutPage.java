package ObjectRepository;

import org.openqa.selenium.By;

import org.openqa.selenium.WebDriver;

public class logoutPage {
	WebDriver driver;
	public logoutPage(WebDriver driver) {
		this.driver=driver;
	}
	By logout1=By.id("react-burger-menu-btn");
	By logout2=By.id("logout_sidebar_link");
	
	public void logout() {
		driver.findElement(logout1).click();
		driver.findElement(logout2).click();
	}
}
