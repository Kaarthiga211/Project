package webdrivermethods;

import org.openqa.selenium.Point;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class getsetpositions {

	public static void main(String[] args)throws InterruptedException {
		// TODO Auto-generated method stub
WebDriver driver=new ChromeDriver();
//fetching the default position of the browser
System.out.println(driver.manage().window().getPosition());
//maximizing the window
driver.manage().window().maximize();
System.out.println(driver.manage().window().getPosition());
Thread.sleep(2000);
driver.manage().window().setPosition(new Point(100,100));
	
	Thread.sleep(2000);
driver.manage().window().setPosition(new Point(400,100));	
	
	}
}
