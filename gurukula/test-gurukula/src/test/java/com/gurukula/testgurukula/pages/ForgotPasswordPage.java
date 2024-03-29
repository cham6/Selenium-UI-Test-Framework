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
 * Class to represent the Forgot Password page during Login. 
 * Contains all the objects' locators and corresponding functionalities on the objects of Forgot password page
 * @author Chandra.Sekhar.Muttineni
 *
 */

public class ForgotPasswordPage extends BasePage {

	//Page Factory locators and their corresponding web elements.
	
	@FindBy(xpath="//h1[text()='Reset your password']")
	WebElement resetPasswordLabel;
	
	@FindBy(xpath="//input[@name='email']")
	WebElement emailTextBox;
	
	@FindBy(xpath="//button[text()='Reset password']")
	WebElement resetButton;
	
	@FindBy(xpath="//div[contains(text(),'Please check and try again')]")
	WebElement resetFailed;

	@FindBy(xpath="//div[contains(text(),'An email has been sent to your registered email address')]")
	WebElement resetSuccessful;
	
	@FindBy(xpath="//p[contains(text(),'Your e-mail is invalid')]")
	WebElement emailInvalid;
	
	@FindBy(xpath="//p[contains(text(),'Your e-mail is required to be at least 5 characters')]")
	WebElement emailShortLength;
	
	@FindBy(xpath="//p[contains(text(),'Your e-mail cannot be longer than 50 characters')]")
	WebElement emailLongLength;
	
	//Constructor that initializes the Driver object in parent and use it for current page
	public ForgotPasswordPage(WebDriver wd) {
		super(wd);
		PageFactory.initElements(driver, this);
	}
	
	//Actions on initialized WebElements.
	private void setEmailText(String email) {
		if(email == null) {
			return;
		}
		emailTextBox.clear();
		emailTextBox.sendKeys(email);
	}
	
	
	private void clickReset() {
		if(!resetButton.isEnabled()) {
			System.out.println("Reset password button is not enabled.");
			return;
		}
		resetButton.click();
	}
	
	public boolean isResetSuccessful() {
		
		try {
			return resetSuccessful.isDisplayed();
		} catch(NoSuchElementException nse) {
			System.out.println("'Password reset has failed.");
			nse.printStackTrace();
			return false;
		}
	}
	
	public boolean hasResetFailed() {
		
		try {
			if(!resetButton.isEnabled()) {
				return true;
			}
			return resetFailed.isDisplayed();
		} catch(NoSuchElementException nse) {
			System.out.println("'Password reset is successful.");
			return false;
		}
	}
	
	/**
	 * This method will be exposed to Tests
	 * @param email
	 */
	public void resetPassword(String email){
		
		setEmailText(email);
		clickReset();
	}
	
}
