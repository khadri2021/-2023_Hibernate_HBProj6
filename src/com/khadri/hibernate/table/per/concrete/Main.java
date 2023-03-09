package com.khadri.hibernate.table.per.concrete;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class Main {

	public static void main(String[] args) {
		Configuration cfg = new Configuration();
		cfg.configure();

		SessionFactory factory = cfg.buildSessionFactory();
		Session session = factory.openSession();

		Transaction txn = session.beginTransaction();

		AirTraveller2 airTraveller2 = new AirTraveller2();
		airTraveller2.setTravellerId(1);
		airTraveller2.setTravellerName("JHON");
		airTraveller2.setPlaneName("INDIGO");

		session.save(airTraveller2);
		txn.commit();
	}
}
