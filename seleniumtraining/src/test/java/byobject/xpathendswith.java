package byobject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class xpathendswith {

		

		public static void main(String[] args)throws InterruptedException {
			// TODO Auto-generated method stub

			WebDriver driver=new ChromeDriver();
			driver.get("");
			Thread.sleep(2000);
			driver.findElement(By.xpath("")).click();
			
			
			//It's rarely only used most of the cases not used
	}

}
