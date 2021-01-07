package com.oracle.fieldService.models;

import javax.persistence.Embeddable;

@Embeddable
public class TimeSlot {

	String timeSlotDuration;

	public String getTimeSlotDuration() {
		return timeSlotDuration;
	}

	public void setTimeSlotDuration(String timeSlotDuration) {
		this.timeSlotDuration = timeSlotDuration;
	}
}
