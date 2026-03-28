package practice;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.Test;

public class edge {
		@Test
		public void edge1() {
			WebDriver driver=new EdgeDriver();
			driver.get("https://www.google.com/");
		}
}
