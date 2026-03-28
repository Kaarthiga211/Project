package handlingdroppdown;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class learningdeselectmethods {

		public static void main(String[] args) throws InterruptedException {
			// TODO Auto-generated method stub
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://demoapps.qspiders.com/ui/dropdown/multiSelect?sublist=1");
	Thread.sleep(2000);
	Select sel=new Select(driver.findElement(By.id("select-multiple-native")));
		
	sel.selectByVisibleText("Fjallraven - Foldsac...");
	sel.selectByVisibleText("Mens Casual Premium ...");
	sel.selectByVisibleText("Mens Cotton Jacket...");
    sel.selectByVisibleText("Mens Casual Slim Fit...");
    
    Thread.sleep(2000);
    //deselect by index
    sel.deselectByIndex(3);
    Thread.sleep(2000);
    
    //deselect by value
    sel.deselectByValue("Fjallraven - Foldsack No. 1 Backpack, Fits 15 Laptops");
    Thread.sleep(2000);
    
    //deselectByvisibletext
sel.deselectByVisibleText("Mens Casual Premium ...") ;
Thread.sleep(2000);


//deselectbycontainsvisibletext
sel.deSelectByContainsVisibleText("Mens Cotton Jacket...");  
 Thread.sleep(2000);
 
 driver.quit();

	
		}

}
