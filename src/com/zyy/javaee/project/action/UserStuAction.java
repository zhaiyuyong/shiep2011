package com.zyy.javaee.project.action;

import java.util.Date;

import javax.annotation.Resource;

import org.apache.struts2.ServletActionContext;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;
import com.zyy.javaee.project.po.Student;
import com.zyy.javaee.project.service.StudentManager;
import com.zyy.javaee.project.vo.StudentForm;
@Component("userstuAction")
@Scope("prototype")
public class UserStuAction extends ActionSupport implements ModelDriven{
	private Integer id = (Integer)ServletActionContext.getRequest().getSession().getAttribute("stu_id");
	private Student student;
	
	public Student getStudent() {
		return student;
	}

	public void setStudent(Student student) {
		this.student = student;
	}
	
	private StudentManager studentManager;

	public StudentManager getStudentManager() {
		return studentManager;
	}
	@Resource(name="studentManager")
	public void setStudentManager(StudentManager studentManager) {
		this.studentManager = studentManager;
	}
	
	
	
	private StudentForm studentForm = new StudentForm();
	

	public String myinfo()throws Exception{
		this.student=this.studentManager.getStudent(id);
		return "myinfo";
	}
	public String update()throws Exception{
		///System.out.println(this.studentForm.getPassword());
		//System.out.println(this.studentForm.getEmail());
		
		//System.out.println(this.studentForm.getAddress());
		Student student=this.studentManager.getStudent(id);
		student.setAddress(this.studentForm.getAddress());
		student.setEmail(this.studentForm.getEmail());
		//this.student.setBirth(new Date(this.studentForm.getBirth()));
		student.setPassword(this.studentForm.getPassword());
		this.studentManager.updateStudent(student);
		this.student=student;
		//System.out.println(this.student==null);
		return "update";
	}

	public Object getModel() {
		// TODO Auto-generated method stub
		return studentForm;
	}
	
}
