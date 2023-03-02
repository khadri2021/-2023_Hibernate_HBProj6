package com.khadri.hibernate.inheritence;

public class AirTraveller extends Traveller {
	private String planeName;

	public String getPlaneName() {
		return planeName;
	}

	public void setPlaneName(String planeName) {
		this.planeName = planeName;
	}

}
