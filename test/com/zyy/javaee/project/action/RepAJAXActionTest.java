package com.zyy.javaee.project.action;

import java.util.Date;

import org.junit.BeforeClass;
import org.junit.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.zyy.javaee.project.action.ajax.RepAJAXAction;
import com.zyy.javaee.project.po.Manager;
import com.zyy.javaee.project.po.Message;
import com.zyy.javaee.project.po.RepMessage;
import com.zyy.javaee.project.po.Student;

public class RepAJAXActionTest {

	private static RepAJAXAction repajaxAction;
	
	
	@BeforeClass
	public static void beforClass(){
		repajaxAction = (RepAJAXAction)new ClassPathXmlApplicationContext("beans.xml").getBean("repajaxAction");
	}
	
	@Test
	public void testAJAX()throws Exception{
		RepMessage repMessage = new RepMessage();
		repMessage.setContent("hahahh");
		repMessage.setShijian(new Date());
		Message message = repajaxAction.getMessageManager().getMessageById(1);
		System.out.println("message==null"+(message==null));
		Student student = repajaxAction.getMessageManager().getStudent(1);
		System.out.println("student==null"+(student==null));
		Manager manager = repajaxAction.getMessageManager().getManagerById(1);
		System.out.println("manager==null"+(manager==null));
		repMessage.setManager(manager);
		repMessage.setStudent(student);
		repMessage.setMessage(message);
		repajaxAction.getMessageManager().addRepMessage(repMessage);
		System.out.println(repMessage.getContent());
	}
	
}
