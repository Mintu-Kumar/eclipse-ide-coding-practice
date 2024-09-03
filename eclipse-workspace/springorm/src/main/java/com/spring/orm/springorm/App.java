package com.spring.orm.springorm;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.spring.orm.springorm.dao.StudentDao;
import com.spring.orm.springorm.entities.Student;

import antlr.collections.List;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
      ApplicationContext context  = new ClassPathXmlApplicationContext("config.xml"); 
      StudentDao  studentDao = context.getBean("studentDao",StudentDao.class);
      
      //INSERTING
      //Student  student = new Student(2345,"Amit","Delhi");
      //int r = studentDao.insert(student);
      
      //GETTING ONE ROW
      //Student student = studentDao.getStudent(2345);
      
      //GETTING MULTIPLE ROW
      List<Student> student =studentDao.getStudents();
      for(Student s:student)
      System.out.println("result="+student.getStudentName());
    }
    
}
