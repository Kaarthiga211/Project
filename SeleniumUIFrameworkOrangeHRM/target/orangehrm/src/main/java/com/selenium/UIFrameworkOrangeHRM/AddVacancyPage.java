package com.selenium.UIFrameworkOrangeHRM;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AddVacancyPage {
	WebDriver driver;

    // Constructor
    public AddVacancyPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    // ================= WebElements =================

    // Vacancy Name
    @FindBy(xpath = "(//input[contains(@class,'oxd-input oxd-input--active')])[2]")
    private WebElement vacancyName;

    // Job Title Dropdown
    @FindBy(css = ".oxd-select-text-input")
    private WebElement jobTitle;

    // Description
    @FindBy(css = ".oxd-textarea.oxd-textarea--active.oxd-textarea--resize-vertical")
    private WebElement description;

    // Hiring Manager
    @FindBy(css = "[placeholder='Type for hints...']")
    private WebElement hiringManager;

    // Number of Positions
    @FindBy(xpath = "(//input[contains(@class,'oxd-input oxd-input--active')])[3]")
    private WebElement numberOfPositions;

    // Save Button
    @FindBy(css = ".oxd-button.oxd-button--medium.oxd-button--secondary.orangehrm-left-space")
    private WebElement saveButton;

    // ================= Getters (needed for Actions class) =================

    public WebElement getJobTitle() {
        return jobTitle;
    }

    public WebElement getHiringManagerTextField() {
        return hiringManager;
    }

    // ================= Actions =================

    public void enterVacancyName(String name) {
        vacancyName.sendKeys(name);
    }

    public void selectJobTitle() {
        jobTitle.sendKeys(Keys.ARROW_DOWN, Keys.ARROW_DOWN, Keys.ENTER);
    }

    public void enterDescription(String desc) {
        description.sendKeys(desc);
    }

    public void enterHiringManager(String name) {
        hiringManager.sendKeys(name);
    }

    public void enterNumberOfPositions(String num) {
        numberOfPositions.sendKeys(num);
    }

    public void clickSaveButton() {
        saveButton.click();
    }
}
