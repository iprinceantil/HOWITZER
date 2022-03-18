package com.qa.javaLearnings;

import java.util.ArrayList;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.testng.annotations.Test;

public class FibonacciSeriesTest {

	private static Logger LOG = LogManager.getLogger(FibonacciSeriesTest.class);

	@Test
	public void LaunchTest() {

		int lengthOfSeries = 10;

		LOG.info(generateFibonacciSeries(lengthOfSeries).toString());

	}

	public ArrayList<Integer> generateFibonacciSeries(int lengthOfSeries) {

		ArrayList<Integer> res = new ArrayList<Integer>();

		int a1 = 0, a2 = 1, a3 = 1;

		for(int i=1; i<= lengthOfSeries; i++) {
			res.add(a1);
			a1=a2;
			a2=a3;
			a3=a1+a2;
		}

		return res;
	}

}
