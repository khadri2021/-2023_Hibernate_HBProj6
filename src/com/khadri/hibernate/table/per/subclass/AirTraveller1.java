package com.khadri.hibernate.table.per.subclass;

public class AirTraveller1 extends Traveller1 {
	private String planeName;

	public String getPlaneName() {
		return planeName;
	}

	public void setPlaneName(String planeName) {
		this.planeName = planeName;
	}

}
