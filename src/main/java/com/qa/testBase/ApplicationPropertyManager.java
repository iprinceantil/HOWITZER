package com.qa.testBase;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

public class ApplicationPropertyManager {

	private Properties properties;
	private final String PATH_PROP_FILE = System.getProperty("user.dir")+"/src/main/resources/application.properties";

	protected ApplicationPropertyManager(){
		BufferedReader reader;
		try {
			reader = new BufferedReader(new FileReader(PATH_PROP_FILE));
			properties = new Properties();
			try {
				properties.load(reader);
				reader.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
			throw new RuntimeException("APPLICATION.PROPERTIES file not found at " + PATH_PROP_FILE);
		}		
	}

	public String getPropertyValue(String Key) {

		String str = properties.getProperty(Key);
		if(str != null && str.length() > 0) return str;
		else throw new RuntimeException("VALUE NOT SPECIFIED IN APPLICATION.PROPERTIES file for Key : "+Key);
	}

}
