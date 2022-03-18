package com.qa.poc;

import java.util.ArrayList;

import org.testng.annotations.Test;

public class YYY {

	@Test
	public void smapleTest() {

		String inp = "My name is Prince my Qualification is BTech";

		ArrayList<String> ops = extract(inp);
		System.out.println();
		for(String op:ops) {
			System.out.print(op+" ");
		}
		System.out.println();
	}

	public ArrayList<String> extract(String str) {
  
		String[] inpArray = str.split("\\s");
		ArrayList<String> res = new ArrayList<String>();
		
		for(int i=0; i<inpArray.length;i++) {
			if(i % 2 !=0){
				res.add(inpArray[i]);
			}
		}
		return res;
	}

}
