package swaglabs;

import java.time.Duration;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.Test;

import ObjectRepository.BaseClass;
import ObjectRepository.loginPage;
import ObjectRepository.logoutPage;
@Test

public class logintest extends BaseClass{
	
	@Test
	public void login() {
		loginPage lp=new loginPage(driver);
logoutPage lo=new logoutPage(driver);
//login
		//lp.enterurl("https://www.saucedemo.com/");
 
lp.entercredentials("standard_user","secret_sauce");

lp.clickLogin();	
	
	lo.logout();
	
	}
}
