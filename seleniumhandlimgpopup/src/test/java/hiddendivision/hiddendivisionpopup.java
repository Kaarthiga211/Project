package hiddendivision;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class hiddendivisionpopup {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		ChromeOptions options=new ChromeOptions();
		options.addArguments("--disable-notification");
WebDriver driver=new ChromeDriver(options);
driver.manage().window().maximize();
driver.get("https://www.irctc.co.in/nget/train-search");
Thread.sleep(2000);
driver.findElement((By.xpath("//button[.='OK']"))).click();
driver.findElement(By.cssSelector("[class='ng-tns-c69-9 ui-inputtext ui-widget ui-state-default ui-corner-all ng-star-inserted']")).click();
//driver.findElement(By.xpath("//a[.='11']")).click();

driver.findElement(By.xpath("//div[@class='ui-datepicker-title ng-tns-c69-9']/following::a[.='30']")).click();
	
	}

}
