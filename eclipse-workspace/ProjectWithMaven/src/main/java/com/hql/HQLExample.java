package com.hql;

import org.hibernate.Session;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.hibernate.Student;


public class HQLExample {
	
	 public static void main(String[] args) {
		    Configuration cfg =  new Configuration();
		    cfg.configure("hibernate.cfg.xml");
		    SessionFactory factory = cfg.buildSessionFactory();
		    
		    Session s  =  factory.openSession();
		    //HQL Syntax
		    String query = "from Student";
		    
		    Query q = s.createQuery(query);
		    
		    List<Student> list = q.list();
		    
		    for(Student st: list)
		    {
		    	System.out.println(st.getName());
		    	
		    }
		    
		    
		    factory.close();
			
	}

}
