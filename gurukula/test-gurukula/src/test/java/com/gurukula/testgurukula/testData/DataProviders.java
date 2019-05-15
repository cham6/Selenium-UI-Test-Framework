package com.gurukula.testgurukula.testData;

/**
 * Copyright (c) 2019, ChamLabs.
 * Responsible: Chandra.Sekhar.Muttineni
 * @author https://github.com/cham6
 * @email: paperplanes.chandra@gmail.com
 * @fork: https://github.com/cham6/TestAutomationFrameworkForGurukula
 */

import java.io.File;

import org.apache.poi.ss.usermodel.Row;
import org.testng.annotations.DataProvider;

import com.gurukula.testgurukula.util.TestDataHandler;

/**
 * Class to define all TestNG DataProviders for the tests to use.
 * @author Chandra.Sekhar.Muttineni
 *
 */
public class DataProviders {
	
	//Base TestData folder from TestConstants
	static String testDataFolder = TestConstants.TESTDATA_FOLDER;
	
	//Data from each file is loaded into a separate DataProvider.
	static String invalidLoginDataFileName = testDataFolder + File.separator + "FailureLoginTestData.xls";
	static String validLoginDataFileName = testDataFolder + File.separator + "ValidLoginTestData.xls";
	static String validEmailDataFileName = testDataFolder + File.separator + "ValidEmailTestData.xls";
	static String invalidEmailDataFileName = testDataFolder + File.separator + "FailureEmailTestData.xls";
	static String validRegistrationDataFileName = testDataFolder + File.separator + "ValidRegistrationTestData.xls";
	static String invalidRegistrationDataFileName = testDataFolder + File.separator + "FailureRegistrationTestData.xls";
	static String validBranchDataFileName = testDataFolder + File.separator + "ValidBranchTestData.xls";
	static String invalidBranchDataFileName = testDataFolder + File.separator + "InValidBranchTestData.xls";
	static String validStaffDataFileName = testDataFolder + File.separator + "ValidStaffTestData.xls";
	static String invalidStaffDataFileName = testDataFolder + File.separator + "InValidStaffTestData.xls";
	static String validSettingsDataFileName = testDataFolder + File.separator + "ValidSettingsTestData.xls";
	static String invalidSettingsDataFileName = testDataFolder + File.separator + "InValidSettingsTestData.xls";

	/**
	 * DataProvider for Login tests
	 * @return DataProvider Object[][]
	 */
	@DataProvider(name="InvalidLoginDataProvider")
    public static Object[][] getNullEmptyLongDataProvider() {
    	
    	return TestDataHandler.readTestData(invalidLoginDataFileName, 2);
    } 
    
	/**
	 * DataProvider for Login tests
	 * @return DataProvider Object[][]
	 */
    @DataProvider(name="ValidLoginDataProvider")
    public static Object[][] getValidLoginDataProvider() {
    	
    	return TestDataHandler.readTestData(validLoginDataFileName, 2);
    } 
    
    /**
	 * DataProvider for Forgot password tests
	 * @return DataProvider Object[][]
	 */
    @DataProvider(name="ValidEMailDataProvider")
    public static Object[][] getValidEMailDataProvider() {
    	
    	return TestDataHandler.readTestData(validEmailDataFileName, 1);
    	
    } 
    
    /**
	 * DataProvider for Forgot password tests
	 * @return DataProvider Object[][]
	 */
    @DataProvider(name="InvalidEMailDataProvider")
    public static Object[][] getInvalidEMailDataProvider() {
    	
    	return TestDataHandler.readTestData(invalidEmailDataFileName, 1);
    	
    }
    
    /**
	 * DataProvider for Registration tests
	 * @return DataProvider Object[][]
	 */
    @DataProvider(name="ValidRegistrationDataProvider")
    public static Object[][] getValidRegistrationDataProvider() {
    	
    	return TestDataHandler.readTestData(validRegistrationDataFileName, 4);
    } 
    
    /**
	 * DataProvider for Registration tests
	 * @return DataProvider Object[][]
	 */
    @DataProvider(name="InvalidRegistrationDataProvider")
    public static Object[][] getInvalidRegistrationDataProvider() {
    	
    	return TestDataHandler.readTestData(invalidRegistrationDataFileName, 4);
    	
    }
    
    /**
	 * DataProvider for Branch tests
	 * @return DataProvider Object[][]
	 */
    @DataProvider(name="ValidBranchDataProvider")
    public static Object[][] getValidBranchDataProvider() {
    	
    	return TestDataHandler.readTestData(validBranchDataFileName, 2);
    } 
    
    /**
	 * DataProvider for Branch tests
	 * @return DataProvider Object[][]
	 */
    @DataProvider(name="InvalidBranchDataProvider")
    public static Object[][] getInvalidBranchDataProvider() {
    	
    	return TestDataHandler.readTestData(invalidBranchDataFileName, 2);
    	
    }
    
    /**
	 * DataProvider for Staff tests
	 * @return DataProvider Object[][]
	 */
    @DataProvider(name="ValidStaffDataProvider")
    public static Object[][] getValidStaffDataProvider() {
    	
    	return TestDataHandler.readTestData(validStaffDataFileName, 2);
    } 
    
    /**
	 * DataProvider for Staff tests
	 * @return DataProvider Object[][]
	 */
    @DataProvider(name="InvalidStaffDataProvider")
    public static Object[][] getInvalidStaffDataProvider() {
    	
    	return TestDataHandler.readTestData(invalidStaffDataFileName, 2);
    	
    }
    
    /**
	 * DataProvider for Settings tests
	 * @return DataProvider Object[][]
	 */
    @DataProvider(name="ValidSettingsDataProvider")
    public static Object[][] getValidSettingsDataProvider() {
    	
    	return TestDataHandler.readTestData(validSettingsDataFileName, 4);
    } 
    
    /**
	 * DataProvider for Settings tests
	 * @return DataProvider Object[][]
	 */
    @DataProvider(name="InvalidSettingsDataProvider")
    public static Object[][] getInvalidSettingsDataProvider() {
    	
    	return TestDataHandler.readTestData(invalidSettingsDataFileName, 4);
    	
    }
    
}
