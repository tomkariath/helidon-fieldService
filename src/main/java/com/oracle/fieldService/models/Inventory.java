package com.oracle.fieldService.models;

import javax.persistence.Access;
import javax.persistence.AccessType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Access(value = AccessType.FIELD)
@Entity
@Table(name = "INVENTORY")
public class Inventory {

	@Id
	@Column(name = "INVENTORY_ID")
	Long inventoryId;
	@Column(name = "INVENTORY_TYPE")
	String inventoryType;
	@Column(name = "MODEL")
	String model;
	@Column(name = "QUANTITY")
	Long quantity;
	@Column(name = "SERIAL_NUMBER")
	String serialNumber;
	
	public Long getInventoryId() {
		return inventoryId;
	}
	public void setInventoryId(Long inventoryId) {
		this.inventoryId = inventoryId;
	}
	public String getInventoryType() {
		return inventoryType;
	}
	public void setInventoryType(String inventoryType) {
		this.inventoryType = inventoryType;
	}
	public String getModel() {
		return model;
	}
	public void setModel(String model) {
		this.model = model;
	}
	public Long getQuantity() {
		return quantity;
	}
	public void setQuantity(Long quantity) {
		this.quantity = quantity;
	}
	public String getSerialNumber() {
		return serialNumber;
	}
	public void setSerialNumber(String serialNumber) {
		this.serialNumber = serialNumber;
	}
	
}
