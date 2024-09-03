package com.springcore.stereotype;

import org.springframework.context.ApplicationContext;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.springcore.standalone.collenstions.Person;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext context = new ClassPathXmlApplicationContext("com/springcore/stereotype/steroconfig.xml");
		Student  student = context.getBean("student", Student.class);
		System.out.println(student);
		System.out.println(student.getAddress());
		 
		}
	}

 
