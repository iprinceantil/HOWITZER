package com.qa.jsonGenerator;

public class CostList {
	
	String costName;
	String costType;
	double cost;
	String currencyName;
	
	
	public CostList(String costName, String costType, double cost, String currencyName) {
		super();
		this.costName = costName;
		this.costType = costType;
		this.cost = cost;
		this.currencyName = currencyName;
	}


	public String getCostName() {
		return costName;
	}


	public void setCostName(String costName) {
		this.costName = costName;
	}


	public String getCostType() {
		return costType;
	}


	public void setCostType(String costType) {
		this.costType = costType;
	}


	public double getCost() {
		return cost;
	}


	public void setCost(double cost) {
		this.cost = cost;
	}


	public String getCurrencyName() {
		return currencyName;
	}


	public void setCurrencyName(String currencyName) {
		this.currencyName = currencyName;
	}
	
	
}
