package handlingjavascriptpopup;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Conformationpopup {

		public static void main(String[] args) throws InterruptedException {
			// TODO Auto-generated method stub
			WebDriver driver=new ChromeDriver();
			driver.manage().window().maximize();
			driver.get("https://demo.automationtesting.in/Alerts.html");
			Thread.sleep(2000);
			driver.findElement(By.xpath("//a[.='Alert with OK & Cancel ']")).click();
			Thread.sleep(2000);
			driver.findElement(By.xpath("//button[@class='btn btn-primary']")).click();
			Thread.sleep(2000);
	Alert alt=	driver.switchTo().alert();
	System.out.println(alt.getText());
	alt.dismiss();
	
	//or 		driver.switchTo().alert().dismiss();
	
	}

}
