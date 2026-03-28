package PIM;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class PIM1 {
	WebDriver driver=null;
	@Test(priority=-1)
	public void login(){
		 driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		//login
		driver.findElement(By.name("username")).sendKeys("Admin");
		driver.findElement(By.name("password")).sendKeys("admin123");
		driver.findElement(By.cssSelector("[class=\"oxd-button oxd-button--medium oxd-button--main orangehrm-login-button\"]")).click();
	}
	@Test(priority=0,dependsOnMethods="login")
	public void PIM() throws InterruptedException {
		driver.findElement(By.xpath("//span[.='PIM']")).click();
		driver.findElement(By.cssSelector("[class='oxd-button oxd-button--medium oxd-button--secondary']")).click();
driver.findElement(By.cssSelector("[name='firstName']")).sendKeys("kani");
driver.findElement(By.cssSelector("[name='middleName']")).sendKeys("kani");
driver.findElement(By.cssSelector("[name='lastName']")).sendKeys("b");
WebElement element=driver.findElement(By.xpath("//label[.='Employee Id']/../..//input[@class='oxd-input oxd-input--active']"));
element.sendKeys(Keys.CONTROL+"a",Keys.BACK_SPACE);
element.sendKeys("12345");
Thread.sleep(2000);
driver.findElement(By.cssSelector("[class='oxd-switch-input oxd-switch-input--active --label-right']")).click();
driver.findElement(By.xpath("//label[.='Username']/../..//input[@class='oxd-input oxd-input--active']")).sendKeys("kaaniab");
driver.findElement(By.xpath("//label[.='Password']/../..//input[@type='password']")).sendKeys("kaarthi@73");	
driver.findElement(By.xpath("//label[.='Confirm Password']/../..//input[@type='password']")).sendKeys("kaarthi@73");	
	
driver.findElement(By.cssSelector("[class='oxd-button oxd-button--medium oxd-button--secondary orangehrm-left-space']")).click();	
	driver.findElement(By.linkText("Admin")).click();
	driver.findElement(By.xpath("//label[.='Username']/../..//input[@class='oxd-input oxd-input--active']")).sendKeys("kaniabc");
	WebElement element1=driver.findElement(By.xpath("//label[.='User Role']/../..//div[@class='oxd-select-text-input']"));
	Thread.sleep(5000);
	element1.sendKeys(Keys.ARROW_DOWN,Keys.ARROW_DOWN,Keys.ARROW_DOWN);
	element1.sendKeys(Keys.ENTER);
	WebElement element5=driver.findElement(By.xpath("//input[@placeholder='Type for hints...']"));
	element5.sendKeys("k");
	Thread.sleep(5000);
	element5.sendKeys(Keys.ARROW_DOWN,Keys.ARROW_DOWN);
	element5.sendKeys(Keys.ENTER);
	WebElement element3=driver.findElement(By.xpath("//label[.='Status']/../..//div[@class='oxd-select-text-input']"));
	Thread.sleep(5000);
	element3.sendKeys(Keys.ARROW_DOWN,Keys.ARROW_DOWN,Keys.ARROW_DOWN);
	element3.sendKeys(Keys.ENTER);
	driver.findElement(By.cssSelector("[class='oxd-button oxd-button--medium oxd-button--secondary orangehrm-left-space']")).click();
	WebElement element7=driver.findElement(By.xpath("//span[.='No Records Found']"));
	if(element7.isDisplayed()) {
	System.out.println("records are not found");	
	}
	else {
		System.out.println("records are found");
	}
	}
}
