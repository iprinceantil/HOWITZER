package com.qa.poc;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.GregorianCalendar;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.Test;
import com.qa.testBase.TestBase;

public class ZZZ extends TestBase {
	
	String revenueWorkbookPath = System.getProperty("user.dir")+"/src/main/resources/Revenue.xlsx";

	@Test
	public void SampleTest() throws IOException {
		
		int recordsCount = getRecordCount(revenueWorkbookPath, "Sheet1");
		System.out.println("Total number of records are -->"+(recordsCount-1)+"<--");

		for(int i=2;i<=recordsCount;i++) {
			String targetCaseId = readStringDataFromCell(revenueWorkbookPath, "Sheet1", i, 1);
			String nextHearingDate = readDateFromCell(revenueWorkbookPath, "Sheet1", i, 2);
			System.out.println(targetCaseId+"-----------------"+nextHearingDate);
		}
		
	}
	
	private String readStringDataFromCell(String workbookPath, String sheetName, int rowNumber, int colnumber) {

		String res=null;
		try {
			FileInputStream inputStream = new FileInputStream(workbookPath);

			XSSFWorkbook workbook = new XSSFWorkbook(inputStream);
			XSSFSheet sheet = workbook.getSheet(sheetName);

			XSSFRow row = sheet.getRow(rowNumber-1);
			XSSFCell cell = row.getCell(colnumber-1);

			workbook.close();
			if(cell.getCellType().equals("NUMERIC")) {
				res = cell.getDateCellValue().toString();
			}
			else {
				res = cell.getStringCellValue();
			}
			
		}catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		return res;
	}
	
	private String readDateFromCell(String workbookPath, String sheetName, int rowNumber, int colnumber) {

		String res =null;
		try {
			FileInputStream inputStream = new FileInputStream(workbookPath);

			XSSFWorkbook workbook = new XSSFWorkbook(inputStream);
			XSSFSheet sheet = workbook.getSheet(sheetName);

			XSSFRow row = sheet.getRow(rowNumber-1);
			XSSFCell cell = row.getCell(colnumber-1);

			workbook.close();
			
			DateFormat df = new SimpleDateFormat("dd/MM/yyyy");
			Calendar cal = new GregorianCalendar();
			cal.setTime(cell.getDateCellValue());
			res = df.format(cal.getTime());
			
			
		}catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		return res;
	}
	
	private int getRecordCount(String workbookPath, String sheetName) {

		int rows = 0;
		try {
			FileInputStream inputStream = new FileInputStream(workbookPath);

			XSSFWorkbook workbook = new XSSFWorkbook(inputStream);
			XSSFSheet sheet = workbook.getSheet(sheetName);

			rows = sheet.getLastRowNum();

			workbook.close();
		}catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}

		return rows+1;
	}

}
