package com.qa.javaLearnings;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.testng.annotations.Test;

public class StringReverseTest {

	private static Logger LOG = LogManager.getLogger(StringReverseTest.class);

	@Test
	public void launchTest() {

		String[] inps1 = {"","    ",null,"This is a test String"};
		for(String inp1:inps1) {
			LOG.info(reverseString(inp1));
		}
		
		String[] inps2 = {"RADAR", "SONAR",};
		for(String inp2:inps2) {
			if(IsPalindrome(inp2) == true) {
				LOG.info("{} IS A PALINDROME",inp2);
			}
			else {
				LOG.info("{} IS NOT A PALINDROME", inp2);
			}

		}
		
	}

	public String reverseString(String input) {

		if(input == null || input.trim().isEmpty()) {
			return "NULL IS NOT AN VALID INPUT";
		}
		else {
			String res = "";
			for(int i=0; i<=input.length()-1;i++) {
				res = input.charAt(i) + res;
			}
			return res;
		}
	}

	public boolean IsPalindrome(String input) {

		boolean res = false;

		for(int i=0; i<input.length()/2; i++) {
			if(input.charAt(i) != input.charAt(input.length()-i-1)) {
				res = false;
			}
			else {
				res = true;
			}
		}
		return res;

	}

}
