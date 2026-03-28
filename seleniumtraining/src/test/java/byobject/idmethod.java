package byobject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class idmethod {

	public static void main(String[] args) throws InterruptedException{
		// TODO Auto-generated method stub

		
		WebDriver driver=new ChromeDriver();
		
		//By.id method
	driver.get("https://www.amazon.com/");
	
	Thread.sleep(2000);
	
	driver.findElement(By.id("twotabsearchtextbox")).sendKeys("Watch");
	
	
	
driver.get("https://www.google.com/?zx=1772005804701&no_sw_cr=1");
	
Thread.sleep(2000);
	
	driver.findElement(By.id("APjFqb")).sendKeys("Watch");
	
driver.get("https://www.mysql.com/");
	
	Thread.sleep(2000);
	
	driver.findElement(By.id("l1-search-input")).sendKeys("Java");

driver.get("https://demowebshop.tricentis.com/");

	Thread.sleep(2000);
	
	driver.findElement(By.id("small-searchterms")).sendKeys("Watch");
	

		
	driver.get("https://www.google.com/maps/@13.0426649,80.0849097,14z?authuser=0&entry=ttu&g_ep=EgoyMDI2MDIyMi4wIKXMDSoASAFQAw%3D%3D");
		
		Thread.sleep(2000);
		
		driver.findElement(By.id("ucc-1")).sendKeys("SALEM");
		
		
driver.get("https://www.w3schools.com/");
		
		Thread.sleep(2000);
		
		driver.findElement(By.id("search2")).sendKeys("Java");

driver.get("https://www.re-coded.com/open-study-hub?gad_source=1&gad_campaignid=21496781490&gbraid=0AAAAABi931BDSP-a6DRFrpKS46lvjeIEC&gclid=CjwKCAiA2PrMBhA4EiwAwpHyCx2K9r1MLxeh1i8rgiIqSdWLfJZAltCs9celSzkMdbUlfFeXafne7BoCWeAQAvD_BwE");
		
		Thread.sleep(2000);
		
		driver.findElement(By.id("search-field")).sendKeys("Java");

driver.get("https://www.udemy.com/?srsltid=AfmBOooXdAg1BaNPo5LKKhSKffvgcDkmtUSqAKCCZsL2rj9hmR68823U");
		
		Thread.sleep(2000);
		
		driver.findElement(By.id("search-form-autocomplete--2036")).sendKeys("Java");

driver.get("https://bitaacademy.com/course/full-stack-developer-training-in-chennai/?gad_source=1&gad_campaignid=17944962472&gbraid=0AAAAAClidw11RDm3uEysLPvYnwwdjh4Ve&gclid=CjwKCAiA2PrMBhA4EiwAwpHyC_6ksWp7X7Zrt1AkAYCakhoYaHv9nTORGwzRc3QrENuAOedYDrV0fBoCHMwQAvD_BwE");		
		Thread.sleep(2000);
		
		driver.findElement(By.id("search-input-1")).sendKeys("Java");

		driver.get("https://www.freecodecamp.org/");

		Thread.sleep(2000);

		driver.findElement(By.id("ais-SearchBox-input")).sendKeys("Java");


		driver.get("https://dir.indiamart.com/chennai/working-platform.html");

		Thread.sleep(2000);

		driver.findElement(By.id("search_string")).sendKeys("Ponnamalle");
		
		
		driver.quit();

	//By.name method
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
//	
   Thread.sleep(2000);
			
//locating username textfeild
			
		driver.findElement(By.name("username")).sendKeys("Admin");
	 driver.findElement(By.name("password")).sendKeys("admin123");

	 driver.findElement(By.cssSelector("button[type='submit']")).click();

	
	}

}
