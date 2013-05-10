package com.zyy.javaee.project.action;

import javax.annotation.Resource;
import javax.servlet.http.HttpSession;

import org.apache.struts2.ServletActionContext;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;
import com.zyy.javaee.project.service.StudentManager;

@Component("manager")
@Scope("prototype")
public class ManagerLoginAction extends ActionSupport {

	
	public ManagerLoginAction() {
		System.out.println( "我是 ManagerLoginAction的构造方法.................");
	}

	
	private String password;
	private StudentManager studentManager;
	private String username;
	private String yzm;

	@Override
	public String execute() throws Exception {
		ActionContext ctx = ActionContext.getContext();
		//System.out.println("yzm======" + ctx.getSession().get("yzm"));
		//System.out.println(username + "" + password + "" + yzm + "");
		String yzm2 = (String) ctx.getSession().get("yzm");

		int managerId = -1;
		managerId = studentManager.managerLogin(username, password);

		if (managerId > 0 && yzm2.equals(yzm)) {
			System.out.println("I am goin");
			ServletActionContext.getRequest().getSession().setAttribute(
					"current_manager", username);
			ServletActionContext.getRequest().getSession().setAttribute(
					"current_manager_pass", password);
			ServletActionContext.getRequest().getSession().setAttribute(
					"current_manager_id", managerId);
			return "success";
		}

		return "fail";
	}

	public String quit(){
		HttpSession session  =ServletActionContext.getRequest().getSession();
		if(session.getAttribute("current_manager")!=null||session.getAttribute("current_manager_pass")!=null
				||session.getAttribute("current_manager_id")!=null){
			session.removeAttribute("current_manager");
			session.removeAttribute("current_manager_pass");
			session.removeAttribute("current_manager_id");
		}
		return "quit";
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

	public String getYzm() {
		return yzm;
	}

	
	public void setPassword(String password) {
		this.password = password;
	}

	@Resource(name = "studentManager")
	public void setStudentManager(StudentManager studentManager) {
		this.studentManager = studentManager;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public void setYzm(String yzm) {
		this.yzm = yzm;
	}

}
