package com.swaglabs.seleniumuiframwork.by;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class inform {
WebDriver driver;
public inform(WebDriver driver) {
	this.driver=driver;
	
}
By first=By.name("firstName");
By last=By.name("lastName");
By postal=By.name("postalCode");
By con=By.id("continue");
By fis=By.name("finish");

public void entercredent() {
	driver.findElement(first).sendKeys("kaar");
	driver.findElement(last).sendKeys("B");
    driver.findElement(postal).sendKeys("kaar122");
    driver.findElement(con).click();
    driver.findElement(fis).click();
    driver.quit();

}

}
