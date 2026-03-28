package webdrivermethods;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class learninggetmethod {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		
		//launching the browser
WebDriver driver=new ChromeDriver();


// navigating the youtube
driver.get("https://www.youtube.com");
	
// fetching the title of the web page
Thread.sleep(2000);
//String title=driver.getTitle();
//System.out.println(title);
System.out.println(driver.getTitle());

//fetching the url of the current web page
	System.out.println(driver.getCurrentUrl());
	
//fetching the sourcecode of the page
	
	System.out.println(driver.getPageSource());
	
	//closing the driver controlled window
driver.close();

//

	
	}

}
