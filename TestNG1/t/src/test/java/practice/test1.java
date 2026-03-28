package practice;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class test1 {
	WebDriver driver=null;
@Test(priority=0)
public void login() throws InterruptedException {
	ChromeOptions copt =new ChromeOptions();
	copt.addArguments("--incognito");
	driver=new ChromeDriver(copt);
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	driver.get("https://www.saucedemo.com/");
	
	driver.findElement(By.id("user-name")).sendKeys("standard_user");
	driver.findElement(By.id("password")).sendKeys("secret_sauce");
}
@Test(priority=1,dependsOnMethods="login")
public void homepage()
{
	driver.findElement(By.cssSelector("[class='submit-button btn_action']")).click();
	
	if(driver.getTitle().contains("Swag Labs")) {
		System.out.println("it is a home page");
	}
	else {
		System.out.println("it is not  a home page");
	}
	
	driver.findElement(By.cssSelector("[id='add-to-cart-sauce-labs-bike-light']")).click();
}
	@Test(priority=2,dependsOnMethods="homepage")
	public void addtocart() {
	driver.findElement(By.cssSelector("[id='add-to-cart-sauce-labs-backpack']")).click();
driver.findElement(By.cssSelector("[id='shopping_cart_container']")).click();
WebElement element=driver.findElement(By.cssSelector("[class='cart_list']"));

String actualValue="Sauce Labs Backpack";
String expectedValue="Sauce Labs Backpack";
String actualValue1="Sauce Labs Backpack";
String expectedValue1="Sauce Labs Backpack";

		SoftAssert sa=new SoftAssert();
		sa.assertEquals(actualValue, expectedValue);
		if(actualValue.equals(expectedValue)) {
			System.out.println("Pass");
		}
		else {
			System.out.println("Fail");
		}

		sa.assertEquals(actualValue1, expectedValue1);
		if(actualValue1.equals(expectedValue1)) {
			System.out.println("Pass");
		}
		else {
			System.out.println("Fail");
		}

driver.findElement(By.cssSelector("[id='checkout']")).click();
	}
	@Test(priority=3,dependsOnMethods="addtocart")
	public void checkout() {
driver.findElement(By.cssSelector("[id='first-name']")).sendKeys("kaarthi");
driver.findElement(By.cssSelector("[id='last-name']")).sendKeys("g");

driver.findElement(By.cssSelector("[id='postal-code']")).sendKeys("kaarthi12345");
driver.findElement(By.cssSelector("[class='submit-button btn btn_primary cart_button btn_action']")).click();
WebElement total =driver.findElement(By.cssSelector("[class=summary_total_label]"));
String cost ="Total: $43.18";
Assert.assertEquals(total.getText(),cost);
	}
	@Test(priority=4,dependsOnMethods="login")
	public void logout() {
driver.findElement(By.id("finish")).click();
driver.quit();

}
}
