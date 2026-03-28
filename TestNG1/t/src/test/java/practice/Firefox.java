package practice;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class Firefox {
	
		@Test
		public void firefox() {
			WebDriver driver=new FirefoxDriver();
			driver.get("https://www.google.com/");
		}
}
