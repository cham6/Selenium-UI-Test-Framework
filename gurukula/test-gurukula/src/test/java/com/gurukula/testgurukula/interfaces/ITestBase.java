package com.gurukula.testgurukula.interfaces;

/**
 * Copyright (c) 2019, ChamLabs.
 * Responsible: Chandra.Sekhar.Muttineni
 * @author https://github.com/cham6
 * @email: paperplanes.chandra@gmail.com
 * @fork: https://github.com/cham6/TestAutomationFrameworkForGurukula
 */

/**
 * Simple contract for any test class. This can be updated and implemented for any future uses. 
 * @author Chandra.Sekhar.Muttineni
 *
 */
public interface ITestBase {

	//Provide a contract basis for any test as part of the framework.
	 void setUp();
    
	 void tearDown();
}
