package com.khadri.hibernate.component;

import java.util.UUID;

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
		Student s1 = new Student();
		Address a1 = new Address();

		String uuid = UUID.randomUUID().toString();

		a1.setDoorNo(10);
		a1.setStreet("NGO");

		s1.setSno(uuid);
		s1.setSname("JHON");
		s1.setSadd(a1);

		session.save(s1);

		txn.commit();
		session.close();

	}
}
