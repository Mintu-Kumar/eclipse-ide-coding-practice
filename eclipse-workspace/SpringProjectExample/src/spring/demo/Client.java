package spring.demo;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Client {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    Employee e  = new Employee();
    e.setEid(101);
    e.setEname("Mintu");
    e.setEsalary(100000);
   
    System.out.println(e);

	
	// Inversion of Control
	// 1. Add jar files for spring core
	// 2. Configure java object  in an XML file
	// 3. Use IoC container, eg BeanFactory or ApplicationContext to get the object constructed by them.
    
	ApplicationContext context = new ClassPathXmlApplicationContext("employeebean.xml");
	
	Employee e1 = (Employee)context.getBean("emp1");
	Employee e2 = context.getBean("emp2",Employee.class);
	
	System.out.println("---------------------------------");
	System.out.println(e1);
	System.out.println(e2);
	}
}
