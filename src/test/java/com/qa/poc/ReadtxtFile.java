package com.qa.poc;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import org.testng.annotations.Test;

public class ReadtxtFile {

	String PATH_TXT_FILE = System.getProperty("user.dir")+"/src/test/resources/getdeliverydatesWHSE.txt";

	@Test
	public void LaunchTest() {

		System.out.println(getKey(1,3,PATH_TXT_FILE));
		
	}
	
	public static String getKey(int rowIndex, int columnindex, String txtFilePath) {
		
		String[] temp = readRowsAsList(txtFilePath).get(rowIndex).split("\\|");
		return temp[columnindex].trim();
	}
	
	
	private static List<String> readRowsAsList(String txtFilePath){
		
		List<String> inps = new ArrayList<>();

		try {
			Scanner sc = new Scanner(new File(txtFilePath));
			while (sc.hasNextLine()) {
				inps.add(sc.nextLine().substring(1)); 
			}
			sc.close();
		} catch (FileNotFoundException e) {
			throw new RuntimeException("TARGET_TXT_FILE_PATH_IS_INCORRECT");
		}

		return inps;
	}

}
