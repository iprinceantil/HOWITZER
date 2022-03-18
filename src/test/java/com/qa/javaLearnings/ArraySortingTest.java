package com.qa.javaLearnings;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.testng.annotations.Test;

public class ArraySortingTest {
	
	private static Logger LOG = LogManager.getLogger(ArraySortingTest.class);

	@Test
	public void LaunchTest() {
		
		int[] inps = {4,3,5,2,6,3,9,8,7,1};
		
		LOG.info("Maximum value is {}",MaxValueIs(inps));
		LOG.info("2nd Maximum value is {}", SecondMaxValue(inps));
		LOG.info("Minimum value is {}",MinValueIs(inps));
		LOG.info("2nd Minimum value is {}", SecondMinValue(inps));
		
	}
	
	public int MaxValueIs(int[] input) {
		
		int max = input[0];
		for(int in:input) {
			if(in > max) {
				max = in;
			}
		}
		
		return max;
	}
	
	public int MinValueIs(int[] input) {
		int min = input[0];
		for(int in:input) {
			if(in < min) {
				min = in;
			}
		}
		return min;
	}
	
	public int SecondMaxValue(int[] input) {
		int res = 0;
		
		return res;
	}
	
	public int SecondMinValue(int[] input) {
		int res = 0;
		
		return res;
	}

}
