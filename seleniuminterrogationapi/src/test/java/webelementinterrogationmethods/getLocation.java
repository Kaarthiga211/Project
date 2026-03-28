package webelementinterrogationmethods;

import org.openqa.selenium.Point;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class getLocation {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
        driver.get("https://www.flipkart.com/");
        Thread.sleep(2000);
        WebElement search=driver.findElement(By.name("q"));
        
        //fetching location
       Point loc=search.getLocation();
       
       System.out.println(loc);
       
       //Fetching x offset
       System.out.println(loc.getX());
       System.out.println(loc.x);
       
       //fetching y offset
       System.out.println(loc.getY());
       System.out.println(loc.y);
       driver.quit();
        
	}

}
