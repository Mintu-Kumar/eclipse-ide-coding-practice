package com.springcore.standalone.collenstions;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;



public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AbstractApplicationContext context = new ClassPathXmlApplicationContext("com/springcore/standalone/collenstions/aloneconfig.xml");
		Person emp = context.getBean("person1", Person.class);
		System.out.println(emp);
		System.out.println(emp.getFeestructure());	
		}

}
