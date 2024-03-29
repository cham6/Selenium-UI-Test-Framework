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
import com.gurukula.testgurukula.pages.LoggedInPage;
import com.gurukula.testgurukula.pages.LoginPage;
import com.gurukula.testgurukula.util.TestUtil;

/**
 * Test class to test all the scenarios on Logout option.
 * @author Chandra.Sekhar.Muttineni
 *
 */

public class TestLogout extends TestBaseImpl {

	private LoggedInPage loggedInPage;
	String context = "Logout";
	
    @BeforeMethod
    public void setUp() {
    	super.setUp();
    	TestUtil.loginAndNavigateToContext(driver, context);
    }

    /**
     * Test logout functionality of Gurukula WebApp
     */
    @Test
    public void loginAndNavigateToPasswordPage() {
    	
    	loggedInPage = new LoggedInPage(driver);
    	Assert.assertFalse(loggedInPage.isLoggedIn(), "Logout is not successful");
	}
    
    /**
     * Tear down method for cleanup after each test.
     */
    @AfterMethod
    public void tearDown() {
    	super.tearDown();
    }
	
}
