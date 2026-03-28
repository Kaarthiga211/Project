package handlingchildpopup;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class childtab {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.amazon.in/");
		Thread.sleep(2000);
		driver.findElement(By.id("twotabsearchtextbox")).sendKeys("Laptop");
		driver.findElement(By.id("nav-search-submit-button")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//div[@data-index='3']")).click();
		Thread.sleep(2000);
		Set<String> allwindowid=driver.getWindowHandles();
		String parentid=driver.getWindowHandle();
		allwindowid.remove(parentid);
		for(String childid:allwindowid) {
			driver.switchTo().window(childid);
			}
		//WebElement addtocart=driver.findElement(By.xpath(""))
		
		
		
	}

}
