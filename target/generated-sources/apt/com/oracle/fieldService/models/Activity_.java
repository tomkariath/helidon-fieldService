package com.oracle.fieldService.models;

import java.time.LocalDate;
import java.time.LocalDateTime;
import javax.annotation.Generated;
import javax.persistence.metamodel.SetAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value = "org.hibernate.jpamodelgen.JPAMetaModelEntityProcessor")
@StaticMetamodel(Activity.class)
public abstract class Activity_ {

	public static volatile SingularAttribute<Activity, String> address;
	public static volatile SingularAttribute<Activity, Resource> resource;
	public static volatile SingularAttribute<Activity, String> city;
	public static volatile SingularAttribute<Activity, TimeSlot> activityTimeSlot;
	public static volatile SingularAttribute<Activity, String> PostalCode;
	public static volatile SingularAttribute<Activity, String> dispatcherComments;
	public static volatile SingularAttribute<Activity, String> customerName;
	public static volatile SingularAttribute<Activity, Long> activityId;
	public static volatile SingularAttribute<Activity, LocalDate> activityDate;
	public static volatile SingularAttribute<Activity, String> phoneNumber;
	public static volatile SetAttribute<Activity, Inventory> requiredInventory;
	public static volatile SingularAttribute<Activity, LocalDateTime> startTime;
	public static volatile SingularAttribute<Activity, String> state;
	public static volatile SingularAttribute<Activity, ActivityType> activityType;
	public static volatile SingularAttribute<Activity, Double> CODAmount;
	public static volatile SingularAttribute<Activity, String> email;
	public static volatile SingularAttribute<Activity, String> status;

	public static final String ADDRESS = "address";
	public static final String RESOURCE = "resource";
	public static final String CITY = "city";
	public static final String ACTIVITY_TIME_SLOT = "activityTimeSlot";
	public static final String POSTAL_CODE = "PostalCode";
	public static final String DISPATCHER_COMMENTS = "dispatcherComments";
	public static final String CUSTOMER_NAME = "customerName";
	public static final String ACTIVITY_ID = "activityId";
	public static final String ACTIVITY_DATE = "activityDate";
	public static final String PHONE_NUMBER = "phoneNumber";
	public static final String REQUIRED_INVENTORY = "requiredInventory";
	public static final String START_TIME = "startTime";
	public static final String STATE = "state";
	public static final String ACTIVITY_TYPE = "activityType";
	public static final String C_OD_AMOUNT = "CODAmount";
	public static final String EMAIL = "email";
	public static final String STATUS = "status";

}

