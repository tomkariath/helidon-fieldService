package com.oracle.fieldService.models;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Set;

import javax.persistence.Access;
import javax.persistence.AccessType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Access(value = AccessType.FIELD)
@Entity
@Table(name = "ACTIVITY")
public class Activity {

	@Id
	@Column(name = "ACTIVITY_ID")
	Long activityId;
	
	@ManyToOne
	@JoinColumn(name = "ACTIVITY_TYPE_CODE")
	ActivityType activityType;
	
	@ManyToOne
	@JoinColumn(name = "RESOURCE_ID")
	Resource resource;
	
	@Column(name = "ACTIVITY_DATE")
	LocalDate activityDate;
	@Column(name = "ACTIVITY_TIME_SLOT")
	TimeSlot activityTimeSlot;
	@Column(name = "CUSTOMER_NAME")
	String customerName;
	@Column(name = "ADDRESS")
	String address;
	@Column(name = "CITY")
	String city;
	@Column(name = "STATE")
	String state;
	@Column(name = "POSTAL_CODE")
	String PostalCode;
	@Column(name = "PHONE_NAME")
	String phoneNumber;
	@Column(name = "EMAIL")
	String email;
	@Column(name = "DISPATCHER_COMMENTS")
	String dispatcherComments;
	@Column(name = "COD_AMOUNT")
	Double CODAmount;
	@Column(name = "START_TIME")
	LocalDateTime startTime;
	@Column(name = "STATUS")
	String status;
	
	@OneToMany
	@JoinTable(name = "REQUIRED_INVENTORY", 
		joinColumns= @JoinColumn(name = "ACTIVITY_ID"),
		inverseJoinColumns = @JoinColumn(name = "INVENTORY_ID"))
	Set<Inventory> requiredInventory;
	
	public Long getActivityId() {
		return activityId;
	}
	public void setActivityId(Long activityId) {
		this.activityId = activityId;
	}
	public ActivityType getActivityType() {
		return activityType;
	}
	public void setActivityType(ActivityType activityType) {
		this.activityType = activityType;
	}
	public Resource getResource() {
		return resource;
	}
	public void setResource(Resource resource) {
		this.resource = resource;
	}
	public LocalDate getActivityDate() {
		return activityDate;
	}
	public void setActivityDate(LocalDate activityDate) {
		this.activityDate = activityDate;
	}
	public TimeSlot getActivityTimeSlot() {
		return activityTimeSlot;
	}
	public void setActivityTimeSlot(TimeSlot activityTimeSlot) {
		this.activityTimeSlot = activityTimeSlot;
	}
	public String getCustomerName() {
		return customerName;
	}
	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	public String getPostalCode() {
		return PostalCode;
	}
	public void setPostalCode(String postalCode) {
		PostalCode = postalCode;
	}
	public String getPhoneNumber() {
		return phoneNumber;
	}
	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getDispatcherComments() {
		return dispatcherComments;
	}
	public void setDispatcherComments(String dispatcherComments) {
		this.dispatcherComments = dispatcherComments;
	}
	public Double getCODAmount() {
		return CODAmount;
	}
	public void setCODAmount(Double cODAmount) {
		CODAmount = cODAmount;
	}
	public LocalDateTime getStartTime() {
		return startTime;
	}
	public void setStartTime(LocalDateTime startTime) {
		this.startTime = startTime;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public Set<Inventory> getRequiredInventory() {
		return requiredInventory;
	}
	public void setRequiredInventory(Set<Inventory> requiredInventory) {
		this.requiredInventory = requiredInventory;
	}
	
}
