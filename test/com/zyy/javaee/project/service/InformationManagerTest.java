package com.zyy.javaee.project.service;

import java.util.List;

import org.junit.BeforeClass;
import org.junit.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.zyy.javaee.project.exception.StudentException;
import com.zyy.javaee.project.po.Information;

public class InformationManagerTest {

	private static InformationManager informationManager;
	@BeforeClass
	public static void beforClass(){
		informationManager = (InformationManager)new ClassPathXmlApplicationContext("beans.xml").getBean("informationManager");
	}
	
	@Test
	public void testFindAll() throws StudentException{
		List<Information> informations = informationManager.getAll();
		System.out.println(informations.size());
		for(Information information:informations){
			System.out.println("Title======"+information.getTitle());
			System.out.println("∑¢≤º»À:::::::::::"+information.getManager().getName());
			//System.out.println(information.getStudent().getStuName());
			
		}
		
	}
}
