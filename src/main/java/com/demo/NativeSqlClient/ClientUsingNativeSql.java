package com.demo.NativeSqlClient;

import java.util.List;
import java.util.stream.Collectors;

import org.hibernate.SQLQuery;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.query.NativeQuery;
import org.hibernate.query.Query;

import com.demo.entityWithAnnotation.Account;

public class ClientUsingNativeSql {
	
	public static void main(String[] args) {
		
		Configuration conf = new Configuration();
		conf.configure("hibernate.cfg.xml");
		
		SessionFactory factory = conf.buildSessionFactory();
		Session session = factory.openSession();
		Transaction tr = session.beginTransaction();
		
		/*
		 * String sql1 = "Select * from Account"; NativeQuery query =
		 * session.createSQLQuery(sql1); query.addEntity(Account.class); List<Account>
		 * list = query.list();
		 * 
		 * list.stream().forEach(s->System.out.println("acc no : "+s.getAccId()
		 * +"\t accName: " +s.getCustName()));
		 */
		
		//to insert
		/*
		 * String sql2 =
		 * "INSERT INTO `demo`.`account` (`acc_id`, `cust_Add`, `acc_name`, `cust_email`) VALUES ('4', 'tushar', 'pune', 'tushar@gamil.com')"
		 * ; NativeQuery query1 = session.createSQLQuery(sql2);
		 * query1.addEntity(Account.class); int count = query1.executeUpdate();
		 * tr.commit(); System.out.println("record inserted : "+count);
		 */
		
		//to delete
		/*
		 * String sql3 = "delete from Account where acc_id=3"; NativeQuery query2 =
		 * session.createSQLQuery(sql3); query2.addEntity(Account.class); int count3 =
		 * query2.executeUpdate(); tr.commit();
		 * System.out.println("record deleted : "+count3);
		 */
		
		//to update
		String sql4 = "update Account set cust_Add = 'Frankfurt' where acc_id =4";
		NativeQuery query4 = session.createSQLQuery(sql4);
		query4.addEntity(Account.class);
		int count5 = query4.executeUpdate();
		tr.commit();
		System.out.println("record updated : "+count5);
		
				
		
	}

}
