package com.zyy.javaee.project.po;

import java.util.Date;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

import org.hibernate.Hibernate;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;

import test.hibernate.Customer;
import test.hibernate.Orders;



public class TextPo {
	
	private static SessionFactory sf = null;
	@BeforeClass
	public static void beforeClass(){
		sf = GetSessionFactory.getSessionFactory();
	}
	@AfterClass
	public static void afterClass() {
		sf.close();
	}

	@Test
	public void saveStudent(){
		Set<Information> informations = new HashSet<Information>();
		Transaction tx = null;
		Student student = new Student();
		student.setStuName("µÔÓñÓÂ");
		Information information = new Information();
		
		information.setTitle("·Å¼Ù");
		information.setTime(new Date());
		informations.add(information);
		//student.setInformations(informations);
		Session session = sf.openSession(); 
		
		tx = session.beginTransaction();
		session.save(student);
		tx.commit();
		session.close();
	}
	
	@Test
	public void saveMessage(){
		Message message = new Message();
		message.setTitle("message is title222");
		Student student = new Student();
		student.setId(1);
		message.setStudent(student);
		Transaction tx = null;
		
		Session session = sf.openSession(); 
		
		tx = session.beginTransaction();
		session.save(message);
		tx.commit();
		session.close();
	}
	
	@Test
	public void saveCustomer(){
		Customer customer = new Customer();
		customer.setCname("zyy");
		
		Transaction tx = null;
		Session session = sf.getCurrentSession();
		tx = session.beginTransaction();
		session.save(customer);
		tx.commit();
	}
	
	@Test
	public void saveOrders(){
		Orders order = new Orders();
		order.setOrderno("20102036");
		Customer customer = new Customer();
		customer.setId(1);
		order.setCustomer(customer);
		
		Transaction tx = null;
		Session session = sf.getCurrentSession();
		tx = session.beginTransaction();
		session.save(order);
		tx.commit();
	}
	
	@Test
	public void testLazyGet(){
		Transaction tx = null;
		Session session = sf.openSession();
		tx = session.beginTransaction();
		Customer customer = (Customer) session.get(Customer.class, new Integer(1));
		tx.commit();
		session.close();
		System.out.println("¹Ë¿ÍÃû×Ö£º"+customer.getCname());
		System.out.println(customer.getOrders().size());
		Iterator<Orders> it = customer.getOrders().iterator();
		Orders order = null;
		while(it.hasNext()){
			order = (Orders) it.next();
			System.out.println("¶©µ¥±àºÅ£º"+order.getOrderno());
		}	
	}
	
	
	@Test
	public void testLazyLoad(){
		Transaction tx = null;
		Session session = sf.openSession();
		tx = session.beginTransaction();
		Customer customer = (Customer) session.load(Customer.class, new Integer(1));
		if(!Hibernate.isInitialized(customer)){
			Hibernate.initialize(customer);
		}
		if(!Hibernate.isInitialized(customer.getOrders())){
			Hibernate.initialize(customer.getOrders());
		}
		tx.commit();
		session.close();
		System.out.println("¹Ë¿ÍÃû×Ö£º"+customer.getCname());
		System.out.println(customer.getOrders().size());
		
		Iterator<Orders> it = customer.getOrders().iterator();
		Orders order = null;
		while(it.hasNext()){
			order = (Orders) it.next();
			System.out.println("¶©µ¥±àºÅ£º"+order.getOrderno());
		}	
	}
}
