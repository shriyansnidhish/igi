package com.cognizant.dao;



import java.io.File;

import javax.sql.DataSource;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.AnnotationConfiguration;
import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.cognizant.model.User;
import com.cognizant.model.UserM;

@Repository("UserDAOImpl")

public class UserDAOImpl implements UserDAO {
 
  
  
  @Autowired
  private SessionFactory sessionFactory;
  

  @Transactional
  public int register(User user) {
	  
	 // AnnotationConfiguration configuration = new AnnotationConfiguration();
		
	//	configuration.configure(new File("hibernate.cgf.xml"));
		
	//	sessionFactory=configuration.buildSessionFactory();
		
		Session session=sessionFactory.openSession();
		
		Transaction tx=session.beginTransaction();
		
		
		session.persist(user);
		
		tx.commit();
		session.close();
		return 1;
    
    }
  
  @Transactional
  public int registerM(UserM user) {
	  AnnotationConfiguration configuration = new AnnotationConfiguration();
		
		configuration.configure();
		
		SessionFactory sessionFactory=configuration.buildSessionFactory();
		
		Session session=sessionFactory.openSession();
		
		Transaction tx=session.beginTransaction();
		
		
		
		
		session.save(user);
		
		
		tx.commit();
		session.close();
		return 1;
		
		
}

  }
 
