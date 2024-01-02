package com.cms.bean;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "tbl_car")

public class Carz {
	@Id
	@Column(name = "Car_no")
	private String carNo;
	@Column(name = "Manufacture")
	private String manufacturer;
	@Column(name = "Model")
	private String model;
	@Column(name = "Kmsran")
	private int kmsRan;
	@Column(name = "Priceexpected")
	private int priceExpected;
	@Column(name = "Noofowners")
	private int noofOwners;

	public String getCarNo() {
		return carNo;
	}

	public void setCarNo(String carNo) {
		this.carNo = carNo;
	}

	public String getManufacturer() {
		return manufacturer;
	}

	public void setManufacturer(String manufacturer) {
		this.manufacturer = manufacturer;
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public int getKmsRan() {
		return kmsRan;
	}

	public void setKmsRan(int kmsRan) {
		this.kmsRan = kmsRan;
	}

	public int getPriceExpected() {
		return priceExpected;
	}

	public void setPriceExpected(int priceExpected) {
		this.priceExpected = priceExpected;
	}

	public int getNoofOwners() {
		return noofOwners;
	}

	public void setNoofOwners(int noofOwners) {
		this.noofOwners = noofOwners;
	}

	
}
