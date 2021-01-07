package com.oracle.fieldService.models;

import java.time.LocalDate;
import javax.annotation.Generated;
import javax.persistence.metamodel.SetAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value = "org.hibernate.jpamodelgen.JPAMetaModelEntityProcessor")
@StaticMetamodel(Resource.class)
public abstract class Resource_ {

	public static volatile SetAttribute<Resource, Inventory> ownedResource;
	public static volatile SingularAttribute<Resource, Long> resourceId;
	public static volatile SingularAttribute<Resource, String> password;
	public static volatile SingularAttribute<Resource, LocalDate> endDate;
	public static volatile SingularAttribute<Resource, String> resourceName;
	public static volatile SingularAttribute<Resource, Resource> supervisor;
	public static volatile SingularAttribute<Resource, LocalDate> startDate;
	public static volatile SingularAttribute<Resource, String> username;

	public static final String OWNED_RESOURCE = "ownedResource";
	public static final String RESOURCE_ID = "resourceId";
	public static final String PASSWORD = "password";
	public static final String END_DATE = "endDate";
	public static final String RESOURCE_NAME = "resourceName";
	public static final String SUPERVISOR = "supervisor";
	public static final String START_DATE = "startDate";
	public static final String USERNAME = "username";

}

