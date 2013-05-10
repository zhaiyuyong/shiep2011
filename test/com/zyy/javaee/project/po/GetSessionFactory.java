package com.zyy.javaee.project.po;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.AnnotationConfiguration;

public class GetSessionFactory {

	private static SessionFactory sf = null;
	
	
	public static SessionFactory getSessionFactory(){
		sf = new AnnotationConfiguration().configure().buildSessionFactory();
		return sf;
	}
	
	public static void closeSessionFactory(){
		sf.close();
	}
}
