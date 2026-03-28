package Handlingfileuploadpopup;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class fileuploadpopup {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
WebDriver driver=new ChromeDriver();
driver.manage().window().maximize();
driver.get("https://demoapps.qspiders.com/ui/fileUpload?sublist=0");
	Thread.sleep(2000);
	//check input type is in file 
	driver.findElement(By.id("resume")).sendKeys("C:\\Users\\KARTHIGA\\Downloads\\Automation testing\\Interacting with Dropdown.pdf");
	Thread.sleep(2000);
	}

}
