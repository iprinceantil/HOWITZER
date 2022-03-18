package com.qa.javaLearnings;

import java.util.HashMap;
import java.util.Map;

public class CharacterCountInString {
	
	public static void main(String[] args) {
		
		String[] inps = {"RADAR","Chinu","Antil",};
		for(String inp:inps) {
			getCharCount(inp);
		}
 		
	}
	
	public static void getCharCount(String inputString) {
		Map<Character,Integer> charMap = new HashMap<Character, Integer>();
		char[] strArray = inputString.toCharArray();
		for(char str:strArray) {
			if(charMap.containsKey(str)) {
				charMap.put(str, charMap.get(str)+1);
			}else {
				charMap.put(str, 1);
			}
		}
		System.out.println(inputString+" : "+charMap);
	}

}
