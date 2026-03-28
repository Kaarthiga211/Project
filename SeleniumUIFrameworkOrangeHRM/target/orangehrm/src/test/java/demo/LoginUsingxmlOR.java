package demo;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
import org.w3c.dom.Document;
import org.xml.sax.SAXException;

public class LoginUsingxmlOR {
@Test
public void login() throws SAXException, IOException, ParserConfigurationException {
  //Read data from xml file
	Document file=DocumentBuilderFactory.newInstance().newDocumentBuilder()
			.parse(new File("./src/main/resources/ObjectRepository/LoginPage.xml"));
	//Fetching the string values
	String username=file.getElementsByTagName("UsernameFeild").item(0).getTextContent();
	String password=file.getElementsByTagName("passwordfeild").item(0).getTextContent();
	String loginbtn=file.getElementsByTagName("loginbutton").item(0).getTextContent();

    //Splitting the locator and value
String userloc=	username.split(":")[0];
String userlocvalue=username.split(":")[1];
	
String passloc=password.split(":")[0];
String passlocvalue=password.split(":")[1];

String loginloc=loginbtn.split(":")[0];
String loginlocvalue=loginbtn.split(":")[1];

//testscript
WebDriver driver=new ChromeDriver();
driver.manage().window().maximize();
driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
//username
if(userloc.contentEquals("name")) {
driver.findElement(By.name(userlocvalue)).sendKeys("Admin");	
}
//password
if(passloc.contentEquals("name")) {
driver.findElement(By.name(passlocvalue)).sendKeys("admin123");	
}
//login button
if(loginloc.contentEquals("cssSelector")) {
driver.findElement(By.cssSelector(loginlocvalue)).click();	
}
}
}
