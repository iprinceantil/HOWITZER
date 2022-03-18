package com.qa.javaLearnings;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.testng.annotations.Test;

public class SwapTwoNumbersTest {
	
	private static Logger LOG = LogManager.getLogger(SwapTwoNumbersTest.class);

	@Test
	public void launchSwaping() {

		int a1 = 2222;
		int a2 = 2122;
		
		swapWithoutThirdVariable(a1, a2);
		System.out.println();
		swapWithThirdVariable(a1, a2);
	}

	public void swapWithThirdVariable(int num1, int num2) {
		
		LOG.info("First number before Swap : {}",num1);
		LOG.info("Second number before Swap : {}",num2);
		
		int c = 0;
		c = num1;
		num1 = num2;
		num2 = c;
		
		LOG.info("First number after Swap : {}",num1);
		LOG.info("Second number after Swap : {}",num2);
	}

	public void swapWithoutThirdVariable(int num1, int num2) {
		
		LOG.info("First number before Swap : {}",num1);
		LOG.info("Second number before Swap : {}",num2);

		num2 = num2 + num1;
		num1 = num2 - num1;
		num2 = num2 - num1;
		
		LOG.info("First number after Swap : {}",num1);
		LOG.info("Second number after Swap : {}",num2);
		
	}

}
