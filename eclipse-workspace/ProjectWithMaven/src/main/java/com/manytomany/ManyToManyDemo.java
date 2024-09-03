package com.manytomany;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class ManyToManyDemo {
	
	public static void main(String[] args) {
		
		Configuration cfg =  new Configuration();
	    cfg.configure("hibernate.cfg.xml");
	    SessionFactory factory = cfg.buildSessionFactory();
		
	    Employee emp =  new Employee();
	    Employee emp1 =  new Employee();
	    
	    emp.seteName("Ram");
	    emp.seteId(34);
	    
	    emp1.seteName("Shyam");
	    emp1.seteId(35);
	    
	    Project pr =  new Project();
	    Project pr1 =  new Project();
	    
	    pr.setpId(12);
	    pr.setpName("Libraray management system");
	    
	    pr1.setpId(14);
	    pr1.setpName("Chatbot");
	    
	    List<Employee> empList=  new ArrayList<Employee>();
	    List<Project> ProList=  new ArrayList<Project>();
	    
	    empList.add(emp1);
	    empList.add(emp);
	    
	    ProList.add(pr1);
	    ProList.add(pr);
	    
	    emp.setProject(ProList);
	    
	    pr1.setEmployee(empList);
	    
	    Session session =  factory.openSession();
	    session.beginTransaction();
	    session.save(emp);
	    session.save(emp1);
	    session.save(pr);
	    session.save(pr1);
	    
	    session.getTransaction().commit();
	    
	    
	    factory.close();
	    
	    
	    
	    
	}

}
