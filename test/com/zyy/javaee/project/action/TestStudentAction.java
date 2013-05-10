package com.zyy.javaee.project.action;

import org.junit.BeforeClass;
import org.junit.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.zyy.javaee.project.po.Student;

public class TestStudentAction {
	private static StudentAction studentAction ;
	
	@BeforeClass
	public static void beforClass(){
		studentAction = (StudentAction)new ClassPathXmlApplicationContext("beans.xml").getBean("studentAction");
	}
	@Test
	public void testtoupdate() throws Exception{
		System.out.println(studentAction.getClass().getName());
		String toupate=studentAction.toupdate();
		System.out.println(toupate);
		Student student = studentAction.getStudentManager().getStudent(3);
		System.out.println(student.getClass().getName());	
	}
}
