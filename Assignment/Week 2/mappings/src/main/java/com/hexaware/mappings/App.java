package com.hexaware.mappings;



import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import com.hexaware.mappings.entity.Address;
import com.hexaware.mappings.entity.Student;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	SessionFactory sessionFactory = HibernateUtil.getSessionFactory();
    	
    	Session session = sessionFactory.openSession();
    	
    	System.out.println(session);
    	
    	Student student = new Student(104,"ramesh");
    	Address address = new Address(student,25,"Mumbai");

    	
    	Transaction txn = session.beginTransaction();
    	session.persist(address);
    	txn.commit();
    	
    }
}
