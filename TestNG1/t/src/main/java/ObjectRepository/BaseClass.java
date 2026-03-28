package ObjectRepository;

import java.time.Duration;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.BeforeClass;

public class BaseClass {
public WebDriver driver;
@BeforeClass
public void beforclass() {
ChromeOptions copt =new ChromeOptions();
copt.addArguments("--incognito");
 driver=new ChromeDriver(copt);
driver.manage().window().maximize();
driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
driver.get("https://www.saucedemo.com/");	

}


}