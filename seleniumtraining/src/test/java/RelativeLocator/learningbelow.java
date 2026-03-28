package RelativeLocator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.locators.RelativeLocator;

public class learningbelow {

	public static void main(String[] args) throws InterruptedException{
		// TODO Auto-generated method stub
WebDriver driver=new ChromeDriver();
		
//		driver.get("https://demowebshop.tricentis.com/");
//		
//	Thread.sleep(2000);
//	WebElement search=driver.findElement(By.id("small-searchterms"));
//			search.sendKeys("computers");	
//			Thread.sleep(2000);
//		 driver.findElement(RelativeLocator.with(By.tagName("input")).toRightOf(search)).click();	
//	
//			driver.get("https://demowebshop.tricentis.com/");
//
//
//driver.get("https://demowebshop.tricentis.com/");
//
//WebElement search1=driver.findElement(By.name("NewsletterEmail"));
//search1.sendKeys("kaarthi@gmail.com");
//Thread.sleep(2000);
//driver.findElement(RelativeLocator.with(By.tagName("input")).below(search1)).click();		
//
//


driver.get("https://demo.automationtesting.in/Register.html");
//Thread.sleep(2000);
//
//driver.findElement(RelativeLocator.with(By.tagName("a")).toRightOf(By.linkText("WebTable"))).click();
WebElement firstname =driver.findElement(By.cssSelector("[placeholder='First Name']"));
driver.findElement(RelativeLocator.with(By.tagName("input")).near(firstname,100)).sendKeys("check");

	}

}
