package com.zyy.javaee.project.action;

import java.util.List;
import java.util.Set;

import javax.annotation.Resource;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import com.opensymphony.xwork2.ActionSupport;
import com.zyy.javaee.project.po.Information;
import com.zyy.javaee.project.po.Message;
import com.zyy.javaee.project.service.InformationManager;
import com.zyy.javaee.project.service.MessageManager;
@Component("indexAction")
@Scope("prototype")
public class IndexAction extends ActionSupport{

	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private  Integer info;

	private InformationManager informationManager;
	private List<Information> informations;
	private Information infromation;

	private Integer maxpage;
	@Resource(name="messageManager")
	private MessageManager messageManager;
	private Integer page;
	private List<Message> messages;
	
	
	public List<Message> getMessages() {
		return messages;
	}
	public void setMessages(List<Message> messages) {
		this.messages = messages;
	}
	/**
	 * 
	 * @return
	 * @throws Exception
	 */
	public String all() throws Exception{
		System.out.println("page====="+this.page);
		if(page==null){
			page=1;
		}
		if(page<1){
			page = 1;
		}
		long allCount=this.informationManager.findAllCount();
		
		int a = Integer.parseInt(allCount+"");
		if(a%10==0){
			this.maxpage=a/10;
		}else{
			this.maxpage=a/10+1;
		}
		if(page>maxpage){
			this.page=this.maxpage;
		}
		this.informations=this.informationManager.findAllByPage(page);
		
		return "all";
		
	}
	/**
	 * 
	 */
	@Override
	public String execute() throws Exception {
		this.informations=this.informationManager.getInfoBySize(5);
		System.out.println("informations.size()"+informations.size());
		return "success";
	}
	public Integer getInfo() {
		return info;
	}
	public InformationManager getInformationManager() {
		return informationManager;
	}
	public List<Information> getInformations() {
		return informations;
	}
	public Information getInfromation() {
		return infromation;
	} 
	
	public Integer getMaxpage() {
		return maxpage;
	}
	public MessageManager getMessageManager() {
		return messageManager;
	}
	public Integer getPage() {
		return page;
	}
	
	/**
	 * 
	 * @return
	 * @throws Exception
	 */
	public String info() throws Exception{
		this.infromation=this.informationManager.getInformation(this.info);
		return "info";
	}
	/**
	 * 
	 * @return
	 * @throws Exception
	 */
	public String message()throws Exception{
		System.out.println("page====="+this.page);
		if(page==null){
			page=1;
		}
		if(page<1){
			page = 1;
		}
		long allCount=this.messageManager.findAllCount();
		
		int a = Integer.parseInt(allCount+"");
		if(a%10==0){
			this.maxpage=a/10;
		}else{
			this.maxpage=a/10+1;
		}
		if(page>maxpage){
			this.page=this.maxpage;
		}
		this.messages=this.messageManager.getAllMessages(page);
		for(int i=0;i<this.messages.size();i++){
			Message m = this.messages.get(i);
			System.out.println(m.getContent());
			Set se = m.getRepmessages();
			System.out.println("se.size()"+se.size());
		}
			
		//List<RepMessage> repMessages=(List<RepMessage>) this.messages.get(0);
		//System.out.println("repMessages.size()"+repMessages.size());
		
		return "message";
	}
	
	public void setInfo(Integer info) {
		this.info = info;
	}
	
	
	@Resource(name = "informationManager")
	public void setInformationManager(InformationManager informationManager) {
		this.informationManager = informationManager;
	}

	public void setInformations(List<Information> informations) {
		this.informations = informations;
	}
	public void setInfromation(Information infromation) {
		this.infromation = infromation;
	}
	public void setMaxpage(Integer maxpage) {
		this.maxpage = maxpage;
	}
	/*@Resource(name="messageManager")
	public void setMessageManager(MessageManager messageManager) {
		this.messageManager = messageManager;
	}
	public void setPage(Integer page) {
		this.page = page;
	}*/
	
}
