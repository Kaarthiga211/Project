package com.orangehrm.selleniumuiframework.genericutility;


import org.testng.annotations.BeforeSuite;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;

import com.selenium.UIFrameworkOrangeHRM.DashboardPage;
import com.selenium.UIFrameworkOrangeHRM.LoginPage;

public class BaseClass {
	public WebDriver driver;
	FileInputStream fis;
	Properties prop;
	String Browser;
	FileUtility fiu=new FileUtility();
	WebDriverUtility wdu;
	LoginPage lp;
	public DashboardPage dsp;
	
	
	   @BeforeSuite
		public void configBeforeSute() {
			Reporter.log("--Executing before Suite--",true);
		}
	    @BeforeTest
	    public void configBeforeTest() {
	    	Reporter.log("--Executing before Test--",true);
		}
	   // @Parameters("BROWSER")
	    
	    @BeforeClass(groups= {"Regression","Smoke"})
	   public void beforeclass() throws IOException {
	    	fis=new FileInputStream("./src/test/resources/orangehrm.commondata/properites");
			prop =new Properties();
			prop.load(fis);
			
		    Browser=prop.getProperty("browser");
			if(Browser.contains("chrome")) {
				driver=new ChromeDriver();
			}
			else if(Browser.contains("firefox")) {
				driver=new FirefoxDriver();
			}
			else if(Browser.contains("edge")) {
				driver=new EdgeDriver();
			}
			
			wdu=new WebDriverUtility(driver);
			lp=new LoginPage(driver);
			dsp=new DashboardPage(driver);
            wdu.configMaximizedBrowser();
	    	wdu.waitForElementsToLoad(30);
			
	    	Reporter.log("--Executing before class--",true);
	}
		
	    @BeforeMethod
	    public void configBeforeMethod() throws IOException {
	    	Reporter.log("--Executing before Method--",true);
	    	fis=new FileInputStream("./src/test/resources/orangehrm.commondata/properites");
			prop =new Properties();
			prop.load(fis);
			
			String uRL= fiu.getPropertyKeyValue("url");
			String ValidUserName=fiu.getPropertyKeyValue("username");
			String ValidPassword=fiu.getPropertyKeyValue("password");

			//login with valid credential
			wdu.navigateToApplication(uRL);
//	    	driver.get(URL);
	    	lp.login(ValidUserName, ValidPassword);
	      }
	    @AfterMethod
	    public void configAfterMethod() {

	    	dsp.logout();
	    	Reporter.log("--Executing After Method--",true);
		}
	    @AfterClass
	    public void configAfterclass() {
	    	
	    	Reporter.log("--Executing after class--",true);
	    	wdu.quitBrowserWindow();
	    }
	    @AfterTest
	    public void configAfterTest() {
	    	Reporter.log("--Executing AfterTest--",true);
		}
	    @AfterSuite
	    public void configAfterSute() {
	    	Reporter.log("--Executing AfterSuite--",true);
		}
}