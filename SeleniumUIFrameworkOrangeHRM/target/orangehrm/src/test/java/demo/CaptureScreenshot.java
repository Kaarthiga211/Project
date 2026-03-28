package demo;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;
import org.testng.annotations.Test;

import com.orangehrm.selleniumuiframework.genericutility.ScreenshotUtility;
import com.orangehrm.selleniumuiframework.genericutility.WebDriverUtility;
import com.selenium.UIFrameworkOrangeHRM.DashboardPage;
import com.selenium.UIFrameworkOrangeHRM.LoginPage;

public class CaptureScreenshot {
@Test(invocationCount=2)
public void screenshot() throws IOException, InterruptedException {
	WebDriver driver=new ChromeDriver();
	
	WebDriverUtility wu=new WebDriverUtility(driver);
	LoginPage lp=new LoginPage(driver);
	DashboardPage dsp=new DashboardPage(driver);
	
	ScreenshotUtility ss=new ScreenshotUtility();

	//creating the method for a time-stamp
	String Timestamp=new SimpleDateFormat("yyy-mm-dd[hh-mm-ss]").format(new Date());
	wu.configMaximizedBrowser();
	wu.waitForElementsToLoad(20);
	wu.navigateToApplication("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
	lp.login("Admin","admin123");
	Thread.sleep(3000);
	
	
	
	//capture the screen shot of the homepage
//	TakesScreenshot ts=(TakesScreenshot) driver;
//	File temp=ts.getScreenshotAs(OutputType.FILE);
//	File perm=new File("./reports/dashboard"+Timestamp+".png");
//	FileHandler.copy(temp,perm);
	ss.captureScreenshot(driver,"DashboardPage");

	
	//capture the screenshot of the webelement
//	WebElement recruitmentLink=dsp.clickRecruitment();
//	File tempsrc=recruitmentLink.getScreenshotAs(OutputType.FILE);
//	File permtrg=new File("./reports/recruitmentLink"+Timestamp+".png");
//	FileHandler.copy(tempsrc,permtrg);

	
	ss.captureScreenshot(dsp.clickRecruitment(),"recruitmentLink");

}
}
