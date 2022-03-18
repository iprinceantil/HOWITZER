package com.qa.utils;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Iterator;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import com.qa.testBase.TestBase;

public class ExcelUtil extends TestBase {

	//---------------------------------------------Data Updating Methods--------------------------------------------------

	public String readStringDataFromCell(String workbookPath, String sheetName, int rowNumber, int colnumber) {

		String res=null;
		try {
			FileInputStream inputStream = new FileInputStream(workbookPath);

			XSSFWorkbook workbook = new XSSFWorkbook(inputStream);
			XSSFSheet sheet = workbook.getSheet(sheetName);

			XSSFRow row = sheet.getRow(rowNumber-1);
			XSSFCell cell = row.getCell(colnumber-1);

			workbook.close();

			res = cell.getStringCellValue();
		}catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		return res;
	}

	public boolean readBooleanDataFromCell(String workbookPath, String sheetName, int rowNumber, int colnumber) {

		boolean res = true;
		try {
			FileInputStream inputStream = new FileInputStream(workbookPath);

			XSSFWorkbook workbook = new XSSFWorkbook(inputStream);
			XSSFSheet sheet = workbook.getSheet(sheetName);

			XSSFRow row = sheet.getRow(rowNumber-1);
			XSSFCell cell = row.getCell(colnumber-1);

			workbook.close();

			res = cell.getBooleanCellValue();
		}catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}

		return res;
	}

	public double readDoubleDataFromCell(String workbookPath, String sheetName, int rowNumber, int colnumber) {

		double res = 0.0;
		try {
			FileInputStream inputStream = new FileInputStream(workbookPath);

			XSSFWorkbook workbook = new XSSFWorkbook(inputStream);
			XSSFSheet sheet = workbook.getSheet(sheetName);

			XSSFRow row = sheet.getRow(rowNumber-1);
			XSSFCell cell = row.getCell(colnumber-1);

			workbook.close();

			res = cell.getNumericCellValue();

		}catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		return res;
	}

	public void readAllUsingForLoop(String workbookPath, String sheetName) throws IOException {

		FileInputStream inputStream = new FileInputStream(workbookPath);

		XSSFWorkbook workbook = new XSSFWorkbook(inputStream);
		XSSFSheet sheet = workbook.getSheet(sheetName); //XSSFSheet sheet = workbook.getSheetAt();

		int rows = sheet.getLastRowNum();
		int cols = sheet.getRow(1).getLastCellNum();

		for(int r=0;r<=rows;r++) {
			XSSFRow row = sheet.getRow(r);
			for(int c=0;c<cols;c++) {
				XSSFCell cell = row.getCell(c);
				switch(cell.getCellType()) {
				case STRING: System.out.print(cell.getStringCellValue());
				break;
				case NUMERIC: System.out.print(cell.getNumericCellValue());
				break;
				case BOOLEAN: System.out.print(cell.getBooleanCellValue());
				break;
				default: System.out.println("Out of bound");
				break;
				}
				System.out.print(" | ");
			}
			System.out.println();
		}

		workbook.close();
	}

	public void readAllUsingIterator(String workbookPath, String sheetName) throws IOException {

		FileInputStream inputStream = new FileInputStream(workbookPath);

		XSSFWorkbook workbook = new XSSFWorkbook(inputStream);	
		XSSFSheet sheet = workbook.getSheet(sheetName); //XSSFSheet sheet = workbook.getSheetAt();

		Iterator<Row> iterator = sheet.iterator();
		while(iterator.hasNext()) {
			XSSFRow row = (XSSFRow) iterator.next();
			Iterator<Cell> cellIterator = row.cellIterator();
			while(cellIterator.hasNext()) 
			{
				XSSFCell cell = (XSSFCell) cellIterator.next();
				switch(cell.getCellType()) {
				case STRING: System.out.print(cell.getStringCellValue());
				break;
				case NUMERIC: System.out.print(cell.getNumericCellValue());
				break;
				case BOOLEAN: System.out.print(cell.getBooleanCellValue());
				break;
				default: System.out.println("Out of bound");
				break;
				}
				System.out.print(" | ");
			}
			System.out.println();
		}
		workbook.close();
	}


}
