package practice;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class launchbrowser {
 public static void main(String[] args) {
	// WebDriver driver=new ChromeDriver();

	// WebDriver driver1=new EdgeDriver();

	 
	// WebDriver drive2r=new FirefoxDriver();
	 
	 
	 String browser="chrome";
	 WebDriver driver=null;
	 if(browser.contains("chrome")) {
		 driver=new ChromeDriver();
	 }
	 else if(browser.contains("firefox"))
	 {
		 driver=new FirefoxDriver();
		 
	 }
	 else if(browser.contains("firefox"))
	 {
		 driver=new EdgeDriver();
		 
	 }
 }
}
