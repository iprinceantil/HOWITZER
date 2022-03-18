package com.qa.javaLearnings;

import java.util.stream.IntStream;

import org.testng.annotations.Test;

public class PrintNumberWithoutLoop {

	@Test
	public void LaunchTest() {
		int start = 1, end = 10;


		new PrintNumberWithoutLoop().printNum(start, end);
		new PrintNumberWithoutLoop().printNumUsingStreams(start, end);
	}

	public void printNum(int startNum, int endNum) {
		if(startNum<=endNum) {
			System.out.println(startNum);
			startNum++;
			printNum(startNum, endNum);
		}
	}

	public void printNumUsingStreams(int startNum, int endNum) {
		IntStream.range(startNum, endNum+1).forEach(e -> System.out.println(e));
	}

}
