package com.zyy.javaee.project.dao;

import java.util.List;

import org.junit.BeforeClass;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.zyy.javaee.project.po.Message;

public class MessageDaoTest {
	private static MessageDao messageDao;
	@BeforeClass
	public static void beforClass(){
		//ApplicationContext ctx = new ClassPathXmlApplicationContext("beans.xml");
		 messageDao = (MessageDao)new ClassPathXmlApplicationContext("beans.xml").getBean("messageDao");
	}

	@Test
	public void testFindAllByPage(){
		List all = messageDao.findAllByPage(2, 3);
		System.out.println(all.size());
		for(int i=0;i<all.size();i++){
			Message message= (Message) all.get(i);
			System.out.println(message.getTitle());
		}
	}
	@Test
	public void testFindCount(){
		long all = messageDao.findCount();
		System.out.println(all);
	}
}
