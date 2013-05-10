package com.zyy.javaee.project.service;

import org.junit.BeforeClass;
import org.junit.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.zyy.javaee.project.po.Student;

public class StudentManagerTest {

	private static StudentManager studentManager;
	@BeforeClass
	public static void beforClass(){
		//ApplicationContext ctx = new ClassPathXmlApplicationContext("beans.xml");
		studentManager = (StudentManager)new ClassPathXmlApplicationContext("beans.xml").getBean("studentManager");
	}
	
	@Test
	public void testGetStudent()throws Exception{
		Student student = studentManager.getStudent(12);
		System.out.println(student.getStuName());
		
	}
}
