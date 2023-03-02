package com.khadri.hibernate.component;

public class Student {

	private String sno;
	private String sname;
	private Address sadd;

	public String getSno() {
		return sno;
	}

	public void setSno(String sno) {
		this.sno = sno;
	}

	public String getSname() {
		return sname;
	}

	public void setSname(String sname) {
		this.sname = sname;
	}

	public Address getSadd() {
		return sadd;
	}

	public void setSadd(Address sadd) {
		this.sadd = sadd;
	}

}
