package webdriverinterrogationmethods;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class titleverification {

	public static void main(String[] args)throws InterruptedException {
		// TODO Auto-generated method stub

		WebDriver driver=new ChromeDriver();
		driver.get("https://demowebshop.tricentis.com/");
		Thread.sleep(2000);
		String expectedtitle="Demo Web Shop";
		System.out.println(driver.getTitle());
		String title=driver.getTitle();
		if(title.equals(expectedtitle)) {
			System.out.println("The navigation is successfull");
		}
		
		else {
			System.out.println("Navigation Failed");
		}
		driver.quit();
		
		
	}

}
