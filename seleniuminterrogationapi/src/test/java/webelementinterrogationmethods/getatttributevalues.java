package webelementinterrogationmethods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class getatttributevalues {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
        driver.get("https://demowebshop.tricentis.com/");
        Thread.sleep(2000);
        //Fetching search textfeild
        
        WebElement search=driver.findElement(By.id("small-searchterms"));
        
        
        //fetch attribute value for a static attribute
        System.out.println(search.getAttribute("id"));//cannot we change the id
        System.out.println(search.getDomAttribute("id"));
        System.out.println(search.getDomProperty("id"));
        Thread.sleep(2000);
       
        //fetch attribute value for a dynamic attribute

        System.out.println(search.getAttribute("value"));//whatever value it can be get
        System.out.println(search.getDomAttribute("value"));//default value
        System.out.println(search.getDomProperty("value"));//current value if not have current value it get default value
        
        Thread.sleep(2000);
        //typing the mobile to change the data of value attribute
        search.sendKeys("Mobile");

        System.out.println(search.getAttribute("value"));//can we  change the values
        System.out.println(search.getDomAttribute("value"));
        System.out.println(search.getDomProperty("value"));
        
        
        driver.quit();
	}

}
