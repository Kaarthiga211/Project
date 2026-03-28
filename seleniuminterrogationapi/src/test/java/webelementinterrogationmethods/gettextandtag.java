package webelementinterrogationmethods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class gettextandtag {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
        driver.get("https://www.selenium.dev/");
        Thread.sleep(2000);
      WebElement aboutlink=  driver.findElement(By.id("navbarDropdown"));
      //Fetching the text
        System.out.println("Name of my link is:"+ aboutlink.getText());
   //Fetching the tagname
        System.out.println("Name of the tag is:"+ aboutlink.getTagName());

	}

}
