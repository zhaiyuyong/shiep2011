package com.zyy.javaee.project.util;


import java.util.Date;
import java.util.Properties;

import javax.mail.*;
import javax.mail.internet.*;


public class SendTextMail {
	String SMTPHost = "SMTP.126.com";
	String user = "zhaiyuyong@126.com";
	String password = "zhaiyuyong610703";
	String from = "zhaiyuyong@126.com";
	String to = "";
	String subject = "";
	String content = "";
	
	
	
	
	
	//·¢ËÍÓÊ¼þ
	public boolean send(){
		Properties props = new Properties();
		
		props.put("mail.smtp.host", SMTPHost);
		
		props.put("mail.smtp.auth", "true");
		
		try{
			SmtpAuth auth = new SmtpAuth();
			auth.setAccount(user, password);
			
			Session mailSession = Session.getDefaultInstance(props,auth);
			
			mailSession.setDebug(true);
			
			Message message = new MimeMessage(mailSession);
			
			message.setFrom(new InternetAddress(from));
			
			message.addRecipient(Message.RecipientType.TO, new InternetAddress(to));
			
			message.setSubject(subject);
			message.setText(content);
			
			message.setSentDate(new Date());
			
			
			message.setHeader("X-Priority", "1");
			
			message.saveChanges();
			
			Transport transport = mailSession.getTransport("smtp");
			
			
			transport.connect(SMTPHost, user,password);
			transport.sendMessage(message, message.getAllRecipients());
			transport.close();
			return true;
		
			}catch(Exception x){
			x.printStackTrace();
			return false;
		}
	
	}
	public SendTextMail(String to, String subject, String content) {
		super();
		this.to = to;
		this.subject = subject;
		this.content = content;
	}
	public SendTextMail() {
		super();
	}
	static class SmtpAuth extends Authenticator{
		String user,password;
		void setAccount(String user,String password){
			this.user = user;
			this.password = password;
		}
		protected PasswordAuthentication getPasswordAuthentication(){
			return new PasswordAuthentication(user, password);
		}
	}
	
	
}
