package PIM;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class PIM2 {
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
		driver.findElement(By.cssSelector("[class='oxd-topbar-body-nav-tab --parent']")).click();
driver.findElement(By.linkText("Termination Reasons")).click();
	
driver.findElement(By.cssSelector("[class='oxd-button oxd-button--medium oxd-button--secondary']")).click();
driver.findElement(By.xpath("//label[.='Name']/../..//input[@class='oxd-input oxd-input--active']")).sendKeys("kaarthiyan");	
driver.findElement(By.cssSelector("[class='oxd-button oxd-button--medium oxd-button--secondary orangehrm-left-space']")).click();

	
	}
	@Test(priority=2,dependsOnMethods="login")
	public void logout() {
	driver.findElement(By.cssSelector("[class='oxd-userdropdown-tab']")).click();
	driver.findElement(By.xpath("//a[.='Logout']")).click();
	}
}
