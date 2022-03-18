package com.qa.jsonGenerator;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.Test;

public class JsonConstants {

	private String workbookPath = System.getProperty("user.dir")+"/src/main/java/com/qa/testData/ApiTestData.xlsx";

	public String INSERT_orderCustomerId ;
	public String INSERT_orderStatusDesc ;
	public String INSERT_orderPlanType ;
	public String INSERT_orderFirstName ;
	public String INSERT_orderLastName ;
	public String INSERT_orderEmailId ;
	public String INSERT_orderPrimaryPhone ;
	public String INSERT_orderMobilePhone ;
	public String INSERT_orderAssociateDetails ;
	public String INSERT_orderCreatedBy ;
	public String INSERT_orderLastUpdatedBy ;
	public String INSERT_orderServiceProviderId ;
	public boolean INSERT_orderKit ;
	public boolean INSERT_orderKitShipped ;
	public String INSERT_orderStoreCode ;

	public String INSERT_billAdrLine1 ;
	public String INSERT_billAdrLine2 ;
	public String INSERT_billAdrCity ;
	public String INSERT_billAdrState ;
	public String INSERT_billAdrCountry ;
	public String INSERT_billAdrZipCode ;

	public int INSERT_orderLine1_ShipmentNo ;
	public int INSERT_orderLine1_OriginalShipmentNo ;
	public String INSERT_orderLine1_ShipmentStatus ;
	public String INSERT_orderLine1_OrderConfirmationDate ;
	public String INSERT_orderLine1_StatusDesc ;
	public String INSERT_orderLine1_RetailBrand ;
	public String INSERT_orderLine1_SkuNumber ;
	public String INSERT_orderLine1_OrderLineStatusDesc ;
	public int INSERT_orderLine1_OrderLineStatusQty ;
	public String INSERT_orderLine1_OrderLineStatusTime ;
	public String INSERT_orderLine1_CreatedBy ;
	public String INSERT_orderLine1_LastUpdatedBy ;
	public String INSERT_orderLine1_OrderId ;
	public int INSERT_orderLine1_OrderLineId ;
	public String INSERT_orderLine1_ReservationId ;
	public double INSERT_orderLine1_CurrentPrice ;
	public String INSERT_orderLine1_WnmEligibility ;
	public String INSERT_orderLine1_wnmFlag ;
	public String INSERT_orderLine1_upcCode ;

	public String INSERT_shipAdrFirstName ;
	public String INSERT_shipAdrLastName ;
	public String INSERT_shipAdrPrimaryPhone ;
	public String INSERT_shipAdrLine1 ;
	public String INSERT_shipAdrLine2 ;
	public String INSERT_shipAdrCity ;
	public String INSERT_shipAdrState ;
	public String INSERT_shipAdrCountry ;
	public String INSERT_shipAdrZipCode ;

	public String INSERT_costList1_CostName ;
	public String INSERT_costList1_CostType ;
	public double INSERT_costList1_Cost ;
	public String INSERT_costList1_CurrencyName ;

	public String INSERT_addProp1_VendorName ;
	public String INSERT_addProp1_ModelName ;
	public String INSERT_addProp1_UpcDescription ;
	public String INSERT_addProp1_Characteristics ;
	public String INSERT_addProp1_Color ;
	public String INSERT_addProp1_Material ;
	public double INSERT_addProp1_CurrentPrice ;

	public void setTestDataFromExcel() {

		INSERT_orderCustomerId = readStringDataFromCell(workbookPath, "CrudTest", 2, 4);
		INSERT_orderStatusDesc = readStringDataFromCell(workbookPath, "CrudTest", 3, 4);
		INSERT_orderPlanType = readStringDataFromCell(workbookPath, "CrudTest", 4, 4);
		INSERT_orderFirstName = readStringDataFromCell(workbookPath, "CrudTest", 5, 4);
		INSERT_orderLastName = readStringDataFromCell(workbookPath, "CrudTest", 6, 4);
		INSERT_orderEmailId = readStringDataFromCell(workbookPath, "CrudTest", 7, 4);
		INSERT_orderPrimaryPhone = readStringDataFromCell(workbookPath, "CrudTest", 8, 4);
		INSERT_orderMobilePhone = readStringDataFromCell(workbookPath, "CrudTest", 9, 4);
		INSERT_orderAssociateDetails = readStringDataFromCell(workbookPath, "CrudTest", 10, 4);
		INSERT_orderCreatedBy = readStringDataFromCell(workbookPath, "CrudTest", 11, 4);
		INSERT_orderLastUpdatedBy = readStringDataFromCell(workbookPath, "CrudTest", 12, 4);
		INSERT_orderServiceProviderId = readStringDataFromCell(workbookPath, "CrudTest", 13, 4);
		INSERT_orderKit = readBooleanDataFromCell(workbookPath, "CrudTest", 14, 4);
		INSERT_orderKitShipped = readBooleanDataFromCell(workbookPath, "CrudTest", 15, 4);
		INSERT_orderStoreCode = readStringDataFromCell(workbookPath, "CrudTest", 16, 4);

		INSERT_billAdrLine1 = readStringDataFromCell(workbookPath, "CrudTest", 17, 4);
		INSERT_billAdrLine2 = readStringDataFromCell(workbookPath, "CrudTest", 18, 4);
		INSERT_billAdrCity = readStringDataFromCell(workbookPath, "CrudTest", 19, 4);
		INSERT_billAdrState = readStringDataFromCell(workbookPath, "CrudTest", 20, 4);
		INSERT_billAdrCountry = readStringDataFromCell(workbookPath, "CrudTest", 21, 4);
		INSERT_billAdrZipCode = readStringDataFromCell(workbookPath, "CrudTest", 22, 4);

		INSERT_orderLine1_ShipmentNo = (int) readDoubleDataFromCell(workbookPath, "CrudTest", 23, 4);
		INSERT_orderLine1_OriginalShipmentNo = (int) readDoubleDataFromCell(workbookPath, "CrudTest", 24, 4);
		INSERT_orderLine1_ShipmentStatus = readStringDataFromCell(workbookPath, "CrudTest", 25, 4);
		INSERT_orderLine1_OrderConfirmationDate = readStringDataFromCell(workbookPath, "CrudTest", 26, 4);
		INSERT_orderLine1_StatusDesc = readStringDataFromCell(workbookPath, "CrudTest", 27, 4);
		INSERT_orderLine1_RetailBrand = readStringDataFromCell(workbookPath, "CrudTest", 28, 4);
		INSERT_orderLine1_SkuNumber = readStringDataFromCell(workbookPath, "CrudTest", 29, 4);
		INSERT_orderLine1_OrderLineStatusDesc = readStringDataFromCell(workbookPath, "CrudTest", 30, 4);
		INSERT_orderLine1_OrderLineStatusQty = (int) readDoubleDataFromCell(workbookPath, "CrudTest", 31, 4);
		INSERT_orderLine1_OrderLineStatusTime = readStringDataFromCell(workbookPath, "CrudTest", 32, 4);
		INSERT_orderLine1_CreatedBy = readStringDataFromCell(workbookPath, "CrudTest", 33, 4);
		INSERT_orderLine1_LastUpdatedBy = readStringDataFromCell(workbookPath, "CrudTest", 34, 4);
		INSERT_orderLine1_OrderId = readStringDataFromCell(workbookPath, "CrudTest", 35, 37);
		INSERT_orderLine1_OrderLineId = (int) readDoubleDataFromCell(workbookPath, "CrudTest", 36, 4);
		INSERT_orderLine1_ReservationId = readStringDataFromCell(workbookPath, "CrudTest", 37, 4);
		INSERT_orderLine1_CurrentPrice = readDoubleDataFromCell(workbookPath, "CrudTest", 38, 4);
		INSERT_orderLine1_WnmEligibility = readStringDataFromCell(workbookPath, "CrudTest", 39, 4);
		INSERT_orderLine1_wnmFlag = readStringDataFromCell(workbookPath, "CrudTest", 40, 4);
		INSERT_orderLine1_upcCode = readStringDataFromCell(workbookPath, "CrudTest", 41, 4);

		INSERT_shipAdrFirstName = readStringDataFromCell(workbookPath, "CrudTest", 42, 4);
		INSERT_shipAdrLastName = readStringDataFromCell(workbookPath, "CrudTest", 43, 4);
		INSERT_shipAdrPrimaryPhone = readStringDataFromCell(workbookPath, "CrudTest", 44, 4);
		INSERT_shipAdrLine1 = readStringDataFromCell(workbookPath, "CrudTest", 45, 4);
		INSERT_shipAdrLine2 = readStringDataFromCell(workbookPath, "CrudTest", 46, 4);
		INSERT_shipAdrCity = readStringDataFromCell(workbookPath, "CrudTest", 47, 4);
		INSERT_shipAdrState = readStringDataFromCell(workbookPath, "CrudTest", 48, 4);
		INSERT_shipAdrCountry = readStringDataFromCell(workbookPath, "CrudTest", 49, 4);
		INSERT_shipAdrZipCode = readStringDataFromCell(workbookPath, "CrudTest", 50, 4);

		INSERT_costList1_CostName = readStringDataFromCell(workbookPath, "CrudTest", 51, 4);
		INSERT_costList1_CostType = readStringDataFromCell(workbookPath, "CrudTest", 52, 4);
		INSERT_costList1_Cost = readDoubleDataFromCell(workbookPath, "CrudTest", 53, 4);
		INSERT_costList1_CurrencyName = readStringDataFromCell(workbookPath, "CrudTest", 54, 4);

		INSERT_addProp1_VendorName = readStringDataFromCell(workbookPath, "CrudTest", 55, 4);
		INSERT_addProp1_ModelName = readStringDataFromCell(workbookPath, "CrudTest", 56, 4);
		INSERT_addProp1_UpcDescription = readStringDataFromCell(workbookPath, "CrudTest", 57, 4);
		INSERT_addProp1_Characteristics = readStringDataFromCell(workbookPath, "CrudTest", 58, 4);
		INSERT_addProp1_Color = readStringDataFromCell(workbookPath, "CrudTest", 59, 4);
		INSERT_addProp1_Material = readStringDataFromCell(workbookPath, "CrudTest", 60, 4);
		INSERT_addProp1_CurrentPrice = readDoubleDataFromCell(workbookPath, "CrudTest", 61, 4);

	}
	
	@Test
	public void SampleTest() {
		
		JsonConstants obj = new JsonConstants();

		System.out.println("<<---Started Fetching Test Data from Excel--->>");
		obj.setTestDataFromExcel();
		System.out.println("<<---Completed Fetching Test Data from Excel--->>");
	}
	
	//	Private Excel Reading Method
	private static String readStringDataFromCell(String workbookPath, String sheetName, int rowNumber, int colnumber) {

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
	
	private static boolean readBooleanDataFromCell(String workbookPath, String sheetName, int rowNumber, int colnumber) {

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
	
	private static double readDoubleDataFromCell(String workbookPath, String sheetName, int rowNumber, int colnumber) {

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

}
