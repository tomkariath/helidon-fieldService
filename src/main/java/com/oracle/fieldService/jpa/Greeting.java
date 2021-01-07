package com.oracle.fieldService.jpa;

import java.io.Serializable;
import java.util.Objects;

import javax.persistence.Access;
import javax.persistence.AccessType;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Access(value = AccessType.FIELD)
@Entity(name = "Greeting")
@Table(name = "GREETING")
public class Greeting implements Serializable{

	@Column(
			insertable = true,
			name = "SALUTATION",
			nullable = false,
			updatable = false
	)
	@Id
	private String salutation;
	
	@Column(
			insertable = true,
			name = "RESPONSE",
			nullable = false,
			updatable = true
	)
	@Basic(optional = false)
	private String response;
	
	

	public Greeting() {
		super();
	}

	public Greeting(String salutation, String response) {
		super();
		this.salutation = Objects.requireNonNull(salutation);
		this.response = response;
	}

	public String getSalutation() {
		return salutation;
	}

	public void setSalutation(String salutation) {
		this.salutation = salutation;
	}

	public String getResponse() {
		return response;
	}

	public void setResponse(String response) {
		this.response = response;
	}	
}
