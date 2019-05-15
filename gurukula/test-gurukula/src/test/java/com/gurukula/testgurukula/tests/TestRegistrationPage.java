package com.gurukula.testgurukula.tests;

/**
 * Copyright (c) 2019, ChamLabs.
 * Responsible: Chandra.Sekhar.Muttineni
 * @author https://github.com/cham6
 * @email: paperplanes.chandra@gmail.com
 * @fork: https://github.com/cham6/TestAutomationFrameworkForGurukula
 */

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.gurukula.testgurukula.implementations.TestBaseImpl;
import com.gurukula.testgurukula.pages.RegistrationPage;
import com.gurukula.testgurukula.testData.DataProviders;

/**
 * Test class to test all the scenarios on new user Registration page.
 * @author Chandra.Sekhar.Muttineni
 *
 */

public class TestRegistrationPage extends TestBaseImpl{

	RegistrationPage registrationPage;
	
    @BeforeMethod
    public void setUp() {
    	super.setUp();
        driver.get(registrationUri);
        registrationPage = new RegistrationPage(driver);
    }

    /**
     * Test New user registration with valid details.
     * @param username
     * @param email
     * @param password
     * @param confirmPassword
     */
    @Test(dataProviderClass = DataProviders.class, dataProvider="ValidRegistrationDataProvider",
    		alwaysRun=true)
    public void testSuccessfulRegistration(String username, String email, 
    		String password, String confirmPassword) {
    	
    	Assert.assertTrue(registrationPage.isRegistrationPage());
    	registrationPage.newUserRegistrationDataEntry(username, email, password, confirmPassword);
    	Assert.assertTrue(registrationPage.isRegisterButtonEnabled());
    	registrationPage.clickRegister();
    	Assert.assertTrue(registrationPage.isRegistrationSuccessful());
    }
    
    /**
     * Test new user registration using invalid details.
     * @param username
     * @param email
     * @param password
     * @param confirmPassword
     */
    @Test(dataProviderClass = DataProviders.class, dataProvider="InvalidRegistrationDataProvider",
    		alwaysRun=true)
    public void testFailedRegistration(String username, String email, 
    		String password, String confirmPassword) {
    	
    	Assert.assertTrue(registrationPage.isRegistrationPage());
    	registrationPage.newUserRegistrationDataEntry(username, email, password, confirmPassword);
    	Assert.assertFalse(registrationPage.isRegisterButtonEnabled());
    }
 
    /**
     * Tear down method for cleanup after each test.
     */
    @AfterMethod
    public void tearDown() {
    	super.tearDown();
    }
	
}
