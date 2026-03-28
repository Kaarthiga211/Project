package demo;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.time.Duration;

import org.json.JSONObject;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class LoginUsingJsonOR {
@Test
public void  login() throws IOException {
	//Reading the JSON file
String data=new String(Files.readAllBytes(Paths.get("./src/main/resources/ObjectRepository/login.json")));	
JSONObject obj=new JSONObject(data);
JSONObject loginpage=obj.getJSONObject("login");
//Extracting the data to check
String usertextfeild=loginpage.getString("un");
String passwordtextfeild=loginpage.getString("pass");
String loginbtn=loginpage.getString("loginbtn");
//Splitting the string value to use in locator
String[] userloc=usertextfeild.split(":");
String[] passloc=passwordtextfeild.split(":");
String[] loginbtnloc=loginbtn.split(":");

//Test script
WebDriver driver=new ChromeDriver();
driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");

//username
if(userloc[0].equals("name")) {
	driver.findElement(By.name(userloc[1])).sendKeys("Admin");
	}
if(passloc[0].equals("name")) {
	driver.findElement(By.name(passloc[1])).sendKeys("admin123");
	}
if(loginbtnloc[0].equals("cssSelector")) {
	driver.findElement(By.cssSelector(loginbtnloc[1])).click();
	}













}
}
