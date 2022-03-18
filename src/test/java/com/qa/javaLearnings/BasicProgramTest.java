package com.qa.javaLearnings;

import org.testng.annotations.Test;

public class BasicProgramTest {
	
	//private static final Logger LOG = LogManager.getLogger(BasicProgramTest.class);
	
	@Test
	public void SumOfNaturalNumbers() {
		
		int inp = 10, sum = 0;
		
		for(int i=1; i<=inp; i++) {
			sum =sum + i;
		}
		System.out.println("Sum of first "+inp+" natural numbers is : "+sum);
		
	}
	
	@Test
	public void FactorialOf() {
		
		int inp = 5, fact = 1;
		
		for(int i=1; i<=inp; i++) {
			fact = fact * i;
		}
		
		System.out.println("factorial of "+inp+" is : "+fact);
	}
	
	@Test
	public void SumOfDigitsOfNumber() {
		
		int inp = 12345, sum = 0;
		
		
		
		System.out.println("Sum of digits of "+inp+" is : "+sum);
	}

}
