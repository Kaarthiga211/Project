package com.orangehrm.seleniumframework.my_info;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class MyInfoTest {
@Test
public void login() throws InterruptedException {
	WebDriver driver=new ChromeDriver();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	//login
	driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
	driver.findElement(By.name("username")).sendKeys("Admin");
	driver.findElement(By.name("password")).sendKeys("admin123");
	driver.findElement(By.cssSelector("[class=\"oxd-button oxd-button--medium oxd-button--main orangehrm-login-button\"]")).click();
	//myinfo
	driver.findElement(By.linkText("My Info")).click();
	//firstname
	Thread.sleep(5000);
	WebElement fn=driver.findElement(By.name("firstName"));
fn.sendKeys(Keys.CONTROL+"a",Keys.BACK_SPACE);
fn.sendKeys("My name");
}
}
