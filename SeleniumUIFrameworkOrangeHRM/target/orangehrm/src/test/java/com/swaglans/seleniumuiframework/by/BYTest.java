package com.swaglans.seleniumuiframework.by;

import org.testng.annotations.Test;

import com.swaglabs.seleniumuiframwork.by.Addtocart;
import com.swaglabs.seleniumuiframwork.by.baseclass;
import com.swaglabs.seleniumuiframwork.by.checkout;
import com.swaglabs.seleniumuiframwork.by.inform;
import com.swaglabs.seleniumuiframwork.by.loginPage;

public class BYTest extends baseclass {
@Test
public void BYTest() {
	loginPage lp=new loginPage(driver);
	lp.entercredentials("standard_user", "secret_sauce");
	
	Addtocart ad=new Addtocart(driver);
	ad.start();
	ad.stop();
	
	checkout ck=new checkout(driver);
	ck.clicks();
	
	inform in=new inform(driver);
	in.entercredent();
}
}
