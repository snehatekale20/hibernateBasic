package com.demo.client;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.demo.entity.Employee;

public class DeleteAndUpdateEmp {
	public static void main(String[] args) {
		
		Configuration conf = new Configuration();
		conf.configure("hibernate.cfg.xml");
		SessionFactory factory = conf.buildSessionFactory();
		Session session = factory.openSession();
		
		Transaction tr = session.beginTransaction();
		
		Employee emp = session.get(Employee.class, 11);
		
		//emp.setEmpDept("mech");
		
		System.out.println(emp);
		//session.update(emp);
		//System.out.println("updated");
		
		session.delete(emp);
		System.out.println("deleted");
		tr.commit();
		factory.close();
		
	}

}
