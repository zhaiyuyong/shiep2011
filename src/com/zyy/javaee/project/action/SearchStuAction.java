package com.zyy.javaee.project.action;

import java.io.PrintWriter;
import java.net.URLDecoder;
import java.util.List;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.struts2.ServletActionContext;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import sun.nio.cs.ext.GBK;

import com.opensymphony.xwork2.ActionSupport;
import com.zyy.javaee.project.po.Student;
import com.zyy.javaee.project.service.StudentManager;
@Component("searchstuAction")
@Scope("prototype")
public class SearchStuAction extends ActionSupport{

	private StudentManager studentManager;
	
	public StudentManager getStudentManager() {
		return studentManager;
	}
	@Resource(name="studentManager")
	public void setStudentManager(StudentManager studentManager) {
		this.studentManager = studentManager;
	}
	
	private String name;

	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	@Override
	public String execute() throws Exception {
	 try {
		HttpServletResponse response = ServletActionContext.getResponse();
		response.setContentType("text/html;charset=gbk");
		PrintWriter out = response.getWriter();
		System.out.println("name==="+name);	
		List<Student> list = this.studentManager.getStudent(name);
		if(list.size()>0){
			out.println(list.get(0).getEmail());
		}
		out.flush();
		out.close();
		
	} catch (Exception e) {
		
		e.printStackTrace();
	}
		
		return null;
	}
	

}
