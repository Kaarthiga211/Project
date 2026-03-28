package webdrivermethods;

import org.openqa.selenium.Dimension;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class getandset {

	public static void main(String[] args)throws InterruptedException {
		// TODO Auto-generated method stub
WebDriver driver=new ChromeDriver();
System.out.println(driver.manage().window().getSize());
//Setting the size of the browser
//Dimension dim=new Dimension(1500,500);
driver.manage().window().setSize(new Dimension(1500,500));
System.out.println(driver.manage().window().getSize());
Thread.sleep(2000);
driver.quit();
	
	
	}

}
