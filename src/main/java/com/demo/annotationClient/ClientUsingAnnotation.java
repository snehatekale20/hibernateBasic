package com.demo.annotationClient;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.demo.entityWithAnnotation.Account;

public class ClientUsingAnnotation {
	
	public static void main(String[] args) {
		
		Configuration conf = new Configuration();
		conf.configure("hibernate.cfg.xml");
		
		SessionFactory factory = conf.buildSessionFactory();
		
		Session session = factory.openSession();
		
		Transaction tr = session.beginTransaction();
		
		Account ac1 = new Account();
		//ac1.setAccId(10);
		ac1.setCustName("sneha");
		ac1.setCustAdd("frankfurt");
		ac1.setEmail("sneha@gmial.com");
		
		Account ac2 = new Account();
		//ac2.setAccId(20);
		ac2.setCustName("tushar");
		ac2.setCustAdd("pune");
		ac2.setEmail("tush@gmail.com");
		
		//session.save(ac1);
		//session.save(ac2);
		
		//to get data
		Account ac3 = session.load(Account.class, 2);
		System.out.println(ac3);
		
		//to update
		//ac3.setEmail("Tush205@gmail.com");
		//session.update(ac3);
		//System.out.println("updated");
		
		//to delete
		//session.delete(ac3);
		//System.out.println("deleted");
		
		tr.commit();
		factory.close();
		
	}

}
