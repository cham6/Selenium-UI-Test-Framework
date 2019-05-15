package com.gurukula.testgurukula.util;

/**
 * Copyright (c) 2019, ChamLabs.
 * Responsible: Chandra.Sekhar.Muttineni
 * @author https://github.com/cham6
 * @email: paperplanes.chandra@gmail.com
 * @fork: https://github.com/cham6/TestAutomationFrameworkForGurukula
 */

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

public class GlobalProperties {
	public static String TESTURI="http://localhost:9099";
	public static String USERNAME="admin";
	public static String PASSWORD="admin";
	public void readProperties() {
		InputStream iStream = null;
			try {
				Properties properties = new Properties();
				iStream = GlobalProperties.class.getResourceAsStream("config.properties");
				//iStream = new FileInputStream("../config.properties");
				properties.load(iStream);
				
				TESTURI = properties.getProperty("uri");
				USERNAME = properties.getProperty("username");
				PASSWORD = properties.getProperty("password");
				iStream.close();
				
			} catch(IOException e) {
				System.out.println("An exception has occurred in GlobalProperties static block.");
				System.out.println(e.getMessage());
				e.printStackTrace();
			} finally {
				if (iStream != null) {
					try {
						iStream.close();
					} catch (IOException e) {
						e.printStackTrace();
					}
				}
			}
		}
	}
