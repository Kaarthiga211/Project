package webdriverinterrogationmethods;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class getwindowhandles {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demoapps.qspiders.com/ui/browser?sublist=0");
		Thread.sleep(2000);
		//fetching the window if of the parent window
String parentid=driver.getWindowHandle();
System.out.println("This is windoe id for the parent  id"+parentid);

driver.findElement(By.xpath("//h2[.='Watches']/..//button[.='view more']")).click();

Thread.sleep(2000);	

Set<String> windows=driver.getWindowHandles();

System.out.println("both parent and child window id"+windows);

windows.remove(parentid);

System.out.println("this is window id of the child"+windows);


//fetch the the child from set


for(String string:windows) {
	System.out.println(string);
}
		
	}

}
