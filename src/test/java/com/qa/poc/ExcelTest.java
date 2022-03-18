package com.qa.poc;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.Test;

import com.qa.utils.ExcelUtil;


public class ExcelTest {
	
	String excelFilePath =System.getProperty("user.dir")+"/src/main/java/com/qa/testData/";
	String excelFileName = "TestData.xlsx";
	String workbookPath = excelFilePath+excelFileName;
	
	@Test(priority = 1)
	public void ReadExcel_1_Test() throws IOException {
		
		System.out.println("--> Exceution started for single value<--");
		String res = new ExcelUtil().readStringDataFromCell(workbookPath, "Sheet1", 2, 2);
		System.out.println("Value in the target Cell is :-"+res+"<--");
		System.out.println("--> Exceution completed for single value<--");
		
	}
	
	@Test(priority = 2)
	public void ReadExcel_2_Test() throws IOException {
		
		System.out.println("--> Exceution started using For Loop<--");
		new ExcelUtil().readAllUsingForLoop(workbookPath, "Sheet1");
		System.out.println("--> Exceution completed using For Loop<--");
		
	}
	
	@Test(priority = 3)
	public void ReadExcel_3_Test() throws IOException {
		
		System.out.println("--> Exceution started using Iterator<--");
		new ExcelUtil().readAllUsingIterator(workbookPath, "Sheet1");
		System.out.println("--> Exceution completed using Iterator<--");
		
	}
	
	@Test(priority = 4)
	public void WriteExcel_1_Test() throws IOException {
		
		//writeToCell(workbookPath, "Sheet1", 4, 4, "FirstInsert");
		updateExcelData(workbookPath, 2, 2, "SecondInsert");		
	}
	
	public void writeToCell(String workbookPath, String sheetName, int rowNum, int colNum, String targetValue) throws IOException {

		FileInputStream inputStream = new FileInputStream(workbookPath);

		XSSFWorkbook workbook = new XSSFWorkbook(inputStream);
		XSSFSheet sheet = workbook.getSheet(sheetName);

		XSSFRow row = sheet.getRow(rowNum-1);
		if(row == null) {
			row = sheet.createRow(rowNum-1);
		}
		else {
			XSSFCell cell = row.getCell(colNum-1);
			if(cell==null) {
				cell = row.createCell(colNum-1);
				cell.setCellValue(targetValue);
			}
			else {
				cell.setCellValue(targetValue);
			}

		}
		XSSFCell cell = row.createCell(colNum-1);
		cell.setCellValue(targetValue);

		workbook.close();

	}
	
	
	
	public void updateExcelData(String workbookPath, int colNumber, int rowNumber, String newData) {

		try {
			FileInputStream inputStream = new FileInputStream(workbookPath);
			
			XSSFWorkbook myExcelBook = new XSSFWorkbook(inputStream);
			XSSFSheet myExcelSheet = myExcelBook.getSheetAt(0);

			Cell cell;
			cell = myExcelSheet.getRow(rowNumber-1).getCell(colNumber-1);
			cell.setCellValue(newData);

			FileOutputStream outFile =new FileOutputStream(workbookPath);
			myExcelBook.write(outFile);
			myExcelBook.close();

		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
