package com.hibernate;

import javax.persistence.Embeddable;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;


public class EmbedDemo {

	public static void main(String[] args) {
		 	Configuration cfg =  new Configuration();
	        cfg.configure("hibernate.cfg.xml");
	        SessionFactory factory = cfg.buildSessionFactory();
	        
	        Student st1 =  new Student();
	        st1.setId(456);
	        st1.setName("Aarav");
	        st1.setCity("Delhi");
	        
	        Certificate certi =  new Certificate();
	        certi.setCourse("Java");
	        certi.setDuration("6 months");
	        
	        
	        st1.setCerti(certi);
	        
	        Session session =  factory.openSession();
	        session.beginTransaction();
	        session.save(st1);
	        session.getTransaction().commit(); 
	        
	        
	        
	        factory.close();

	}

}
