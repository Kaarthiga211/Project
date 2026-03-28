package handlingjavascriptpopup;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.devtools.v140.network.model.AlternateProtocolUsage;

public class Promptpopup {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
WebDriver driver=new ChromeDriver();
driver.manage().window().maximize();
driver.get("https://demo.automationtesting.in/Alerts.html");
Thread.sleep(2000);
driver.findElement(By.partialLinkText("Alert with Textbox")).click();
Thread.sleep(2000);
driver.findElement(By.cssSelector("[class='btn btn-info']")).click();
Alert prompt=driver.switchTo().alert();
prompt.sendKeys("kaarthi");
Thread.sleep(2000);
prompt.accept();

	}

}
