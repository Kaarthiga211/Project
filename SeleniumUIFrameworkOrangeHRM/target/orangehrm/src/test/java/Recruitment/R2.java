package Recruitment;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class R2 {

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
	public void vacancy() throws InterruptedException {
		driver.findElement(By.linkText("Recruitment")).click();
		driver.findElement(By.linkText("Vacancies")).click();
		
		driver.findElement(By.cssSelector("[class='oxd-button oxd-button--medium oxd-button--secondary']")).click();
		driver.findElement(By.xpath("//label[.='Vacancy Name']/../..//input[@class='oxd-input oxd-input--active']")).sendKeys("Kaarthiseb");

		WebElement element4=driver.findElement(By.cssSelector("[class='oxd-select-text-input']"));
		//Actions act = new Actions(driver);
				//act.click(element4).pause(3000).keyDown(Keys.Down).keyDown(Keys.Enter).perform();
		Thread.sleep(2000);
		element4.sendKeys(Keys.ARROW_DOWN,Keys.ARROW_DOWN);
		element4.sendKeys(Keys.ENTER);
		driver.findElement(By.cssSelector("[class='oxd-textarea oxd-textarea--active oxd-textarea--resize-vertical']")).sendKeys("i am kaarthiga");
	   
		WebElement element5=driver.findElement(By.xpath("//input[@placeholder='Type for hints...']"));
		element5.sendKeys("a");
		Thread.sleep(5000);
		element5.sendKeys(Keys.ARROW_DOWN,Keys.ARROW_DOWN);
		element5.sendKeys(Keys.ENTER);
		driver.findElement(By.xpath("//label[.='Number of Positions']/../..//input[@class='oxd-input oxd-input--active']")).sendKeys("3");
		Thread.sleep(2000);
	    driver.findElement(By.xpath("//button[@class='oxd-button oxd-button--medium oxd-button--secondary orangehrm-left-space']")).click();
	
	}
	}
