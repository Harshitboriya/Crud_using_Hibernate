package com.hiber.First1;


import java.util.Properties;

import org.hibernate.SessionFactory;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;
import org.hibernate.cfg.Environment;
import org.hibernate.service.ServiceRegistry;


public class HiberConnection {
	private static SessionFactory sessionfactory;
	
	public static SessionFactory getsess() {
		
		if(sessionfactory == null)
		{
		  Configuration conf = new Configuration();
		  Properties pro = new Properties();
		  
		  pro.put(Environment.DRIVER,"com.mysql.cj.jdbc.Driver");
		  pro.put(Environment.URL,"jdbc:mysql://localhost:3306/crud1");
		  pro.put(Environment.USER,"root");
		  pro.put(Environment.PASS,"1111");
		  pro.put(Environment.DIALECT,"org.hibernate.dialect.MySQL8Dialect");
		  pro.put(Environment.HBM2DDL_AUTO,"update");
		  pro.put(Environment.SHOW_SQL, true);
		  

		  conf.setProperties(pro);
		  conf.addAnnotatedClass(Emp.class);
		  
		  ServiceRegistry serviceRegistry = new StandardServiceRegistryBuilder().applySettings(conf.getProperties()).build();
		  sessionfactory = conf.buildSessionFactory(serviceRegistry); 		  
		}
		
		
		return sessionfactory;
		
	}

}
