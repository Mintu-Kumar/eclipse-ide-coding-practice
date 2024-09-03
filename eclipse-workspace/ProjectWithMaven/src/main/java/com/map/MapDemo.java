package com.map;





import java.util.ArrayList;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class MapDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		 	Configuration cfg =  new Configuration();
	        cfg.configure("hibernate.cfg.xml");
	        SessionFactory factory = cfg.buildSessionFactory();
	        
	        Question q1 =  new Question();
	        q1.setQuestionId(1212);
	        q1.setQuestion("What is java");
	        
	        Answer a1 =  new Answer();
	        a1.setAnswerr("Java is progammaing language");
	        a1.setAnswerId(343);
	        a1.setQuestion(q1);
	        
	        Answer a2 =  new Answer();
	        a2.setAnswerr("With the help of java we create the software");
	        a2.setAnswerId(344);
	        a2.setQuestion(q1);
	        
	        Answer a3 =  new Answer();
	        a3.setAnswerr("Java have different type of framework");
	        a3.setAnswerId(345);
	        a3.setQuestion(q1);
	        
	        List<Answer> list = new ArrayList<Answer>();
	        list.add(a1);
	        list.add(a2);
	        list.add(a3);
	        q1.setAnswer(list);
	        
	        Session session =  factory.openSession();
	        session.beginTransaction();
	        session.save(q1);
	        session.save(a1);
	        
	        session.save(a2);
	        session.save(a3);
	        
	        
	        
	       session.getTransaction().commit();
	       
	       
	       //fetching
	       
	       Question  newQ = (Question)session.get(Question.class, 1212);
	      
	        
	        
	        
	        
	        factory.close();

	}

}
