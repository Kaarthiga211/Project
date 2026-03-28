package handlingchildpopup;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class testcase1 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demowebshop.tricentis.com/");
		Thread.sleep(2000);
		driver.findElement(By.cssSelector("[class='button-1 search-box-button']")).click();
		driver.switchTo().alert().accept();
	driver.findElement(By.cssSelector("[class='search-box-text ui-autocomplete-input']")).sendKeys("Computers");
	Thread.sleep(2000);	
	driver.findElement(By.cssSelector("[class='button-1 search-box-button']")).click();

	}

}
