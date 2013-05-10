package com.zyy.javaee.project.service;

import java.util.Date;
import java.util.List;
import java.util.Set;

import org.junit.BeforeClass;
import org.junit.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.zyy.javaee.project.exception.StudentException;
import com.zyy.javaee.project.po.Message;
import com.zyy.javaee.project.po.RepMessage;

public class MessageManagerTest {

	private static MessageManager messageManager;
	
	@BeforeClass
	public static void beforClass(){
		messageManager = (MessageManager)new ClassPathXmlApplicationContext("beans.xml").getBean("messageManager");
	}
	
	
	@Test
	public void testgetMessageByStuId() throws StudentException{
		
		List list = messageManager.getMessageByStuId(2);
		System.out.println(list.size());
	}
	@Test
	public void testgetMessageByFlag() throws StudentException{
		List list = messageManager.getMessageByFlag(0);
		System.out.println(list==null);
		//System.out.println(list.size());
	}
	@Test
	public void testgetAllMessages() throws StudentException{
		List list = messageManager.getAllMessages(1);
		for(int i=0;i<list.size();i++){
			Message m = (Message) list.get(i);
			System.out.println(m.getContent());
			Set se = m.getRepmessages();
			System.out.println(se.size());
		}
		System.out.println(list.size());
	}
	
	@Test
	public void testsaveRepMessage(){
		RepMessage repMessage = new RepMessage();
		repMessage.setContent("¹þ¹þ¹þ");
		repMessage.setShijian(new Date());
		repMessage.getMessage().setId(1);
		repMessage.getManager().setId(1);
		repMessage.getStudent().setId(1);
	}
}
