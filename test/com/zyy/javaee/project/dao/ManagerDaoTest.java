package com.zyy.javaee.project.dao;

import org.junit.BeforeClass;
import org.junit.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.zyy.javaee.project.po.Manager;

public class ManagerDaoTest {

	private static ManagerDao managerDao;
	@BeforeClass
	public static void beforClass(){
		managerDao = (ManagerDao)new ClassPathXmlApplicationContext("beans.xml").getBean("managerDao");
	}
	@Test
	public void tetsGetManager(){
		Manager manager = this.managerDao.getManagerById(2);	
		System.out.println(manager.getPassword());
	}
}
