package com.gurukula.testgurukula.pages;

/**
 * Copyright (c) 2019, ChamLabs.
 * Responsible: Chandra.Sekhar.Muttineni
 * @author https://github.com/cham6
 * @email: paperplanes.chandra@gmail.com
 * @fork: https://github.com/cham6/TestAutomationFrameworkForGurukula
 */

import org.openqa.selenium.*;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

/**
 * Class to represent the Login page. 
 * Contains all the objects' locators and corresponding functionalities on the objects of LogIn page.
 * @author Chandra.Sekhar.Muttineni
 *
 */

public class LoginPage extends BasePage {	
	
	//Page Factory locators and their corresponding web elements.
	
	@FindBy(xpath="//h1[text()='Welcome to Gurukula']")
	WebElement loginLabel;
	
	@FindBy(xpath="//a[text()='login']")
	WebElement loginLink;
	
	@FindBy(id="username")
	WebElement loginUserName;
	
	@FindBy(id="password")
	WebElement loginPassword;
	
	@FindBy(xpath="//button[text()='Authenticate']")
	WebElement submitButton;
	
	@FindBy(xpath="//div[contains(text(),'You are logged in as user')]")
	WebElement loginSuccessful;
	
	@FindBy(xpath="//div[contains(text(),'Please check your credentials and try again.')]")
	WebElement loginFailed;

	//Constructor that initializes the Driver object in parent and use it for current page
	public LoginPage(WebDriver wd) {
		super(wd);
		PageFactory.initElements(driver, this);
	}
	
	//Actions on initialized WebElements.
	private void setUserName(String username) {
		if(username == null) {
			return;
		}
		loginUserName.sendKeys(username);
	}
	
	private void setPassword(String password) {
		if(password == null) {
			return;
		}
		loginPassword.sendKeys(password);
	}
	
	private void clickLogin() {
		loginLink.click();
	}
	
	private void clickSubmit() {
		submitButton.click();
	}
	
	/**
	 * Check if login is successful.
	 * @return 	true if login is successful. false, otherwise.
	 */
	public boolean isLoginSuccessful() {
		
		try {
			return loginSuccessful.isDisplayed();
		} catch(NoSuchElementException nse) {
			System.out.println("'You are logged in as user' message is not shown. "
					+ "Login has failed");
			nse.printStackTrace();
			return false;
		}
	}
	
	/**
	 * Check if login has failed.
	 * @return 	true if login has failed. false, otherwise.
	 */
	public boolean hasLoginFailed() {
		
		try {
			return loginFailed.isDisplayed();
		} catch(NoSuchElementException nse) {
			System.out.println("'Please check your credentials and try again' text is not shown."
					+ " Login has been successful.");
			return false;
		}
	}
	
	/**
	 * This method will be exposed to Tests
	 * @param userName
	 * @param password
	 */
	public void loginToGurukula(String userName, String password){
		
		clickLogin();
		setUserName(userName);
		setPassword(password);
		clickSubmit();
	}

}