package com.qa.javaLearnings;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.testng.annotations.Test;

public class PrimeNumberTest {

	private static Logger LOG = LogManager.getLogger(PrimeNumberTest.class);

	@Test
	public void LaunchTest() {

		int[] inps = {12,9,11,21,13,99,73};
		
		for(int inp:inps) {
			if(IsNumberPrime(inp) == true) {
				LOG.info("{} is a Prime Number", inp);
			}
			if(IsNumberPrime(inp) == false) {
				LOG.info("{} is not a Prime Number", inp);
			}
		}
		
	}

	public boolean IsNumberPrime(int num) {

		if(num == 0 || num == 1) {
			return false;
		}

		if(num == 2) {
			return true;
		}

		if(num > 2){
			for(int i=3;i<=num/2;i++) {
				if(num % i == 0) {
					return false;	
				}
			}
		}
		return true;
	}

}
