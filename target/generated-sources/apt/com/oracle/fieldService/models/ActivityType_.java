package com.oracle.fieldService.models;

import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value = "org.hibernate.jpamodelgen.JPAMetaModelEntityProcessor")
@StaticMetamodel(ActivityType.class)
public abstract class ActivityType_ {

	public static volatile SingularAttribute<ActivityType, Integer> duration;
	public static volatile SingularAttribute<ActivityType, String> color;
	public static volatile SingularAttribute<ActivityType, String> activityTypeName;
	public static volatile SingularAttribute<ActivityType, Boolean> isEnabled;
	public static volatile SingularAttribute<ActivityType, Long> activityTypeCode;
	public static volatile SingularAttribute<ActivityType, TimeSlot> availableTimeSlot;

	public static final String DURATION = "duration";
	public static final String COLOR = "color";
	public static final String ACTIVITY_TYPE_NAME = "activityTypeName";
	public static final String IS_ENABLED = "isEnabled";
	public static final String ACTIVITY_TYPE_CODE = "activityTypeCode";
	public static final String AVAILABLE_TIME_SLOT = "availableTimeSlot";

}

