package handlingchildpopup;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;

public class launchingwebtab {
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.wikipedia.org/");
		Thread.sleep(2000);
		
//triggering a new tab in the same browser window and parrallely		
		driver.switchTo().newWindow(WindowType.TAB);
		
		driver.get("https://github.com/");
	}
}
