package com.hiber.First1;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

public class operation1 {
	public static void create(Emp emp)
	{
		SessionFactory sf =HiberConnection.getsess();
		Session sess = sf.openSession();
		Transaction tx =  sess.beginTransaction();
		sess.save(emp);
		tx.commit();
		sess.close();
		System.out.println("insert success");
		
		
	}
	public static void delete(int id) 
	{
		SessionFactory sf = HiberConnection.getsess();
		Session sess = sf.openSession();
		Transaction tx = sess.beginTransaction();
		
		Emp emp =sess.get(Emp.class, id);
		sess.delete(emp);
		
		 tx.commit();
		 sess.close();
		 sf.close();
		 
		
	}
	public static void Search(int id)
	{
		SessionFactory sf =HiberConnection.getsess();
		Session sess = sf.openSession();
		Transaction tx = sess.beginTransaction();
		
		Emp emp = sess.get(Emp.class,id);
		System.out.println(emp);
		
		tx.commit();
		sess.close();
		sf.close();
		
		
	}
	public static void DisplayAll()
	{
		SessionFactory sf = HiberConnection.getsess();
		Session sess = sf.openSession();
		Transaction tx =sess.beginTransaction();
		
		List<Emp> li = sess.createQuery("from Emp",Emp.class).list();
		System.out.println(li);
		
		tx.commit();
		sess.close();
		sf.close();
		
		
	}
	public static void Update(int id, Emp emp)
	{
		SessionFactory sf= HiberConnection.getsess();
		Session sess = sf.openSession();
		Transaction tx =sess.beginTransaction();
		
		sess.get(Emp.class, id);
		sess.saveOrUpdate(emp);
		
		tx.commit();
		sess.close();
		sf.close();
	}
	

}
