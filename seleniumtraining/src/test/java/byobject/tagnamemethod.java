package byobject;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class tagnamemethod {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver=new ChromeDriver();

		//Tag name
		driver.get("https://www.google.com/");
		Thread.sleep(2000);
		List<WebElement>  alllinks= driver.findElements(By.tagName("a"));
		
		for(WebElement link:alllinks) {
			System.out.println(link.getText());
		}
		
		for(WebElement link:alllinks) {
			if(link.getText().contains("Store")) {
				link.click();
				break;
			}
		}
			
	}

}
