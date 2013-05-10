package com.zyy.javaee.project.dao;

import java.util.Date;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.zyy.javaee.project.daohibernate.StudentDaoHibernate;
import com.zyy.javaee.project.po.Student;

public class StudentDaoTest {

	@Test
	public void testSaveStudent(){
		ApplicationContext ctx = new ClassPathXmlApplicationContext("beans.xml");
		StudentDaoHibernate studentDao = (StudentDaoHibernate)ctx.getBean("studentDao");
		Student s = new Student();
		s.setStuName("������");
		s.setStuNo("20091722");
		s.setAddress("�Ϻ�����ѧԺ����԰��34��1��Ԫ");
		s.setEmail("zhaiyuyong@126.com");
		s.setBirth(new Date());
		s.setClassNo("2009051");
		s.setDept("���������Ϣ����ѧԺ");
		s.setPassword("610703");
		s.setAddress("�Ϻ�");
		s.setSex("��");
		Integer ii=studentDao.save(s);
		System.out.println(ii);
		
	}
	
	@Test
	public void testGetStudent(){
		ApplicationContext ctx = new ClassPathXmlApplicationContext("beans.xml");
		StudentDaoHibernate studentDao = (StudentDaoHibernate)ctx.getBean("studentDao");
		Student student = studentDao.getStudent(4);
		System.out.println((student==null));
		
	}
}
