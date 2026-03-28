package webelementinterrogationmethods;

import   org.openqa.selenium.Dimension;    

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class getsize {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
        driver.get("https://www.amazon.com/");
        Thread.sleep(2000);
       WebElement searchbtn= driver.findElement(By.id("nav-search-submit-button"));
        Dimension dims=searchbtn.getSize();
        
        
        System.out.println("The dimensions of the search button"+dims);
        //fetching the height
        System.out.println(dims.getHeight());
        System.out.println(dims.height);
        
        //fetching the width
        System.out.println(dims.getWidth());
        System.out.println(dims.width);
        
        
        System.out.println(searchbtn.getCssValue("height"));
        
        System.out.println(searchbtn.getCssValue("width"));

        
        
        
        
        
	}

}
