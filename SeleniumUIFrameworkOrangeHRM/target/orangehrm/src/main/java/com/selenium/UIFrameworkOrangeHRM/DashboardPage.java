package com.selenium.UIFrameworkOrangeHRM;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
public class DashboardPage {
	
	 public WebDriver driver;

	    public DashboardPage(WebDriver driver) {
	        this.driver = driver;
	        PageFactory.initElements(driver, this);
	    }

	    // ================= WebElements =================

	    // PIM Module
	    @FindBy(xpath = "//span[.='PIM']")
	    private WebElement pimModule;

	    // Recruitment Module
	    @FindBy(xpath = "//span[.='Recruitment']")
	    private WebElement recruitmentModule;

	    // User Dropdown
	    @FindBy(xpath = "//i[contains(@class,'oxd-userdropdown-icon')]")
	    private WebElement userDropdown;

	    // Logout Button
	    @FindBy(xpath = "//a[text()='Logout']")
	    private WebElement logoutBtn;

	    // ================= Actions =================

	    public void clickPim() {
	        pimModule.click();
	    }

	    public WebElement clickRecruitment() {
	      recruitmentModule.click();
		return recruitmentModule;
	    }

	    public void clickUserDropdown() {
	        userDropdown.click();
	    }

	    public void clickLogout() {
	        logoutBtn.click();
	    }

	    // Combined logout action (best practice)
	    public void logout() {
	        userDropdown.click();
	        logoutBtn.click();
		}
	}

