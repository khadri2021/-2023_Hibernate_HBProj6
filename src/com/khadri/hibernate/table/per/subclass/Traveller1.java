package com.khadri.hibernate.table.per.subclass;

public class Traveller1 {
	private Integer travellerId;
	private String travellerName;

	public String getTravellerName() {
		return travellerName;
	}

	public void setTravellerName(String travellerName) {
		this.travellerName = travellerName;
	}

	public Integer getTravellerId() {
		return travellerId;
	}

	public void setTravellerId(Integer travellerId) {
		this.travellerId = travellerId;
	}

}
