package com.zyy.javaee.project.action;

import java.io.PrintWriter;

import javax.servlet.http.HttpServletResponse;

import org.apache.struts2.ServletActionContext;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import com.opensymphony.xwork2.ActionSupport;
import com.zyy.javaee.project.util.SendTextMail;
@Component("sendeamilAction")
@Scope("prototype")
public class SendEmailAction extends ActionSupport{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String shoujianre;
	public String getShoujianre() {
		return shoujianre;
	}
	public void setShoujianre(String shoujianre) {
		this.shoujianre = shoujianre;
	}
	private String subject;
	private String content;
	public String getSubject() {
		return subject;
	}
	public void setSubject(String subject) {
		this.subject = subject;
	}
	public String getContent() {
		return content;
	}
	public void setContent(String content) {
		this.content = content;
	}
	@Override
	public String execute() throws Exception {
		try {
			HttpServletResponse response = ServletActionContext.getResponse();
			response.setContentType("text/html;charset=gbk");
			PrintWriter out = response.getWriter();
			System.out.println("this.shoujianre"+this.shoujianre);
			System.out.println("this.subject"+this.subject);
			System.out.println("this.content"+this.content);
			SendTextMail sendtextMail = new SendTextMail(this.shoujianre,this.subject,this.content);
			boolean flag = sendtextMail.send();
			if(flag){
				out.println("<p style='color:red;'>邮件发送成功</p>");
			}else{
				out.println("<p style='color:red;'>邮件发送失败</p>");
			}
			out.flush();
			out.close();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}

}
