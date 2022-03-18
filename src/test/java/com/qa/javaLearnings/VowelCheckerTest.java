package com.qa.javaLearnings;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.testng.annotations.Test;

public class VowelCheckerTest {

	private static Logger LOG = LogManager.getLogger(VowelCheckerTest.class);

	@Test
	public void LaunchTest() {

		String[] inputs = {"Prince","qwrty","Chinu"};

		for(String input:inputs) {
			if(checkVowel(input) == true) {
				LOG.info("Input String contains vowel");
			}else {
				LOG.info("Input String contains only Consonents");
			}
		}
	}

	public boolean checkVowel(String input) {

		return input.toUpperCase().matches(".*[AEIOU].*");

	}

}
