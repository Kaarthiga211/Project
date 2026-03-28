package handlingchildpopup;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class childwwindowhandling {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver=new ChromeDriver();
		driver.get("https://demoapps.qspiders.com/ui/browser?sublist=0");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//h2[.='Laptop']/..//button")).click();
		
		String parentid=driver.getWindowHandle();
		System.out.println(parentid);
		Set<String> allwindowid=driver.getWindowHandles();
		System.out.println(allwindowid);
		
		allwindowid.remove(parentid);
		for(String childid:allwindowid) {
			driver.switchTo().window(childid);
			
		}
		
		WebElement addtocart=driver.findElement(By.xpath("//button[.='Add to Cart']"));
		addtocart.click();
		addtocart.click();
		Thread.sleep(2000);
		
 WebElement cartlogo=driver.findElement(By.xpath("//*[local-name()='svg']"));
 cartlogo.click();
 Thread.sleep(2000);
		WebElement shoppingcartlist=driver.findElement(By.tagName("h2"));
		
		if(shoppingcartlist.isDisplayed()) {
			System.out.println("Testcase is showed");
		}
		else {
			System.out.println("Testcase is not showed");
		}
		
		driver.close();
		
		
		
		
		
	}

}
