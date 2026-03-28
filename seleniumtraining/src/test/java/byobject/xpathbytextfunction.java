package byobject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class xpathbytextfunction {

	public static void main(String[] args)throws InterruptedException {
		// TODO Auto-generated method stub

		 WebDriver driver=new ChromeDriver();
		 
		 driver.get("https://demowebshop.tricentis.com/");
		 driver.manage().window().maximize();
		 Thread.sleep(2000);
		 
		 driver.findElement(By.xpath("//a[.='Register']")).click();
	
		 driver.get("https://demowebshop.tricentis.com/");
		 Thread.sleep(2000);
		 
		 driver.findElement(By.xpath("//a[.='Log in']")).click();
		 
		 driver.get("https://demowebshop.tricentis.com/");
		 Thread.sleep(2000);
		 
		 driver.findElement(By.xpath("//span[.='Shopping cart']")).click();
	
		 driver.get("https://demowebshop.tricentis.com/");
		 Thread.sleep(2000);
		 
		 driver.findElement(By.xpath("//span[.='Wishlist']")).click();
	
		 driver.get("https://demowebshop.tricentis.com/");
		 
		 Thread.sleep(2000);
		 
		 driver.findElement(By.xpath("//a[.='Search']")).click();
	

		 driver.quit();
		 
		 
		 
		 
	}

}
