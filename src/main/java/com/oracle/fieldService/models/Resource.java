package com.oracle.fieldService.models;

import java.time.LocalDate;
import java.util.Set;

import javax.persistence.Access;
import javax.persistence.AccessType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.Table;

@Access(value = AccessType.FIELD)
@Entity
@Table(name = "RESOURCE")
public class Resource {

	@Id
	@Column(name = "RESOURCE_ID")
	Long resourceId;
	@Column(name = "RESOURCE_NAME")
	String resourceName;
	@Column(name = "USERNAME")
	String username;
	@Column(name = "PASSWORD")
	String password;
	
	@ManyToOne
	@PrimaryKeyJoinColumn(name = "RESOURCE_ID")
	Resource supervisor;
	
	@Column(name = "START_DATE")
	LocalDate startDate;
	@Column(name = "END_DATE")
	LocalDate endDate;
	
	@ManyToMany
	Set<Inventory> ownedResource;

	public Long getResourceId() {
		return resourceId;
	}

	public void setResourceId(Long resourceId) {
		this.resourceId = resourceId;
	}

	public String getResourceName() {
		return resourceName;
	}

	public void setResourceName(String resourceName) {
		this.resourceName = resourceName;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public Resource getSupervisor() {
		return supervisor;
	}

	public void setSupervisor(Resource supervisor) {
		this.supervisor = supervisor;
	}

	public LocalDate getStartDate() {
		return startDate;
	}

	public void setStartDate(LocalDate startDate) {
		this.startDate = startDate;
	}

	public LocalDate getEndDate() {
		return endDate;
	}

	public void setEndDate(LocalDate endDate) {
		this.endDate = endDate;
	}

	public Set<Inventory> getOwnedResource() {
		return ownedResource;
	}

	public void setOwnedResource(Set<Inventory> ownedResource) {
		this.ownedResource = ownedResource;
	}
	
	
}
