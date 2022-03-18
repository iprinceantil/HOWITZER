package com.qa.jsonGenerator;

import java.util.List;

public class ServiceOrderItem {

	String wnmFlag;
	String wnmEligiblity;
	int shipmentNo;
	int originalShipmentNo;
	String shipmentStatus;
	String orderConfirmationDate;
	String statusDesc;
	String retailBrand;
	String skuNumber;
	String orderLineStatusDesc;
	int orderLineStatusQty;
	String orderLineStatusTime;
	String createdBy;
	String lastUpdatedBy;
	String orderId;
	int orderLineId;
	String reservationId;
	double currentPrice;
	String upcCode;

	ShippingAddress shippingAddress;
	List<CostList> costList;
	AdditionalProperties additionalProperties;
	public ServiceOrderItem(String wnmFlag, String wnmEligiblity, int shipmentNo, int originalShipmentNo,
			String shipmentStatus, String orderConfirmationDate, String statusDesc, String retailBrand,
			String skuNumber, String orderLineStatusDesc, int orderLineStatusQty, String orderLineStatusTime,
			String createdBy, String lastUpdatedBy, String orderId, int orderLineId, String reservationId,
			double currentPrice, String upcCode, ShippingAddress shippingAddress, List<CostList> costList,
			AdditionalProperties additionalProperties) {
		super();
		this.wnmFlag = wnmFlag;
		this.wnmEligiblity = wnmEligiblity;
		this.shipmentNo = shipmentNo;
		this.originalShipmentNo = originalShipmentNo;
		this.shipmentStatus = shipmentStatus;
		this.orderConfirmationDate = orderConfirmationDate;
		this.statusDesc = statusDesc;
		this.retailBrand = retailBrand;
		this.skuNumber = skuNumber;
		this.orderLineStatusDesc = orderLineStatusDesc;
		this.orderLineStatusQty = orderLineStatusQty;
		this.orderLineStatusTime = orderLineStatusTime;
		this.createdBy = createdBy;
		this.lastUpdatedBy = lastUpdatedBy;
		this.orderId = orderId;
		this.orderLineId = orderLineId;
		this.reservationId = reservationId;
		this.currentPrice = currentPrice;
		this.upcCode = upcCode;
		this.shippingAddress = shippingAddress;
		this.costList = costList;
		this.additionalProperties = additionalProperties;
	}
	public String getWnmFlag() {
		return wnmFlag;
	}
	public void setWnmFlag(String wnmFlag) {
		this.wnmFlag = wnmFlag;
	}
	public String getWnmEligiblity() {
		return wnmEligiblity;
	}
	public void setWnmEligiblity(String wnmEligiblity) {
		this.wnmEligiblity = wnmEligiblity;
	}
	public int getShipmentNo() {
		return shipmentNo;
	}
	public void setShipmentNo(int shipmentNo) {
		this.shipmentNo = shipmentNo;
	}
	public int getOriginalShipmentNo() {
		return originalShipmentNo;
	}
	public void setOriginalShipmentNo(int originalShipmentNo) {
		this.originalShipmentNo = originalShipmentNo;
	}
	public String getShipmentStatus() {
		return shipmentStatus;
	}
	public void setShipmentStatus(String shipmentStatus) {
		this.shipmentStatus = shipmentStatus;
	}
	public String getOrderConfirmationDate() {
		return orderConfirmationDate;
	}
	public void setOrderConfirmationDate(String orderConfirmationDate) {
		this.orderConfirmationDate = orderConfirmationDate;
	}
	public String getStatusDesc() {
		return statusDesc;
	}
	public void setStatusDesc(String statusDesc) {
		this.statusDesc = statusDesc;
	}
	public String getRetailBrand() {
		return retailBrand;
	}
	public void setRetailBrand(String retailBrand) {
		this.retailBrand = retailBrand;
	}
	public String getSkuNumber() {
		return skuNumber;
	}
	public void setSkuNumber(String skuNumber) {
		this.skuNumber = skuNumber;
	}
	public String getOrderLineStatusDesc() {
		return orderLineStatusDesc;
	}
	public void setOrderLineStatusDesc(String orderLineStatusDesc) {
		this.orderLineStatusDesc = orderLineStatusDesc;
	}
	public int getOrderLineStatusQty() {
		return orderLineStatusQty;
	}
	public void setOrderLineStatusQty(int orderLineStatusQty) {
		this.orderLineStatusQty = orderLineStatusQty;
	}
	public String getOrderLineStatusTime() {
		return orderLineStatusTime;
	}
	public void setOrderLineStatusTime(String orderLineStatusTime) {
		this.orderLineStatusTime = orderLineStatusTime;
	}
	public String getCreatedBy() {
		return createdBy;
	}
	public void setCreatedBy(String createdBy) {
		this.createdBy = createdBy;
	}
	public String getLastUpdatedBy() {
		return lastUpdatedBy;
	}
	public void setLastUpdatedBy(String lastUpdatedBy) {
		this.lastUpdatedBy = lastUpdatedBy;
	}
	public String getOrderId() {
		return orderId;
	}
	public void setOrderId(String orderId) {
		this.orderId = orderId;
	}
	public int getOrderLineId() {
		return orderLineId;
	}
	public void setOrderLineId(int orderLineId) {
		this.orderLineId = orderLineId;
	}
	public String getReservationId() {
		return reservationId;
	}
	public void setReservationId(String reservationId) {
		this.reservationId = reservationId;
	}
	public double getCurrentPrice() {
		return currentPrice;
	}
	public void setCurrentPrice(double currentPrice) {
		this.currentPrice = currentPrice;
	}
	public String getUpcCode() {
		return upcCode;
	}
	public void setUpcCode(String upcCode) {
		this.upcCode = upcCode;
	}
	public ShippingAddress getShippingAddress() {
		return shippingAddress;
	}
	public void setShippingAddress(ShippingAddress shippingAddress) {
		this.shippingAddress = shippingAddress;
	}
	public List<CostList> getCostList() {
		return costList;
	}
	public void setCostList(List<CostList> costList) {
		this.costList = costList;
	}
	public AdditionalProperties getAdditionalProperties() {
		return additionalProperties;
	}
	public void setAdditionalProperties(AdditionalProperties additionalProperties) {
		this.additionalProperties = additionalProperties;
	}
	
	
}
