package com.hexaware.hiibernate.dao;

import java.io.Serializable;
import java.security.Provider;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;
import javax.persistence.Query;
import org.hibernate.Transaction;

import org.hibernate.Session;
import org.hibernate.SessionFactory;

import com.hexaware.usermanage.HibernateUtil;
import com.hexaware.usermanage.entity.Users;

public class UserDao implements IUserDao {
	private EntityManager entitymanager ;
	
	
	public UserDao() {
        this.entitymanager = HibernateUtil.getSessionFactory().createEntityManager();
	}
	public UserDao(EntityManager entitymanager) {
		super();
		this.entitymanager = entitymanager;
	}
	SessionFactory sessionFactory = HibernateUtil.getSessionFactory();
	
	Session session = sessionFactory.openSession();
	Transaction transaction = session.beginTransaction();
	
	public List<Users> getAllUsers(){
		Query query = session.createNamedQuery("getAllUsers");
		
		List<Users> list = query.getResultList();
		return list;
	}
	public Users getUserById(int userId) {
		try(Session session = sessionFactory.openSession()){
		Query query = session.createNamedQuery("getUserById");
		query.setParameter("userId", userId);
		return (Users) query.getSingleResult();
		}catch(Exception e) {
					e.printStackTrace();
					return null;
				}
	}
	
	@Override
	public void addUser(Users user) {
        EntityTransaction transaction = null;
        try {
            transaction = entitymanager.getTransaction();
            transaction.begin();

            entitymanager.persist(user);

            transaction.commit();
        } catch (Exception ex) {
            if (transaction != null && transaction.isActive()) {
                transaction.rollback();
            }
            ex.printStackTrace();
        } finally {
            if (entitymanager != null) {
                entitymanager.close();
            }
        }
    }

	@Override
    public void deleteById(int userId) {
        EntityTransaction transaction = entitymanager.getTransaction();
        transaction.begin();

        try {
            Users user = entitymanager.find(Users.class, userId);
            if (user != null) {
                entitymanager.remove(user);
                transaction.commit();
                System.out.println("User deleted successfully.");
            } else {
                System.out.println("User with ID " + userId + " not found.");
            }
        } catch (Exception ex) {
            if (transaction != null && transaction.isActive()) {
                transaction.rollback();
            }
            ex.printStackTrace();
        } finally {
            if (entitymanager != null) {
                entitymanager.close();
            }
        }
    }


}
