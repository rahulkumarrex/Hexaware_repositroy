package com.hexaware.hibernate;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;

import com.hexaware.hibernate.entity.User;

public class UserDao{
	
	
	SessionFactory sessionFactory = HibernateUtil.getSessionFactory();

	Session session = sessionFactory.openSession();

	public List<User> geAllUser() {

		Query query = session.createNamedQuery("geAllUser");

		List<User> list = query.getResultList();

		return list;
				
		}
	
	
	
		public  User  getEmployeeByName() {
			
			
			
			Query query = session.createNamedQuery("getUserByName");
			
					query.setParameter("name", "Ahbinav Sharma");
			
					User emp = (User) query.getSingleResult();
			
			return emp;
		}
	
	
	
	

}
