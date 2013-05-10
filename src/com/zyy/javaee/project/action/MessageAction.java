package com.zyy.javaee.project.action;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import com.opensymphony.xwork2.ActionSupport;
import com.zyy.javaee.project.po.Message;
import com.zyy.javaee.project.service.MessageManager;
@Component("messageAction")
@Scope("prototype")
public class MessageAction extends ActionSupport{
	private MessageManager messageManager;

	public MessageManager getMessageManager() {
		return messageManager;
	}
	@Resource(name="messageManager")
	public void setMessageManager(MessageManager messageManager) {
		this.messageManager = messageManager;
	}
	private List<Message> messages;

	public List<Message> getMessages() {
		return messages;
	}
	public void setMessages(List<Message> messages) {
		this.messages = messages;
	}
	private Integer messid;
	public Integer getMessid() {
		return messid;
	}
	public void setMessid(Integer messid) {
		this.messid = messid;
	}
	/**
	 * 
	 * @return
	 * @throws Exception
	 */
	public String old()throws Exception{
		this.messages=this.messageManager.getMessageByFlag(1);
		return "old";
	}
	/**
	 * 
	 * @return
	 * @throws Exception
	 */
	public String xin()throws Exception{
		this.messages=this.messageManager.getMessageByFlag(0);
		return "xin";
	}
	/**
	 * 
	 * @return
	 * @throws Exception
	 */
	public String delete()throws Exception{
		this.messageManager.deleteMessage(messid);
		return "delete";
	}
	
	
	
}
