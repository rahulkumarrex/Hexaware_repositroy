package com.hexaware.mappings;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import com.hexaware.mappings.entity.Department;
import com.hexaware.mappings.entity.Employee;

public class OneToMany_ManyToOne_Mapping {
	public static void main(String[] args) {
		SessionFactory sessionFactory = HibernateUtil.getSessionFactory();
		
		Session session = sessionFactory.openSession();
		
		Transaction txn = session.beginTransaction();
		
		Employee e1 = new Employee(101,"King",20000);
		Employee e2 = new Employee(102,"Adam",40000);
		Employee e3 = new Employee(103,"Priya",40000);
		Employee e4 = new Employee(104,"Rahul",33000);
		
		Department dept1 = new Department();
		
		dept1.setDeptId(10);
		dept1.setDeptName("Testing");
		
		dept1.addEmploye(e1);
		dept1.addEmploye(e2);
		dept1.addEmploye(e3);
		dept1.addEmploye(e4);
		
		
		
		session.persist(dept1);
		txn.commit();
		
		
	}
	
	 

}
