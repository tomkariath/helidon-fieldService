package com.oracle.fieldService.models;

import javax.persistence.Access;
import javax.persistence.AccessType;
import javax.persistence.AttributeOverride;
import javax.persistence.Column;
import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;

@Access(value = AccessType.FIELD)
@Entity
@Table(name = "ACTIVITY_TYPE")
@NamedQueries({
	@NamedQuery (name = "ActivityType.findAll", query = "select at from ActivityType at"),
	@NamedQuery (name = "ActivityType.findByActivityTypeCode", query = "select at from ActivityType at where at.activityTypeCode = :activityTypeCode")
})
public class ActivityType {

	@Id
	@Column(name = "ACTIVITY_TYPE_CODE")
	Long activityTypeCode;
	@Column(name = "ACTIVITY_TYPE_NAME")
	String activityTypeName;
	@Column(name = "DURATION")
	Integer duration;
	@Column(name = "COLOR")
	String color;
	@Column(name = "IS_ENABLED")
	Boolean isEnabled;

	@Embedded
	@AttributeOverride(name = "timeSlotDuration", column = @Column(name = "AVAILABLE_TIME_SLOT"))
	TimeSlot availableTimeSlot;



	public Long getActivityTypeCode() {
		return activityTypeCode;
	}
	public void setActivityTypeCode(Long activityTypeCode) {
		this.activityTypeCode = activityTypeCode;
	}
	public String getActivityTypeName() {
		return activityTypeName;
	}
	public void setActivityTypeName(String activityTypeName) {
		this.activityTypeName = activityTypeName;
	}
	public Integer getDuration() {
		return duration;
	}
	public void setDuration(Integer duration) {
		this.duration = duration;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public Boolean getIsEnabled() {
		return isEnabled;
	}
	public void setIsEnabled(Boolean isEnabled) {
		this.isEnabled = isEnabled;
	}
	public TimeSlot getAvailableTimeSlot() {
		return availableTimeSlot;
	}
	public void setAvailableTimeSlot(TimeSlot availableTimeSlot) {
		this.availableTimeSlot = availableTimeSlot;
	}	
}
