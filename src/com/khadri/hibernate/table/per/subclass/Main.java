package com.khadri.hibernate.table.per.subclass;

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

	    AirTraveller1 vikram = new AirTraveller1();
	    vikram.setPlaneName("INDGO");
	    vikram.setTravellerName("BABJAN");

		session.save(vikram);
		txn.commit();
	}
}
