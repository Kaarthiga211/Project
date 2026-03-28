package practice;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class fchrome {
@Test
public void chrome() {
	WebDriver driver=new ChromeDriver();
	driver.get("https://www.google.com/");
}

}
