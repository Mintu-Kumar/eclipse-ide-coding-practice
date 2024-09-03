package constructor_injection;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

public class Constructor_injection_wdo {

	public static void main(String[] args) {
		
		
		ApplicationContext context =  new ClassPathXmlApplicationContext("constructor_injection.xml");
		
		  employee e = (employee) context.getBean("ciwdo");
		  e.show();
		
//		Resource r=new ClassPathResource("constructor_injection.xml");  
//        @SuppressWarnings("deprecation")
//		BeanFactory factory=new XmlBeanFactory(r);  
//          
//        employee s=(employee)factory.getBean("e");  
//        s.show();  
		// TODO Auto-generated method stub

	}

}
