package practice;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class test2 {
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
		driver.findElement(By.cssSelector("[class='submit-button btn_action']")).click();
	}
		@Test(priority=1,dependsOnMethods="login")
		public void homepage() throws InterruptedException {
WebElement element=driver.findElement(By.cssSelector("[class='product_sort_container']"));
element.click();
Thread.sleep(2000);
element.sendKeys(Keys.ARROW_DOWN,Keys.ARROW_DOWN);
element.sendKeys(Keys.ENTER);

driver.findElement(By.cssSelector("[id='add-to-cart-sauce-labs-onesie']")).click();
driver.findElement(By.cssSelector("[id='shopping_cart_container']")).click();
		}
		@Test(priority=2,dependsOnMethods="homepage")
		public void addtocart() {
String actualValue="Sauce Labs Onesie";

String expectedValue="Sauce Labs Onesie";


		SoftAssert sa=new SoftAssert();
		sa.assertEquals(actualValue, expectedValue);
		if(actualValue.equals(expectedValue)) {
			System.out.println("Pass");
		}
		else {
			System.out.println("Fail");
		}
	
		driver.findElement(By.cssSelector("[id='checkout']")).click();
driver.findElement(By.cssSelector("[id='first-name']")).sendKeys("kaarthi");
driver.findElement(By.cssSelector("[id='last-name']")).sendKeys("g");

driver.findElement(By.cssSelector("[id='postal-code']")).sendKeys("kaarthi12345");
driver.findElement(By.cssSelector("[class='submit-button btn btn_primary cart_button btn_action']")).click();
WebElement total =driver.findElement(By.cssSelector("[class=summary_total_label]"));
String cost ="Total: $7.99";
Assert.assertEquals(total.getText(),cost);
		}
		@Test(priority=4,dependsOnMethods="addtocart")
		public void logout() {
driver.findElement(By.id("react-burger-menu-btn")).click();
driver.findElement(By.id("logout_sidebar_link")).click();
driver.quit();
	
	}
}