package byobject;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class cssselector {

	public static void main(String[] args) throws InterruptedException{
		
		
		WebDriver driver=new ChromeDriver();

		
		driver.get("https://demowebshop.tricentis.com/");
		Thread.sleep(2000);
		
		driver.findElement(By.linkText("Facebook")).click();
		
		

		//By.name method
			driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
	//	
	   Thread.sleep(2000);
				
	//locating username textfeild
				
			driver.findElement(By.name("username")).sendKeys("Admin");
		 driver.findElement(By.name("password")).sendKeys("admin123");
		 
		 //css selector

		 driver.findElement(By.cssSelector("button[type='submit']")).click();

		
	}
}
