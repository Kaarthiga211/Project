package byobject;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class linkmethod {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
WebDriver driver=new ChromeDriver();

//Linktext
//driver.get("https://demowebshop.tricentis.com/");
//	Thread.sleep(2000);
//	driver.findElement(By.linkText("Facebook")).click();
	
//	driver.get("https://www.google.com/");
//	Thread.sleep(2000);
//	driver.findElement(By.linkText("Gmail")).click();

//partialLinkText

//driver.get("https://demowebshop.tricentis.com/");
//Thread.sleep(2000);
//driver.findElement(By.partialLinkText("Computers")).click();//In this method we modify the attribute value
//
//	
//driver.get("https://www.flipkart.com/account/login?ret=https%3A%2F%2Fwww.flipkart.com%2Ffpg%2Fcbc%2Fsbi%2Fstore-page%3Futm_source%3DGSN_OTA%26utm_context%3DSEM%26cmpid%3Dcontext_23394340014_gmc_pla%26entryMethod%3D23394340014%26gad_source%3D1%26gad_campaignid%3D23394340014%26gbraid%3D0AAAAADxRY5_T8cthzqxWBAizBMRVZe8Uh%26gclid%3DCjwKCAiA2PrMBhA4EiwAwpHyC_JOYnQuNi66H5PK2ogZVuiu9_eOYv-ZSUkXBMrUqrAqJq2hDoLeahoC6ywQAvD_BwE");
//Thread.sleep(2000);
//driver.findElement(By.linkText("Login")).click();


//ClassName
//	driver.get("https://demowebshop.tricentis.com/");
//	Thread.sleep(2000);
//	driver.findElement(By.className("ico-register")).click();
	



//Tag name
//driver.get("https://www.google.com/");
//Thread.sleep(2000);
//List<WebElement>  alllinks= driver.findElements(By.tagName("a"));
//
//for(WebElement link:alllinks) {
//	System.out.println(link.getText());
//}
//
//for(WebElement link:alllinks) {
//	if(link.getText().contains("Store")) {
//		link.click();
//		break;
//	}
//}
	
driver.get("https://demo.automationtesting.in/Register.html");

Thread.sleep(2000);


driver.findElement(By.xpath("//input[@placeholder='First Name']")).sendKeys("Kaarthi");

// Last Name
driver.findElement(By.xpath("//input[@placeholder='Last Name']")).sendKeys("BK");



}

	}


