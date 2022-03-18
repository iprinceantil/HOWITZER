package com.qa.javaLearnings;

public class RomanToInteger {

	public static void main(String[] args) {

		System.out.println(romanToInt("III"));
		System.out.println(romanToInt("IV"));
		System.out.println(romanToInt("IX"));
		System.out.println(romanToInt("LVIII"));
		System.out.println(romanToInt("MCMXCIV"));

	}

	public static int romanToInt(String s) {

		int res = 0;

		for(int i=0; i<=s.length()-2; i++) {
			
			if(valueOfRoman(s.charAt(i)) < valueOfRoman(s.charAt(i+1))) {
				res = res - valueOfRoman(s.charAt(i));
			}
			else {
				res = res +valueOfRoman(s.charAt(i));
			}
		}
		res = res + valueOfRoman(s.charAt(s.length()-1));
	
		return res;
	}

	public static int valueOfRoman(char c) {
		int res = 0;
		if(c == 'M') res =  1000;
		if(c == 'D') res =  500;
		if(c == 'C') res =  100;
		if(c == 'L') res =  50;
		if(c == 'X') res =  10;
		if(c == 'V') res =  5;
		if(c == 'I') res =  1;

		return res;
	}

}
