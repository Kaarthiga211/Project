package byobject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class xpath {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver=new ChromeDriver();

		driver.get("https://demo.automationtesting.in/Register.html");

		Thread.sleep(2000);


		driver.findElement(By.xpath("//input[@placeholder='First Name']")).sendKeys("Kaarthi");

		// Last Name
		driver.findElement(By.xpath("//input[@placeholder='Last Name']")).sendKeys("BK");


	}

}
