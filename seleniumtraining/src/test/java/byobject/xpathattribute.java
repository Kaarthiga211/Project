package byobject;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
public class xpathattribute {

	public static void main(String[] args) throws InterruptedException{
	
		// TODO Auto-generated method stub
WebDriver driver=new ChromeDriver();

		//x[pathAttribute		

//		driver.get("https://www.amazon.com/");
//		Thread.sleep(2000);
//		
//		driver.findElement(By.xpath("//img[@alt='Cleaning Tools']")).click();
//		
		
//		
//		driver.get("https://github.com/");
//		Thread.sleep(2000);
//		
//		driver.findElement(By.xpath("//span[@data-target='qbsearch-input.inputButtonText']")).click();
//		driver.findElement(By.xpath("//span[@data-target='qbsearch-input.inputButtonText']")).sendKeys("Selenium");


//xpath by textfunction
	
//	driver.get("https://demoapps.qspiders.com/ui?scenario=1");
//	Thread.sleep(2000);
//	driver.findElement(By.xpath("//section[.='X Path']")).click();
//	Thread.sleep(2000);
//	driver.findElement(By.xpath("//section[.='Login 3.0']")).click();
//
	
	//xpath by contains
	

	driver.get("https://demowebshop.tricentis.com/");
	Thread.sleep(2000);
	driver.findElement(By.xpath("//a[contains(@class,'ico-cart')]")).click();
	Thread.sleep(2000);
	driver.findElement(By.xpath("//span[contains(.,'Shopping cart')]")).click();
//
//	
//	
//	
//	
//	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	}

}
