package com.gurukula.testgurukula.util;

/**
 * Copyright (c) 2019, ChamLabs.
 * Responsible: Chandra.Sekhar.Muttineni
 * @author https://github.com/cham6
 * @email: paperplanes.chandra@gmail.com
 * @fork: https://github.com/cham6/TestAutomationFrameworkForGurukula
 */

import java.io.File;

public class Runtests {

	public static void main(String[] args) {
		String filename = 
				"src" + File.separator 
				+ "test" + File.separator  
				+ "java"  + File.separator 
				+ "com"  + File.separator 
				+ "gurukula"  + File.separator  
				+ "testgurukula"  + File.separator 
				+ "testData" + File.separator + "ValidLoginTestData.xls";
		//TestDataHandler.readTwoCellTestData(filename);
		Integer[] intArray = {1,0,-1,1,2,3,-5,3,0};
		segregateAndPrint(intArray);
	}
	
	public static void segregateAndPrint(Integer[] intArray) {
		
		if(intArray == null || intArray.length==0) {
			System.out.println("Given array is either empty or null. Please fix it");
			return;
		}
		String positiveNumbers = "";
		String negativeNumbers = "";
		String zeros = "";
		for(int i=0; i<intArray.length; i++) {
			if(intArray[i] == 0) {
				zeros = zeros + " " + intArray[i].toString();
			}
			
			if(intArray[i] > 0) {
				positiveNumbers = positiveNumbers + " " + intArray[i].toString();
			}
			
			if(intArray[i] < 0) {
				negativeNumbers = negativeNumbers + " " + intArray[i].toString();
			}
		}
		System.out.println(positiveNumbers);
		System.out.println(negativeNumbers);
		System.out.println(zeros);
		
	}
	
}
