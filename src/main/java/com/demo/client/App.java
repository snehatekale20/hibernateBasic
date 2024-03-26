package com.demo.client;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.demo.entity.Employee;

public class App 
{
	public static void main(String[] args) {
		Configuration conf = new Configuration();
		conf.configure("hibernate.cfg.xml");
		
		SessionFactory factory = conf.buildSessionFactory(); 
		Session session = factory.openSession();
		
		Employee emp = new Employee();
		emp.setEmpId(10);
		emp.setEmpName("sneha");
		emp.setEmpDept("cs");
		emp.setEmpAdd("pune");
		
		Employee emp1 = new Employee();
		emp1.setEmpId(11);
		emp1.setEmpName("ss");
		emp1.setEmpDept("cs");
		emp1.setEmpAdd("pune");
		
		
		Transaction tx = session.beginTransaction();
		session.save(emp1);
		tx.commit();
		System.out.println("saved");
		factory.close();
	
		
		
		
	
	}
}
