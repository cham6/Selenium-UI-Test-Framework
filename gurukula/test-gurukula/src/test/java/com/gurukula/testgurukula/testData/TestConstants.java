package com.gurukula.testgurukula.testData;

/**
 * Copyright (c) 2019, ChamLabs.
 * Responsible: Chandra.Sekhar.Muttineni
 * @author https://github.com/cham6
 * @email: paperplanes.chandra@gmail.com
 * @fork: https://github.com/cham6/TestAutomationFrameworkForGurukula
 */

import java.io.File;

/**
 * This class provides the environment variables required for all tests.
 * @author Chandra.Sekhar.Muttineni
 *
 */
public class TestConstants {
	
	public static final String TESTDATA_FOLDER = 
			"src" + File.separator 
			+ "test" + File.separator  
			+ "java"  + File.separator 
			+ "com"  + File.separator 
			+ "gurukula"  + File.separator  
			+ "testgurukula"  + File.separator 
			+ "testData";
	
	public static final String HOST = "http://localhost";
	public static final String PORT = "9099";
	public static final String LOGIN_URL = HOST + ":" + PORT;
	public static final String VALID_USERNAME = "admin";
	public static final String VALID_PASSWORD = "admin";
	public static final String FORGOT_PASSWORD_URL = HOST + ":" + PORT + "/#/reset/request";
	public static final String REGISTRATION_URL = HOST + ":" + PORT + "/#/register";

}
