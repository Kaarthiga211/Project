package com.orangehrm.selleniumuiframework.genericutility;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.io.FileHandler;

public class ScreenshotUtility {
	//capture WebPage
public String captureScreenshot(WebDriver driver,String testName) throws IOException {
	//creating a method for timestamp
	String Timestamp=new SimpleDateFormat("yyy-mm-dd[hh-mm-ss]").format(new Date());
	String path="./reports/"+testName+Timestamp+".png";
	TakesScreenshot ts=(TakesScreenshot) driver;
File temp=ts.getScreenshotAs(OutputType.FILE);

try {
File perm=new File(path);
FileHandler.copy(temp,perm);
}
catch(Exception e) {
	e.printStackTrace();
}
return path;

}

//capture webelement
public String captureScreenshot(WebElement element,String elementName) throws IOException {

	String Timestamp=new SimpleDateFormat("yyy-mm-dd[hh-mm-ss]").format(new Date());
	String path="./reports/"+elementName+Timestamp+".png";

File temp=element.getScreenshotAs(OutputType.FILE);

try {
File perm=new File(path);
FileHandler.copy(temp,perm);
}
catch(Exception e) {
	e.printStackTrace();
}
return path;

}




}


