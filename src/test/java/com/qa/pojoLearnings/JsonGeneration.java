package com.qa.pojoLearnings;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import org.testng.annotations.Test;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.qa.jsonGenerator.AdditionalProperties;
import com.qa.jsonGenerator.BillingAddress;
import com.qa.jsonGenerator.CostList;
import com.qa.jsonGenerator.JsonConstants;
import com.qa.jsonGenerator.ServiceOrder;
import com.qa.jsonGenerator.ServiceOrderItem;
import com.qa.jsonGenerator.ShippingAddress;

public class JsonGeneration {

	String nameJsonFile = "sample.json";

	@Test
	public void GenerationTest() {

		JsonConstants obj = new JsonConstants();
		
		System.out.println("<<---Started Fetching Test Data from Excel--->>");
		obj.setTestDataFromExcel();
		System.out.println("<<---Completed Fetching Test Data from Excel--->>");

		generateJson(obj.INSERT_orderCustomerId, obj.INSERT_orderStatusDesc, obj.INSERT_orderPlanType,obj.INSERT_orderFirstName, obj.INSERT_orderLastName, obj.INSERT_orderEmailId, obj.INSERT_orderPrimaryPhone, obj.INSERT_orderMobilePhone, obj.INSERT_orderAssociateDetails, obj.INSERT_orderCreatedBy, obj.INSERT_orderLastUpdatedBy, obj.INSERT_orderServiceProviderId, obj.INSERT_orderKit, obj.INSERT_orderKitShipped, obj.INSERT_orderStoreCode,
				obj.INSERT_billAdrLine1, obj.INSERT_billAdrLine2, obj.INSERT_billAdrCity, obj.INSERT_billAdrState, obj.INSERT_billAdrCountry, obj.INSERT_billAdrZipCode,
				obj.INSERT_orderLine1_wnmFlag, obj.INSERT_orderLine1_WnmEligibility, obj.INSERT_orderLine1_ShipmentNo, obj.INSERT_orderLine1_OriginalShipmentNo, obj.INSERT_orderLine1_ShipmentStatus, obj.INSERT_orderLine1_OrderConfirmationDate, obj.INSERT_orderLine1_StatusDesc, obj.INSERT_orderLine1_RetailBrand, obj.INSERT_orderLine1_SkuNumber, obj.INSERT_orderLine1_OrderLineStatusDesc,obj.INSERT_orderLine1_OrderLineStatusQty, obj.INSERT_orderLine1_OrderLineStatusTime, obj.INSERT_orderLine1_CreatedBy, obj.INSERT_orderLine1_LastUpdatedBy, obj.INSERT_orderLine1_OrderId, obj.INSERT_orderLine1_OrderLineId, obj.INSERT_orderLine1_ReservationId, obj.INSERT_orderLine1_CurrentPrice, obj.INSERT_orderLine1_upcCode,
				obj.INSERT_shipAdrFirstName, obj.INSERT_shipAdrLastName, obj.INSERT_shipAdrPrimaryPhone, obj.INSERT_shipAdrLine1, obj.INSERT_shipAdrLine2, obj.INSERT_shipAdrCity, obj.INSERT_shipAdrState, obj.INSERT_shipAdrCountry, obj.INSERT_shipAdrZipCode,
				obj.INSERT_costList1_CostName, obj.INSERT_costList1_CostType, obj.INSERT_costList1_Cost, obj.INSERT_costList1_CurrencyName,
				obj.INSERT_addProp1_VendorName, obj.INSERT_addProp1_ModelName, obj.INSERT_addProp1_UpcDescription, obj.INSERT_addProp1_Characteristics, obj.INSERT_addProp1_Color, obj.INSERT_addProp1_Material, obj.INSERT_addProp1_CurrentPrice,
				nameJsonFile);

	}
	

	public void generateJson(String orderCustomerId, String orderStatusDesc, String orderPlanType, String orderFirstName, String orderLastName, String orderEmailId, String orderPrimaryPhone, String orderMobilePhone, String orderAssociateDetails, String orderCreatedBy, String orderLastUpdatedBy, String orderServiceProviderId, boolean orderKit, boolean orderKitShipped, String orderStoreCode,
			String billAdrLine1, String billAdrLine2, String billAdrCity, String billAdrState, String billAdrCountry, String billAdrZipCode,
			String lineWnmFlag, String lineWnmEligiblity, int lineShipmentNo, int lineOriginalShipmentNo, String lineShipmentStatus, String lineOrderConfirmationDate, String LineStatusDesc, String lineRetailBrand, String lineSkuNumber, String lineOrderLineStatusDesc, int lineOrderLineStatusQty, String lineOrderLineStatusTime, String lineCreatedBy, String lineLastUpdatedBy, String lineOrderId, int lineOrderLineId, String lineReservationId, double lineCurrentPrice, String lineUpcCode,
			String shipAdrFirstName, String shipAdrLastName, String shipAdrPrimaryPhone, String shipAdrLine1, String shipAdrLine2, String shipAdrCity, String shipAdrState, String shipAdrCountry, String shipAdrZipCode, 
			String costName, String costType, double cost, String currencyName, 
			String AddPropVendorName, String AddPropModelname, String AddPropUpcDescription, String AddPropCharacteristics, String AddPropColor, String AddPropMaterial, double AddPropcurrentPrice,
			String jsonFileName) {

		List<CostList> objCostListList = new ArrayList<>();
		CostList objCostList = new CostList(costName, costType, cost, currencyName);
		objCostListList.add(objCostList);

		ShippingAddress objShippingAddress = new ShippingAddress(shipAdrFirstName, shipAdrLastName, shipAdrPrimaryPhone, shipAdrLine1, shipAdrLine2, shipAdrCity, shipAdrState, shipAdrCountry, shipAdrZipCode);
		AdditionalProperties objAdditionalPrperties = new AdditionalProperties(AddPropVendorName, AddPropModelname, AddPropUpcDescription, AddPropCharacteristics, AddPropColor, AddPropMaterial, AddPropcurrentPrice);

		List<ServiceOrderItem> objServiceOrderItemList = new ArrayList<>();
		ServiceOrderItem objServiceOrderItem = new ServiceOrderItem(lineWnmFlag, lineWnmEligiblity, lineShipmentNo, lineOriginalShipmentNo, lineShipmentStatus, lineOrderConfirmationDate, LineStatusDesc, lineRetailBrand, lineSkuNumber, lineOrderLineStatusDesc, lineOrderLineStatusQty, lineOrderLineStatusTime, lineCreatedBy, lineLastUpdatedBy, lineOrderId, lineOrderLineId, lineReservationId, lineCurrentPrice, lineUpcCode, objShippingAddress, objCostListList, objAdditionalPrperties);
		objServiceOrderItemList.add(objServiceOrderItem);

		BillingAddress objBillingAddress = new BillingAddress(billAdrLine1, billAdrLine2, billAdrCity, billAdrState, billAdrCountry, billAdrZipCode);
		ServiceOrder objServiceOrder = new ServiceOrder(orderCustomerId, orderStatusDesc, orderPlanType, orderFirstName, orderLastName, orderEmailId, orderPrimaryPhone, orderMobilePhone, orderAssociateDetails, orderCreatedBy, orderLastUpdatedBy, orderServiceProviderId, orderKit, orderKitShipped, orderStoreCode, objBillingAddress, objServiceOrderItemList);

		try {
			new ObjectMapper().writeValue(new File(System.getProperty("user.dir")+"/src/main/resources/payload/Crud/"+nameJsonFile), objServiceOrder);
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

}
