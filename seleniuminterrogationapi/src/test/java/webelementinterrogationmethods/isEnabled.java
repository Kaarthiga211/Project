package webelementinterrogationmethods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class isEnabled {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		WebDriver driver = new ChromeDriver();
	
		driver.get("https://www.shoppersstack.com/products_page/34");
		Thread.sleep(9000);//driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));->it is also one method for execution 
		WebElement checkbtn = driver.findElement(By.id("Check"));
		System.out.println("is checkbtn enabled: "+checkbtn.isEnabled());

	}

}
