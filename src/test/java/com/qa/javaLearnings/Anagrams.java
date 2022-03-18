package com.qa.javaLearnings;

import java.util.Arrays;

import org.testng.annotations.Test;

public class Anagrams {

	/* Scenario = words having same letters are known as Anagrams 
	 * 
	 * Steps to Achieve
	 * 
	 * Step 1 -> capture both string and remove all white spaces
	 * Step 2 -> check length, if not same not anagram.
	 * Step 3 -> Convert both string to char Array.
	 * Step 4 -> Sort both the Arrays.
	 * Step 5 -> Compare both the arrays and return.
	 * */
/*
	public static void main(String[] args) {

		System.out.println(isAnagram("Listen", "Silent"));
	}
	*/
	@Test
	public void LaunchTest() {
		System.out.println(isAnagram("Listen", "Silent"));
	}

	public static boolean isAnagram(String s1, String s2) {

		String str1 = s1.replaceAll("\\s", "");
		String str2 = s2.replaceAll("\\s", "");

		if(str1.length() != str2.length()) {
			return false;
		}
		else {
			char c1[] = str1.toUpperCase().toCharArray();
			char c2[] = str2.toUpperCase().toCharArray();

			Arrays.sort(c1);
			Arrays.sort(c2);

			return Arrays.equals(c1, c2);
		}

	}

}
