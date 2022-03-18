package com.qa.jsonGenerator;

public class AdditionalProperties {
	
	String vendorName;
	String modelname;
	String upcDescription;
	String characteristics;
	String color;
	String material;
	double currentPrice;
	
	
	public AdditionalProperties(String vendorName, String modelname, String upcDescription, String characteristics,
			String color, String material, double currentPrice) {
		super();
		this.vendorName = vendorName;
		this.modelname = modelname;
		this.upcDescription = upcDescription;
		this.characteristics = characteristics;
		this.color = color;
		this.material = material;
		this.currentPrice = currentPrice;
	}


	public String getVendorName() {
		return vendorName;
	}


	public void setVendorName(String vendorName) {
		this.vendorName = vendorName;
	}


	public String getModelname() {
		return modelname;
	}


	public void setModelname(String modelname) {
		this.modelname = modelname;
	}


	public String getUpcDescription() {
		return upcDescription;
	}


	public void setUpcDescription(String upcDescription) {
		this.upcDescription = upcDescription;
	}


	public String getCharacteristics() {
		return characteristics;
	}


	public void setCharacteristics(String characteristics) {
		this.characteristics = characteristics;
	}


	public String getColor() {
		return color;
	}


	public void setColor(String color) {
		this.color = color;
	}


	public String getMaterial() {
		return material;
	}


	public void setMaterial(String material) {
		this.material = material;
	}


	public double getCurrentPrice() {
		return currentPrice;
	}


	public void setCurrentPrice(double currentPrice) {
		this.currentPrice = currentPrice;
	}
	
}
