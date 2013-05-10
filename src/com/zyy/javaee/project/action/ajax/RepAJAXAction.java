package com.zyy.javaee.project.action.ajax;

import java.io.PrintWriter;
import java.util.Date;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletResponse;

import org.apache.struts2.ServletActionContext;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import com.opensymphony.xwork2.ActionSupport;
import com.zyy.javaee.project.po.Manager;
import com.zyy.javaee.project.po.Message;
import com.zyy.javaee.project.po.RepMessage;
import com.zyy.javaee.project.po.Student;
import com.zyy.javaee.project.service.MessageManager;
@Component("repajaxAction")
@Scope("prototype")
public class RepAJAXAction extends ActionSupport{
	private Integer id = (Integer)ServletActionContext.getRequest().getSession().getAttribute("current_manager_id");
	private String content;
	private Integer studentid;
	private Integer messageid;
	public Integer getMessageid() {
		return messageid;
	}
	public void setMessageid(Integer messageid) {
		this.messageid = messageid;
	}
	public String getContent() {
		return content;
	}
	public void setContent(String content) {
		this.content = content;
	}

	public Integer getStudentid() {
		return studentid;
	}
	public void setStudentid(Integer studentid) {
		this.studentid = studentid;
	}
	private MessageManager messageManager;

	public MessageManager getMessageManager() {
		return messageManager;
	}
	@Resource(name="messageManager")
	public void setMessageManager(MessageManager messageManager) {
		this.messageManager = messageManager;
	}
	@Override
	public String execute() throws Exception {
		try {
			HttpServletResponse response = ServletActionContext.getResponse();
			response.setContentType("text/html;charset=gbk");
			PrintWriter out = response.getWriter();
			System.out.println(this.content);
			System.out.println(this.studentid);
			RepMessage repMessage = new RepMessage();
			repMessage.setContent(this.content);
			repMessage.setShijian(new Date());
			Message message = this.messageManager.getMessageById(this.messageid);
			System.out.println("message==null"+(message==null));
			Student student = this.messageManager.getStudent(this.studentid);
			System.out.println("student==null"+(student==null));
			Manager manager = this.messageManager.getManagerById(id);
			System.out.println("manager==null"+(manager==null));
			repMessage.setManager(manager);
			repMessage.setStudent(student);
			repMessage.setMessage(message);
			this.messageManager.addRepMessage(repMessage);
			message.setFlag(1);
			this.messageManager.updateMessage(message);
			System.out.println(repMessage.getContent());
			out.println("<p style='color:red;'>»Ø¸´³É¹¦</p>");
			out.flush();
			out.close();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}

}
