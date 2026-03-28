package webdrivermethods;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriver.Options;
import org.openqa.selenium.WebDriver.Window;
import org.openqa.selenium.chrome.ChromeDriver;

public class learningmanage {

	public static void main(String[] args)throws InterruptedException{
		// TODO Auto-generated method stub
		WebDriver driver=new ChromeDriver();
//Options ref=driver.manage();
//Window w=ref.window();
//w.maximize();
		//maximize
		Thread.sleep(2000);;
driver.manage().window().maximize();
Thread.sleep(2000);
//minimize
driver.manage().window().minimize();
Thread.sleep(2000);
//fullscreen
driver.manage().window().fullscreen();

	}

}
