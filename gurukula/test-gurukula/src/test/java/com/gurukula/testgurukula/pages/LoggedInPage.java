package com.gurukula.testgurukula.pages;

/**
 * Copyright (c) 2019, ChamLabs.
 * Responsible: Chandra.Sekhar.Muttineni
 * @author https://github.com/cham6
 * @email: paperplanes.chandra@gmail.com
 * @fork: https://github.com/cham6/TestAutomationFrameworkForGurukula
 */

import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

/**
 * Class to represent the Logged in page. 
 * Contains all the objects' locators and corresponding functionalities on the objects of Logged In page.
 * @author Chandra.Sekhar.Muttineni
 *
 */

public class LoggedInPage extends BasePage {
	
	//Page Factory locators and their corresponding web elements.
	
	@FindBy(xpath="//span[text()='Entities']")
	WebElement entities;
	
	@FindBy(xpath="//span[text()='Branch']")
	WebElement branch;
	
	@FindBy(xpath="//span[text()='Staff']")
	WebElement staff;
	
	@FindBy(xpath="//span[text()='Account']")
	WebElement account;
	
	@FindBy(xpath="//span[text()='Settings']")
	WebElement settings;
	
	@FindBy(xpath="//span[text()='Sessions']")
	WebElement sessions;
	
	@FindBy(xpath="//span[text()='Log out']")
	WebElement logout;
	
	@FindBy(xpath="//span[text()='Home']")
	WebElement home;
	
	@FindBy(xpath="//span[text()='Password']")
	WebElement password;

	public LoggedInPage(WebDriver wd) {
		super(wd);
		PageFactory.initElements(driver, this);
	}
	
	//Actions on initialized WebElements.
	public boolean isLoggedIn() {
		try {
			return entities.isDisplayed();
		} catch(NoSuchElementException nse) {
			System.out.println("'The user is not logged in.");
			nse.printStackTrace();
			return false;
		}
	}
	
	public void clickEntities() {
		entities.click();
	}
	
	public void clickBranch() {
		branch.click();
	}
	
	public void clickStaff() {
		staff.click();
	}
	
	public void clickAccount() {
		account.click();
	}
	
	public void clickSettings() {
		settings.click();
	}
	
	public void clickSessions() {
		sessions.click();
	}
	
	public void clickHome() {
		home.click();
	}
	
	public void clickLogout() {
		logout.click();
	}
	
	public void clickPassword() {
		password.click();
	}
}
