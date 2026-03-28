package demo;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.orangehrm.selleniumuiframework.genericutility.FileUtility;
import com.orangehrm.selleniumuiframework.genericutility.WebDriverUtility;
import com.selenium.UIFrameworkOrangeHRM.LoginPage;

public class LoginTest {
@Test
public void login() throws IOException {
	ExtentReports extent=new ExtentReports();
	ExtentSparkReporter spark=new ExtentSparkReporter("./reports/LoginTest.html");
	extent.attachReporter(spark);
	ExtentTest test=extent.createTest("Sample Test");
	WebDriver driver=new ChromeDriver();
	WebDriverUtility wu=new WebDriverUtility(driver);
	FileUtility fu=new FileUtility();
	LoginPage lp=new LoginPage(driver);
	wu.configMaximizedBrowser();
	wu.waitForElementsToLoad(20);
	String urlPath=fu.getPropertyKeyValue("url");
	String un=fu.getPropertyKeyValue("username");
	String pass=fu.getPropertyKeyValue("password");
	
	wu.navigateToApplication(urlPath);
//	test.info("navigated orangehrm login page");
//	lp.login(un, pass);
//	test.pass("login passed");

	
	test.log(Status.INFO,"Navigated to OrangeHRM login page");
	lp.login(un, pass);
	test.log(Status.PASS,"Login Successfull");
	extent.flush();
} 
}
