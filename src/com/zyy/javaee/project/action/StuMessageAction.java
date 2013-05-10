package com.zyy.javaee.project.action;


import java.util.Date;
import java.util.List;

import javax.annotation.Resource;

import org.apache.struts2.ServletActionContext;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;
import com.zyy.javaee.project.po.Message;
import com.zyy.javaee.project.po.Student;
import com.zyy.javaee.project.service.MessageManager;
import com.zyy.javaee.project.vo.MessageForm;
@Component("stumessageAction")
@Scope("prototype")
public class StuMessageAction extends ActionSupport implements ModelDriven{
	private Integer id = (Integer)ServletActionContext.getRequest().getSession().getAttribute("stu_id");
	private MessageManager messageManager;

	public MessageManager getMessageManager() {
		return messageManager;
	}
	@Resource(name = "messageManager")
	public void setMessageManager(MessageManager messageManager) {
		this.messageManager = messageManager;
	}
	
	
	private MessageForm messageForm = new MessageForm();
	
	
	private List<Message> messages;
	
	
	
	
	public List<Message> getMessages() {
		return messages;
	}
	public void setMessages(List<Message> messages) {
		this.messages = messages;
	}
	public 	String add()throws Exception{
		//System.out.println(this.messageForm.getTitle());
		//System.out.println(this.messageForm.getId());
		Message message = new Message();
		message.setFlag(0);
		
		message.setContent(this.messageForm.getContent());
		message.setShijian(new Date());
		Student student = this.messageManager.getStudent(id);
		message.setStudent(student);
		this.messageManager.addMessage(message);
		
		return "add";
	}
	
	public String all()throws Exception{
		this.messages=this.messageManager.getMessageByStuId(id);
		return "all";
	}
	public Object getModel() {
		// TODO Auto-generated method stub
		return messageForm;
	}
	
}
