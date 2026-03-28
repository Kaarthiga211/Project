package com.orangehrm.seleniumframework.object_repository;

import java.time.Duration;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import com.selenium.UIFrameworkOrangeHRM.AddEmployeePage;
import com.selenium.UIFrameworkOrangeHRM.DashboardPage;
import com.selenium.UIFrameworkOrangeHRM.LoginPage;
import com.selenium.UIFrameworkOrangeHRM.PimPage;
public class AddEmployeeTest {
	

	    WebDriver driver;

	    @Test
	    public void addNewEmployee() {
	        driver = new ChromeDriver();

	        driver.manage().window().maximize();
	        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	        driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");

	        LoginPage lp = new LoginPage(driver);
	        DashboardPage dp = new DashboardPage(driver);
	        PimPage pp = new PimPage(driver);
	        AddEmployeePage aep = new AddEmployeePage(driver);

	        // Login
	        lp.login("Admin", "admin123");

	        // PIM
	        dp.clickPim();

	        // Add button
	        pp.clickAdd_btn();

	        // Add employee
	        aep.addEmp("Abcde", "j", "pqrst", "12345");

	        // Create credentials
	        aep.createCreditionals("laksh", "pass123");
	    }
	}
