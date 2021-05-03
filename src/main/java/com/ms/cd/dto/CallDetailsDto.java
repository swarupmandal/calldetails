package com.ms.cd.dto;

import java.sql.Date;

import com.ms.cd.entity.CallDetails;

public class CallDetailsDto {

	long calledBy;

	long calledTo;

	Date calledOn;

	int duration;
	
	public CallDetailsDto() {
		super();
	}
	
	

	public CallDetailsDto(long calledBy, long calledTo, Date calledOn, int duration) {
		super();
		this.calledBy = calledBy;
		this.calledTo = calledTo;
		this.calledOn = calledOn;
		this.duration = duration;
	}



	public long getCalledBy() {
		return calledBy;
	}

	public void setCalledBy(long calledBy) {
		this.calledBy = calledBy;
	}

	public long getCalledTo() {
		return calledTo;
	}

	public void setCalledTo(long calledTo) {
		this.calledTo = calledTo;
	}

	public Date getCalledOn() {
		return calledOn;
	}

	public void setCalledOn(Date calledOn) {
		this.calledOn = calledOn;
	}

	public int getDuration() {
		return duration;
	}

	public void setDuration(int duration) {
		this.duration = duration;
	}
	
	public static CallDetailsDto valueOf(CallDetails details) {
		
		CallDetailsDto dto = new CallDetailsDto();
		dto.setCalledBy(details.getCalledBy());
		dto.setCalledOn(details.getCalledOn());
		dto.setCalledTo(details.getCalledTo());
		dto.setDuration(details.getDuration());
		
		return dto;		
	}
	
	@Override
	public String toString() {
		return "CallDetailsDto [calledBy=" + calledBy + ", calledTo=" + calledTo + ", calledOn=" + calledOn
				+ ", duration=" + duration + "]";
	}

}
