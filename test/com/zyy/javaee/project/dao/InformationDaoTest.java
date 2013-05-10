package com.zyy.javaee.project.dao;

import java.util.List;

import org.junit.BeforeClass;
import org.junit.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.zyy.javaee.project.po.Information;

public class InformationDaoTest {

	private static InformationDao informationDao;
	
	@BeforeClass
	public static void beforeClass(){
		informationDao = (InformationDao)new ClassPathXmlApplicationContext("beans.xml").getBean("informationDao");
	}
	
	@Test
	public void testFindAll(){
		List<Information> informations = informationDao.findAll();
		System.out.println(informations.size());
		
	}
	@Test
	public void testfindAllBySize(){
		List list = informationDao.findAllBySize(5);
		System.out.println(list.size());
	
	}
}
