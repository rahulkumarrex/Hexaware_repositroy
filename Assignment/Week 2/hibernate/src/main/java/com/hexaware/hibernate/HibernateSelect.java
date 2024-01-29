package com.hexaware.hibernate;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;

import com.hexaware.hibernate.entity.User;

public class HibernateSelect {

	public static void main(String[] args) {

		SessionFactory sessionFactory = HibernateUtil.getSessionFactory();

		Session session = sessionFactory.openSession();

		// HQL or JPQL

		// Query with positional parameter
		
		String selectQuery = "select e from Employee e  where  e.salary > ?1 ";

		Query<User> query = session.createQuery(selectQuery);

					query.setParameter(1, 30000.0);
		
		
		List<User> list = query.getResultList();

		for (User employee : list) {

			System.out.println(employee);
		}
		
		
		
	//	String selectQuery2 = "select e from Employee e  where e.ename  LIKE  '%i%'";
		
		
		// Query with named parameter
		String selectQuery2 = "select e from Employee e  where e.eid = :empid";
		
			Query<User>  query2 =		session.createQuery(selectQuery2);
			
						query2.setParameter("userid", 1);
		
				System.out.println(query2.getResultList());
				
				
				
				

	}

}
