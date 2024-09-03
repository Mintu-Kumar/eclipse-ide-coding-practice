package com.hibernate;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Date;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;


/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args ) throws IOException
    {
        System.out.println( "Hello World!" );
        
        Configuration cfg =  new Configuration();
        cfg.configure("hibernate.cfg.xml");
        SessionFactory factory = cfg.buildSessionFactory();
        
        Student st =  new Student();
        st.setId(123);
        st.setName("Mintu");
        st.setCity("Spj");
        
        System.out.println(st);
        
        //Creating object of address class
        Address address =  new Address();
        address.setStreet("street1");
        address.setCity("delhi");
        address.setOpen(true);
        address.setAddedDate(new Date());
        address.setX(12345.546);
        
        FileInputStream file =  new FileInputStream("src/main/java/mintu.jpg");
        byte[] data =  new byte[file.available()];
        file.read(data);
        address.setImage(data);
        
         Session session = factory.openSession();
         session.beginTransaction();
         session.save(st);
         session.save(address);
         session.getTransaction().commit();
         
         
         session.close();
         System.out.println("Done");
        
    }
}
