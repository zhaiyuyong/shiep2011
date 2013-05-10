package com.zyy.javaee.project.action.ajax;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import com.opensymphony.xwork2.ActionSupport;
import com.zyy.javaee.project.util.GetMail;
import com.zyy.javaee.project.vo.MailVo;

@Component("geteamilAction")
@Scope("prototype")
public class GetMailAction extends ActionSupport {
	private String user;
	private String password;
	public String getUser() {
		return user;
	}
	public void setUser(String user) {
		this.user = user;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	
	private List<MailVo> mails = new ArrayList<MailVo>() ;
	public List<MailVo> getMails() {
		return mails;
	}
	public void setMails(List<MailVo> mails) {
		this.mails = mails;
	}
	@Override
	public String execute() throws Exception {
		System.out.println(user+"   "+password);
		GetMail getmail = new GetMail(user, password);
		List messages = getmail.getMailInfo(getmail.getAllMail());
		for(int i=0;i<messages.size();i++){
			Map map = (Map) messages.get(i);
			System.out.println(map.get("subject"));
			System.out.println(map.get("sender"));
			System.out.println(map.get("senddate"));
			MailVo m = new MailVo();
			m.setId((String) map.get("ID"));
			m.setSenddate((String)map.get("senddate"));
			m.setSender((String)map.get("sender"));
			m.setSubject((String)map.get("subject"));
			this.mails.add(m);
		}
		
		return "success";
	}
	
	
}
