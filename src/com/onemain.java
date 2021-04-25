package com;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.AnnotationConfiguration;
import org.hibernate.cfg.Configuration;

public class onemain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Configuration config=new AnnotationConfiguration();
		config.configure("hibernate.cfg.xml");
		SessionFactory factory=config.buildSessionFactory();
		Session ses=factory.openSession();
		Principle p=new Principle();
		p.setPname("R.Jain");
		p.setPaddr("Mumbai");
		p.setPsal(150000);
		College c=new College();
		c.setCname("ABCD");
		c.setCaddr("Mumbai");
		c.setPri(p);
		ses.save(c);
		Transaction tx=ses.beginTransaction();
		tx.commit();

	}

}
