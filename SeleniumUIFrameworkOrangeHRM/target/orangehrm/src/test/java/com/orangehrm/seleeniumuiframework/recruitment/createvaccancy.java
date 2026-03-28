package com.orangehrm.seleeniumuiframework.recruitment;

import java.util.List;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

import com.orangehrm.selleniumuiframework.genericutility.ActionHelper;
import com.orangehrm.selleniumuiframework.genericutility.BaseClass;
import com.orangehrm.selleniumuiframework.genericutility.ExcelUtility;
import com.selenium.UIFrameworkOrangeHRM.AddVacancyPage;
import com.selenium.UIFrameworkOrangeHRM.DashboardPage;
import com.selenium.UIFrameworkOrangeHRM.Recuritment;
import com.selenium.UIFrameworkOrangeHRM.vacancyPage;

public class createvaccancy extends BaseClass{
	 @Test
	    public void addvacancy() throws InterruptedException, EncryptedDocumentException, IOException {
           


	            	ExcelUtility eUtil = new ExcelUtility();
	                ActionHelper aHelper = new ActionHelper(driver);

	                //  Page Objects
	                DashboardPage dbp = new DashboardPage(driver);
	                Recuritment rp = new Recuritment(driver);
	                vacancyPage vp = new vacancyPage(driver);
	                AddVacancyPage addvp = new AddVacancyPage(driver);

	                // dashboard
	                dbp.clickRecruitment();

	                // Requirement page
	                rp.clickVacanciesLink();

	                // click add
	                vp.clickClick_btn();
	                
	                String path = "C:\\OrangeHRM_TestScrpitData\\Vacancy2DATA.xlsx";

	                eUtil.loadExcelFile(path,"Sheet1");
	                
	                String vacancyName = eUtil.getDataFromSingleCell(1, 1);
	                String description = eUtil.getDataFromSingleCell(1, 2);
	                String hiringManager = eUtil.getDataFromSingleCell(1, 3);
	                String positions = eUtil.getDataFromSingleCell(1, 3);

	                addvp.enterVacancyName(vacancyName);

	                aHelper.navigateDownDropdown(addvp.getJobTitle(), 1);

	                addvp.enterDescription(description);

	                aHelper.scrollDownAutoSuggestion(
	                        addvp.getHiringManagerTextField(),
	                        "a",
	                        5,
	                        1
	                );

	                addvp.enterNumberOfPositions(positions);

	                addvp.clickSaveButton();
	                
	                
	                
	              List<WebElement>validateionVacancyName=driver.findElements(By.xpath("//div[@class=\"oxd-table-row oxd-table-row--with-border\"]"));
	                
	                
	                for(WebElement vacancy: validateionVacancyName) {
	                	String name=vacancy.getText();
	                	Assert.assertEquals(name,eUtil.getDataFromSingleCell(1, 1));
	                	if(name.equals(eUtil.getDataFromSingleCell(1, 1))) {
	                		Reporter.log("passed");
	                	}else {
	                		Reporter.log("failed");
	                	}
	                	
	                	
	                }
	               
	            }
	            
	        }