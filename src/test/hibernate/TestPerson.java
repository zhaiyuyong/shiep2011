package test.hibernate;

import java.lang.reflect.Method;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.Transaction;

import com.zyy.javaee.project.po.GetSessionFactory;
import com.zyy.javaee.project.po.Manager;



public class TestPerson {
	
	public static Manager loadTest(){
			Transaction tx = null;
			Session session = GetSessionFactory.getSessionFactory().getCurrentSession();
			tx = session.beginTransaction();
			Manager manager = (Manager) session.load(Manager.class, 1);
			System.out.println(manager.getName());
			tx.commit();
			return manager;
		
	}
	
	public static void main(String[] args) throws Exception {
		Manager manager = loadTest();
		System.out.println(manager.getName());
	}

}
