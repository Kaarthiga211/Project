package com.swaglags.seleniumframeworkui;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import com.swaglabs.seleniumuiframework.AddToCart;
import com.swaglabs.seleniumuiframework.BaseClasses;
import com.swaglabs.seleniumuiframework.LoginPage;
import com.swaglabs.seleniumuiframework.checkout;
import com.swaglabs.seleniumuiframework.finish;
import com.swaglabs.seleniumuiframework.information;

public class swaglabeTest extends BaseClasses{
@Test
public void swaglabeTest() {
	LoginPage lp=new LoginPage(driver);
	lp.enterusername("standard_user");
	lp.enterpass("secret_sauce");
	lp.clickLoginbtn();
	
	
	AddToCart adds=new AddToCart(driver);
	adds.clickAddtocarts();
	adds.clickAddtocart();
	
	checkout ck=new checkout(driver);
	ck.clickAddtocartly();
	ck.clickCheckout();

information in =new information(driver);
in.credentials("raj", "k", "raj123");


finish fp=new finish(driver);
fp.clickFinish();
}
}
