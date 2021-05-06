package com.jocata.Mapping_Hibernate;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.service.ServiceRegistryBuilder;

public class App 
{
    public static void main( String[] args )
    {
    	Configuration config = new Configuration().configure().addAnnotatedClass(Laptop.class).addAnnotatedClass(Student.class);
    	org.hibernate.service.ServiceRegistry registry = new ServiceRegistryBuilder().applySettings(config.getProperties()).buildServiceRegistry();
    	SessionFactory sf = config.buildSessionFactory(registry);
    	Session s1 = sf.openSession();
    	

    	Laptop lap = new Laptop();
    	lap.setLaptop_id(51231);
    	lap.setLaptop_name("Asus");

    	Laptop lap1 = new Laptop();
    	lap1.setLaptop_id(51232);
    	lap1.setLaptop_name("Dell");
    	

    	Laptop lap2 = new Laptop();
    	lap2.setLaptop_id(51233);
    	lap2.setLaptop_name("HP");

    	Laptop lap3 = new Laptop();
    	lap3.setLaptop_id(51234);
    	lap3.setLaptop_name("Acer");
    	

    	Laptop lap4 = new Laptop();
    	lap4.setLaptop_id(51235);
    	lap4.setLaptop_name("Lenovo");
    	
    	Student s = new Student();
    	s.setRollno(101);
    	s.setName("Rahul");
    	s.setMarks(50);
    	s.getLap_list().add(lap);
    	s.getLap_list().add(lap1);
    	

    	Student stu = new Student();
    	stu.setRollno(102);
    	stu.setName("Ankit");
    	stu.setMarks(50);
    	stu.getLap_list().add(lap2);
    	stu.getLap_list().add(lap3);
    	stu.getLap_list().add(lap4);
    	
    	
    	
    	s1.beginTransaction();
    	
    	s1.save(lap);
    	s1.save(lap1);
    	s1.save(lap2);
    	s1.save(lap3);
    	s1.save(lap4);
    	s1.save(s);
    	s1.save(stu);

    	
    	s1.getTransaction().commit();
    	
    	
    }
}
