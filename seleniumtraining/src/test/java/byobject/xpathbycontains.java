package byobject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class xpathbycontains {

	public static void main(String[] args)throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver=new ChromeDriver();
		
		 driver.get("https://demoapps.qspiders.com/ui?scenario=1");
		 driver.manage().window().maximize();
		 Thread.sleep(2000);
		 driver.findElement(By.xpath("//a[contains(@href,'/ui/button')]")).click();
		 Thread.sleep(2000);
		 driver.findElement(By.xpath("//button[contains(.,'Yes')]")).click();
		 driver.get("https://demoapps.qspiders.com/ui?scenario=1");
		 driver.manage().window().maximize();
		 Thread.sleep(2000);
		 driver.findElement(By.xpath("//a[contains(@href,'/ui/button')]")).click();
		 Thread.sleep(2000);
		 driver.findElement(By.xpath("//button[contains(.,'No')]")).click();
		 
		 Thread.sleep(2000);
		 driver.get("https://demoapps.qspiders.com/ui?scenario=1");
		 driver.manage().window().maximize();
		 Thread.sleep(2000);
		 driver.findElement(By.xpath("//a[contains(@href,'/ui/checkbox')]")).click();
		 Thread.sleep(2000);
		 driver.findElement(By.xpath("//a[contains(.,'Selected')]")).click();
		 
		 Thread.sleep(2000);
		 driver.get("https://demoapps.qspiders.com/ui?scenario=1");
		 driver.manage().window().maximize();
		 Thread.sleep(2000);
		 driver.findElement(By.xpath("//a[contains(@href,'/ui/captcha')]")).click();
		 Thread.sleep(2000);
		 driver.findElement(By.xpath("//a[contains(.,'Numeric Captcha')]")).click();
		 
	 Thread.sleep(2000);
		 driver.get("https://demoapps.qspiders.com/ui?scenario=1");
		 driver.manage().window().maximize();
		 Thread.sleep(2000);
		 driver.findElement(By.xpath("//a[contains(@href,'/ui/captcha')]")).click();
		 Thread.sleep(2000);
		 driver.findElement(By.xpath("//a[contains(.,'Alphanumeric captcha')]")).click();
		 
		 
		 driver.quit();

	}

}
