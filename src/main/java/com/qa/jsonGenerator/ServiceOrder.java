package com.qa.jsonGenerator;

import java.util.List;

public class ServiceOrder {
	
	String customerId;
	String statusDesc;
	String planType;
	String firstName;
	String lastName;
	String emailId;
	String primaryPhone;
	String mobilePhone;
	String associateDetails;
	String createdBy;
	String lastUpdatedBy;
	String serviceProviderId;
	boolean kit;
	boolean kitShipped;
	String storeCode;
	
	BillingAddress billingAddress;
	
	List<ServiceOrderItem> serviceOrderItem;

	public ServiceOrder(String customerId, String statusDesc, String planType, String firstName,
			String lastName, String emailId, String primaryPhone, String mobilePhone, String associateDetails,
			String createdBy, String lastUpdatedBy, String serviceProviderId, boolean kit, boolean kitShipped,
			String storeCode, BillingAddress billingAddress, List<ServiceOrderItem> serviceOrderItem) {
		super();
		this.customerId = customerId;
		this.statusDesc = statusDesc;
		this.planType = planType;
		this.firstName = firstName;
		this.lastName = lastName;
		this.emailId = emailId;
		this.primaryPhone = primaryPhone;
		this.mobilePhone = mobilePhone;
		this.associateDetails = associateDetails;
		this.createdBy = createdBy;
		this.lastUpdatedBy = lastUpdatedBy;
		this.serviceProviderId = serviceProviderId;
		this.kit = kit;
		this.kitShipped = kitShipped;
		this.storeCode = storeCode;
		this.billingAddress = billingAddress;
		this.serviceOrderItem = serviceOrderItem;
	}

	public String getCustomerId() {
		return customerId;
	}

	public void setCustomerId(String customerId) {
		this.customerId = customerId;
	}

	public String getStatusDesc() {
		return statusDesc;
	}

	public void setStatusDesc(String statusDesc) {
		this.statusDesc = statusDesc;
	}
	
	public String getPlanType() {
		return planType;
	}

	public void setPlanType(String planType) {
		this.planType = planType;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getemailId() {
		return emailId;
	}

	public void setemailId(String emailId) {
		this.emailId = emailId;
	}

	public String getPrimaryPhone() {
		return primaryPhone;
	}

	public void setPrimaryPhone(String primaryPhone) {
		this.primaryPhone = primaryPhone;
	}

	public String getMobilePhone() {
		return mobilePhone;
	}

	public void setMobilePhone(String mobilePhone) {
		this.mobilePhone = mobilePhone;
	}

	public String getAssociateDetails() {
		return associateDetails;
	}

	public void setAssociateDetails(String associateDetails) {
		this.associateDetails = associateDetails;
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

	public String getServiceProviderId() {
		return serviceProviderId;
	}

	public void setServiceProviderId(String serviceProviderId) {
		this.serviceProviderId = serviceProviderId;
	}

	public boolean getKit() {
		return kit;
	}

	public void setKit(boolean kit) {
		this.kit = kit;
	}

	public boolean getKitShipped() {
		return kitShipped;
	}

	public void setKitShipped(boolean kitShipped) {
		this.kitShipped = kitShipped;
	}

	public String getStoreCode() {
		return storeCode;
	}

	public void setStoreCode(String storeCode) {
		this.storeCode = storeCode;
	}

	public BillingAddress getBillingAddress() {
		return billingAddress;
	}

	public void setBillingAddress(BillingAddress billingAddress) {
		this.billingAddress = billingAddress;
	}

	public List<ServiceOrderItem> getServiceOrderItem() {
		return serviceOrderItem;
	}

	public void setServiceOrderItem(List<ServiceOrderItem> serviceOrderItem) {
		this.serviceOrderItem = serviceOrderItem;
	}
	
}
