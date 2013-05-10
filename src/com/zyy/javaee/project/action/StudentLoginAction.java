package com.zyy.javaee.project.action;

import javax.annotation.Resource;
import javax.servlet.http.HttpSession;

import org.apache.struts2.ServletActionContext;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import com.opensymphony.xwork2.ActionSupport;
import com.zyy.javaee.project.service.StudentManager;

@Component("student")
@Scope("prototype")
public class StudentLoginAction extends ActionSupport{

	private String error;
	private String password;
	
	private StudentManager studentManager;
	private String username;
	public StudentLoginAction() {
		System.out.println("我是StudentLoginAction");
	}

	public String getError() {
		return error;
	}

	public String getPassword() {
		return password;
	}
	
	public StudentManager getStudentManager() {
		return studentManager;
	}
	
	
	public String getUsername() {
		return username;
	}
	
	public String quit()throws Exception{
		HttpSession session  =ServletActionContext.getRequest().getSession();
		if(session.getAttribute("stu_no")!=null||session.getAttribute("stu_pass")!=null
				||session.getAttribute("stu_id")!=null){
			session.removeAttribute("stu_no");
			session.removeAttribute("stu_pass");
			session.removeAttribute("stu_id");
		}
		return "quit";
	}
	
	
	@Override
	public String execute() throws Exception {
		System.out.println("username===="+username);
		System.out.println("password===="+password);
		int flag=-1;
		flag=this.studentManager.studentLogin(username, password);
		if(flag>0){
			System.out.println("I am goin");
			ServletActionContext.getRequest().getSession().setAttribute(
					"stu_no", username);
			ServletActionContext.getRequest().getSession().setAttribute(
					"stu_pass", password);
			ServletActionContext.getRequest().getSession().setAttribute(
					"stu_id", flag);
			System.out.println(flag);
			return "success";
		}else{
			this.error="用户名或者密码错误~";
			System.out.println(flag);
			return "fail";
		}
		
	}

	public void setError(String error) {
		this.error = error;
	}
	
	
	
	public void setPassword(String password) {
		this.password = password;
	}
	@Resource(name="studentManager")
	public void setStudentManager(StudentManager studentManager) {
		this.studentManager = studentManager;
	}

	public void setUsername(String username) {
		this.username = username;
	}

}
