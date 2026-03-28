package byobject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class xpathbyaxes {
	

	public static void main(String[] args)throws InterruptedException {
		// TODO Auto-generated method stub

		WebDriver driver=new FirefoxDriver();
		
//		driver.get("https://www.makemytrip.com/?cc=in&redirectedBy=gl");
//		Thread.sleep(2000);
//		driver.findElement(By.xpath("//span[@class='commonModal__close']")).click();

		driver.get("https://www.makemytrip.com/flights/?cmp=SEM|D|DF|B|Brand|Brand-BrandExact_DT|B_M_Makemytrip_Search_Exact|RSA|&ef_id=:G:s");
		Thread.sleep(5000);
		driver.findElement(By.xpath("//p[.='For Your Dream Europe Trip: Get Up to 40%OFF*']/following::a[.='BOOK NOW' and @data-cy='superOfferCtaText1']")).click();
		
		
}
}