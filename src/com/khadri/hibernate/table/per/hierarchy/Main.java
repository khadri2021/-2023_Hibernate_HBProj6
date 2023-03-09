package com.khadri.hibernate.table.per.hierarchy;

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
		
		CarTraveller carfTraveller = new CarTraveller();
		carfTraveller.setTravellerId(100000);
		carfTraveller.setTravellerName("JHON");
		carfTraveller.setCarName("Scorpio");

		session.save(carfTraveller);
		
		
		
		AirTraveller airTraveller = new AirTraveller();
		airTraveller.setTravellerId(100000);
		airTraveller.setTravellerName("Costine");
		airTraveller.setPlaneName("KingFisher");

		session.save(airTraveller);

		BykeTraveller bykeTraveller = new BykeTraveller();
		bykeTraveller.setTravellerId(100000);
		bykeTraveller.setTravellerName("Allen");
		bykeTraveller.setBykeName("Unicorn");

		session.save(bykeTraveller);

		txn.commit();
	}
}
