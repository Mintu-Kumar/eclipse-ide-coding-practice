package com.spring.jdbc;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.jdbc.core.JdbcTemplate;

import com.spring.jdbc.dao.StudentDao;
import com.spring.jdbc.entities.Student;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "My Program Started" );
        
       ApplicationContext context = new  AnnotationConfigApplicationContext(JdbcConfig.class);
       StudentDao studentdao =  context.getBean("studentDao",StudentDao.class);
    
		/*
		 * Student student = new Student(); student.setId(543);
		 * student.setName("vikash"); student.setCity("rasalpur");
		 * 
		 * int result = studentdao.change(student); System.out.println(result);
		 */
        // Select single row;
		/*
		 * Student s2 = studentdao.getStudent(543); System.out.println(s2);
		 */
       
	      List<Student> student = studentdao.getAllStudents();
	      for(Student s:student)
	      System.out.println(s);
        }
}
