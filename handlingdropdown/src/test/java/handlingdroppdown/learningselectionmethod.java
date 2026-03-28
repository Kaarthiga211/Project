package handlingdroppdown;


import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class learningselectionmethod {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
WebDriver driver=new ChromeDriver();
driver.manage().window().maximize();

driver.get("https://demo.automationtesting.in/Register.html");
Thread.sleep(2000);

//locating the skills dropdown
WebElement dropdown=driver.findElement(By.id("Skills"));

//making object of select class
Select sel=new Select(dropdown);

//calling select method
//By index
sel.selectByIndex(9);
Thread.sleep(2000);

//By valueAttribute
sel.selectByValue("Data Analytics");
Thread.sleep(2000);

//Visibletext
sel.selectByVisibleText("Engineering");
Thread.sleep(2000);

//ByContainsVisibleText
sel.selectByContainsVisibleText("script");//->javascript it gives the words is part of the word
//error sel.selectByContainsVisibleText("supporter");//->Internet supporter the words are separated it doesn't work


//getoptions
//fetching the options from the dropdown
List<WebElement> allopt=sel.getOptions();
for(WebElement opt:allopt) {
	System.out.println(opt.getText());
}


driver.quit();
	}

}
