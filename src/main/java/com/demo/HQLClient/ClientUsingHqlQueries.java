package com.demo.HQLClient;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.query.Query;

import com.demo.entityWithAnnotation.Account;

public class ClientUsingHqlQueries {
	
	public static void main(String[] args) {
		
		Configuration conf = new Configuration();
		conf.configure("hibernate.cfg.xml");
		
		SessionFactory factory = conf.buildSessionFactory();
		Session session = factory.openSession();
		
		Transaction tr = session.beginTransaction();
		//to get records
		/*
		 * String hql ="from Account"; String hql1 = "from Account where accId =2";
		 * Query query = session.createQuery(hql1); //query.setParameter(1, 2);
		 * List<Account> list = query.getResultList();
		 * list.stream().forEach(s->System.out.println("accountId : "+s.getAccId()
		 * +"\t name :"+s.getCustName()));
		 */
		//to delete record
		/*
		 * String hql2 = "delete from Account where accId=1 "; Query query1 =
		 * session.createQuery(hql2); int count = query1.executeUpdate(); tr.commit();
		 * System.out.println("record deleted: "+count);
		 */
		
		//to update record
		String hql3 = "update Account set custName='jaydev' where accId=2";
		Query query2 = session.createQuery(hql3);
		int updatecount = query2.executeUpdate();
		tr.commit();
		System.out.println("updated count : "+updatecount);
		
	}

}
