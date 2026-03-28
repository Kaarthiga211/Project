package seleniumjavascriptexecuter;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class practiceactions {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("https://demoapps.qspiders.com/ui/clickHold?sublist=0");
		WebElement element= driver.findElement(By.id("circle"));
		Actions act=new Actions(driver);
		//act.clickAndHold(element).build().perform();//in this line we must give build and perform then only it can executed
		//or
		act.clickAndHold(element).pause(4000).release().perform();

	}

}
