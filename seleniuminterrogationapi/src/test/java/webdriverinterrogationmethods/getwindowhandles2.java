package webdriverinterrogationmethods;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class getwindowhandles2 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
        driver.get("https://demowebshop.tricentis.com/");
        Thread.sleep(2000);

        // Get Parent Window ID
        String parent = driver.getWindowHandle();
        System.out.println(parent);

        // ----------------- FACEBOOK -----------------
        driver.findElement(By.xpath("//a[.='Facebook']")).click();
        Thread.sleep(2000);

        Set<String> windowsAfterFacebook = driver.getWindowHandles();

        String facebookID = "";
        for (String id : windowsAfterFacebook) {
            if (!id.equals(parent)) {
                facebookID = id;
            }
        }

        System.out.println("Facebook ID: " + facebookID);

        // ----------------- TWITTER -----------------
       // driver.switchTo().window(parent); // switch back to parent
        driver.findElement(By.xpath("//a[.='Twitter']")).click();
        Thread.sleep(2000);

        Set<String> windowsAfterTwitter = driver.getWindowHandles();

        String twitterID = "";
        for (String id : windowsAfterTwitter) {
            if (!id.equals(parent) && !id.equals(facebookID)) {
                twitterID = id;
            }
        }

        System.out.println("Twitter ID: " + twitterID);

        driver.quit();
	}

}
