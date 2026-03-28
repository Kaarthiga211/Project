package practice;
import java.time.Duration;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import org.testng.annotations.Test;


public class invocation {

		WebDriver driver=null;
	@Test(priority=0,invocationCount=3)
	public void login() throws InterruptedException {
		ChromeOptions copt =new ChromeOptions();
		copt.addArguments("--incognito");
		driver=new ChromeDriver(copt);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("https://www.saucedemo.com/");
		
		driver.findElement(By.id("user-name")).sendKeys("standard_user");
		driver.findElement(By.id("password")).sendKeys("secret_sauce");
		driver.findElement(By.cssSelector("[class='submit-button btn_action']")).click();
		driver.findElement(By.id("react-burger-menu-btn")).click();
		driver.findElement(By.id("logout_sidebar_link")).click();
	
	driver.quit();

	}
	}

