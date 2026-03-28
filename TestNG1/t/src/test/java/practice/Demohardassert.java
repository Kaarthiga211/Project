package practice;


import static org.testng.Assert.assertEquals;


import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Demohardassert {
@Test
public void TestMethod() {
	WebDriver driver=new ChromeDriver();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	driver.get("https://www.google.com/");
String expectedTitle="Google";
String ActualTitle=driver.getTitle();
//Hard Assertion
Assert.assertEquals(ActualTitle,expectedTitle);//we give Assert.assertequals or also give assertequals only also

//if(expectedTitle.equals(ActualTitle)) {
//	System.out.println("Status:Pass");
//}
//else {
//	System.out.println("Status:Fail");
//	
//}

//Assert.assertTrue(expectedTitle.equals(ActualTitle));


//Assert.assertEquals(ActualTitle.equals(ActualTitle),true);

//Assert.fail();->It forcefully make fail while debbugging
}
}
