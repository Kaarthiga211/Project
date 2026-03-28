package byobject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class xpathbyattribute {

	public static void main(String[] args)throws InterruptedException {
		// TODO Auto-generated method stub

	 WebDriver driver=new ChromeDriver();
	 
	 driver.get("https://www.amazon.in/");
	 driver.manage().window().maximize();
	 Thread.sleep(2000);
	 
	 driver.findElement(By.xpath("//div[@class='a-section a-spacing-none _Zmx1a_quadrantContainer_3TMqG _Zmx1a_leftQuadrant_21nVp']")).click();
Thread.sleep(2000);
driver.findElement(By.xpath("//li[@id='sobe_d_b_ms_7_2']")).click();
	 
	 
	 driver.get("https://www.amazon.in/");
	 Thread.sleep(2000);
	 
	 driver.findElement(By.xpath("//img[@alt='ACs']")).click();
	 
	 

	 driver.get("https://www.amazon.in/");
	 Thread.sleep(2000);
	 
	 driver.findElement(By.xpath("//img[@alt='Spooky Creative Starry Sky Ceramic Mug – Cute 3D Cat Design with Lid & Spoon, Perfect for Office, Breakfast, & Gifts –...']")).click();

	Thread.sleep(2000);
 driver.findElement(By.xpath("//img[@alt='BonZeal Ceramic Cat Mug Premium Coffee Mug Tea Cup Brown 360 ml Animal Theme Birthday Return Gifts for Kids Boys Girls Brothe']")).click();

// driver.quit();
	}

}
