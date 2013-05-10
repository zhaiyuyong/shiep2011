package com.zyy.javaee.project.action;

import org.junit.BeforeClass;
import org.junit.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.zyy.javaee.project.exception.StudentException;

public class TestIndexAction {
	private static IndexAction indexAction;
	
	@BeforeClass
	public static void beforClass(){
		indexAction = (IndexAction)new ClassPathXmlApplicationContext("beans.xml").getBean("indexAction");
	}
	@Test
	public void testlist() throws StudentException{
		//String result = indexAction.list();
		//System.out.println(result);
	}
}
