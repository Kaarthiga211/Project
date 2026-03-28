package Handlingauthenticationpopup;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Testcase {
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
WebDriver driver=new ChromeDriver();
driver.manage().window().maximize();
driver.get("https://www.naukri.com/registration/createAccount?othersrcp=22636");
Thread.sleep(2000);
driver.findElement(By.cssSelector("[data-val='exp']")).click();
driver.findElement(By.id("resumeUpload")).sendKeys("C:\\Users\\KARTHIGA\\Downloads\\jerry resume.pdf");
	Thread.sleep(2000);
	
	
	
	driver.quit();
	}
}
