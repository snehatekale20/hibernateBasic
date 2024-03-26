package com.demo.HCQLClient;

import java.util.List;

import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.criterion.Criterion;
import org.hibernate.criterion.Restrictions;

import com.demo.entityWithAnnotation.Account;

public class CriteriaClient {

	public static void main(String[] args) {
		
		Configuration cfg = new Configuration();
		cfg.configure("hibernate.cfg.xml");
		
		SessionFactory factory = cfg.buildSessionFactory();
		Session session = factory.openSession();
		
		CriteriaBuilder builder = session.getCriteriaBuilder();
		
		CriteriaQuery<Account> criteria = builder.createQuery(Account.class);
		//return only first 2 records
		//criteria.setMaxResults(2);
		
		//return record if customer address is pune
		//criteria .add(Restrictions.eq("custAdd", "pune"));
		
		//return record if customer name is sneha
		//criteria.add(Restrictions.ilike("custName", "sneha"));
		
		
		//give records whose id is between 4 to 10
		//criteria.add(Restrictions.between("accId", 4, 10));
		
		//gives record whose id in equal to 4
		//criteria.add(Restrictions.idEq(4));
		
		
		//List<Account> list = criteria.
		
		Criteria cr = session.createCriteria(Account.class);
		Criterion eq = Restrictions.eq("custName", "sneha");
		Criterion gt = Restrictions.gt("accId", 3);
		
		Criterion  or =   Restrictions.or(eq,gt);
		Criterion and = Restrictions.and(eq,gt);
		
		//it will fetch the record whose name starts with p
		Criterion like = Restrictions.ilike("custName", "p%");
		cr.add(like);

		List<Account> list = cr.list();
		//System.out.println(list);
		
		
		list.stream().forEach(s->System.out.println("accId : "+s.getAccId()+"\tAccLocation : " +s.getCustAdd()+"\tAccName : "+s.getCustName()));
		
	}

}
