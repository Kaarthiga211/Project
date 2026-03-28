package Recruitment;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class R1 {
	WebDriver driver=null;
@Test(priority=-1)
public void login(){
	 driver=new ChromeDriver();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
	//login
	driver.findElement(By.name("username")).sendKeys("Admin");
	driver.findElement(By.name("password")).sendKeys("admin123");
	driver.findElement(By.cssSelector("[class=\"oxd-button oxd-button--medium oxd-button--main orangehrm-login-button\"]")).click();
}
@Test(priority=0,dependsOnMethods="login")
public void recruitment() throws InterruptedException {
	driver.findElement(By.linkText("Recruitment")).click();
	driver.findElement(By.cssSelector("[class='oxd-button oxd-button--medium oxd-button--secondary']")).click();
	driver.findElement(By.cssSelector("[name='firstName']")).sendKeys("kaarthi");
driver.findElement(By.cssSelector("[name='lastName']")).sendKeys("B");
WebElement element=driver.findElement(By.xpath("//div[@class='oxd-select-text-input']"));
Thread.sleep(2000);
element.sendKeys(Keys.ARROW_DOWN,Keys.ARROW_DOWN,Keys.ARROW_DOWN);
element.sendKeys(Keys.ENTER);
driver.findElement(By.xpath("(//input[contains(@class,'oxd-input oxd-input--active')])[5]")).sendKeys("kaarthi@gmail.com");
Thread.sleep(2000);
driver.findElement(By.xpath("//label[text()='Contact Number']/../..//input[@class='oxd-input oxd-input--active']")).sendKeys("63826786388");
Thread.sleep(2000);
driver.findElement(By.xpath("//input[@class='oxd-file-input']")).sendKeys("C:\\Users\\KARTHIGA\\Downloads\\jerry resume.pdf");
Thread.sleep(2000);
//driver.findElement(By.cssSelector("[class='oxd-icon bi-calendar oxd-date-input-icon']")).click();

driver.findElement(By.cssSelector("[class='oxd-button oxd-button--medium oxd-button--secondary orangehrm-left-space']")).click();
Thread.sleep(2000);
}
@Test(priority=1,dependsOnMethods="recruitment")
public void candidates() throws InterruptedException {

driver.findElement(By.linkText("Candidates")).click();

WebElement element1=driver.findElement(By.xpath("(//div[contains(@class,'oxd-select-text-input')])[1]"));
Thread.sleep(5000);
element1.sendKeys(Keys.ARROW_DOWN,Keys.ARROW_DOWN,Keys.ARROW_DOWN);
element1.sendKeys(Keys.ENTER);


WebElement element2=driver.findElement(By.xpath("(//div[contains(@class,'oxd-select-text-input')])[2]"));

Thread.sleep(2000);
element2.sendKeys(Keys.ARROW_DOWN,Keys.ARROW_DOWN,Keys.ARROW_DOWN);
element2.sendKeys(Keys.ENTER);


WebElement element3=driver.findElement(By.xpath("(//div[contains(@class,'oxd-select-text-input')])[3]"));
Thread.sleep(2000);
element3.sendKeys(Keys.ARROW_DOWN);
element3.sendKeys(Keys.ENTER);
WebElement element4=driver.findElement(By.xpath("(//div[contains(@class,'oxd-select-text-input')])[4]"));
Thread.sleep(2000);
element4.sendKeys(Keys.ARROW_DOWN,Keys.ARROW_DOWN);
element4.sendKeys(Keys.ENTER);
WebElement element5=driver.findElement(By.xpath("//input[@placeholder='Type for hints...']"));
element5.sendKeys("k");
Thread.sleep(5000);
element5.sendKeys(Keys.ARROW_DOWN,Keys.ARROW_DOWN);
element5.sendKeys(Keys.ENTER);

//driver.findElement(By.cssSelector("[placeholder='From']")).click();
//Thread.sleep(2000);
//driver.findElement(By.cssSelector("[placeholder='To']")).click();
Thread.sleep(2000);
driver.findElement(By.cssSelector("[class='oxd-button oxd-button--medium oxd-button--secondary orangehrm-left-space']")).click();
WebElement element7=driver.findElement(By.xpath("//span[.='No Records Found']"));
if(element7.isDisplayed()) {
System.out.println("records are not found");	
}
else {
	System.out.println("records are found");
}
}
@Test(priority=2,dependsOnMethods="login")
public void logout() {
driver.findElement(By.cssSelector("[class='oxd-userdropdown-tab']")).click();
driver.findElement(By.xpath("//a[.='Logout']")).click();
}

}
