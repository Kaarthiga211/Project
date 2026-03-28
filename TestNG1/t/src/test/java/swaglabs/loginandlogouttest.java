package swaglabs;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.Test;

public class loginandlogouttest {
	WebDriver driver=null;
@Test(invocationCount=5)
public void login() {
	ChromeOptions copt =new ChromeOptions();
	copt.addArguments("--incognito");
	copt.addArguments("--headless");//it run its way don't distrub the user

	driver=new ChromeDriver(copt);

driver.manage().window().maximize();
driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
driver.get("https://www.saucedemo.com/");	
driver.findElement(By.id("user-name")).sendKeys("standard_user");
driver.findElement(By.id("password")).sendKeys("secret_sauce");
driver.findElement(By.id("login-button")).click();
	driver.findElement(By.id("react-burger-menu-btn")).click();
	driver.findElement(By.id("logout_sidebar_link")).click();
	driver.quit();
}
}
