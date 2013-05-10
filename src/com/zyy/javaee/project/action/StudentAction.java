package com.zyy.javaee.project.action;

import java.util.Date;
import java.util.List;

import javax.annotation.Resource;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;
import com.zyy.javaee.project.po.Student;
import com.zyy.javaee.project.service.StudentManager;
import com.zyy.javaee.project.vo.StudentForm;

@Component("studentAction")
@Scope("prototype")
public class StudentAction extends ActionSupport implements ModelDriven {
	
	private List<Student> all;
	private StudentManager studentManager;
	private StudentForm studentForm = new StudentForm();
	private Student student;
	private String stuName;

	public String getStuName() {
		return stuName;
	}

	public void setStuName(String stuName) {
		this.stuName = stuName;
	}

	public Student getStudent() {
		return student;
	}

	public void setStudent(Student student) {
		this.student = student;
	}

	private Integer stuId;
	/**
	 * 删除学生
	 * @return
	 * @throws Exception
	 */
	public String delete() throws Exception {
		this.studentManager.deleteStudent(stuId);
		return "delete";
	}
	/**
	 * 查看学生
	 * @return
	 * @throws Exception
	 */
	public String toupdate() throws Exception {
		System.out.println(stuId);
		this.student = this.studentManager.getStudent(stuId);
		//System.out.println(student == null);
		//System.out.println(student.getInformations().size());
		//System.out.println(student.getMessages().size());
		//System.out.println(student.getMessages());
		return "toupdate";
	}
	/**
	 * 增加学生
	 * @return
	 * @throws Exception
	 */
	public String add() throws Exception {
		System.out.println("add student begin");
		Student s = new Student();
		// s.setId(Integer.parseInt(this.studentForm.getId()));
		s.setStuNo(this.studentForm.getStuNo());
		
		s.setStuName(this.studentForm.getStuName());
		System.out.println("this.studentForm.getStuName()"+this.studentForm.getStuName());
		s.setDept(this.studentForm.getDept());
		s.setAddress(this.studentForm.getAddress());
		s.setEmail(this.studentForm.getEmail());
		s.setSex(this.studentForm.getSex());
		s.setPassword(this.studentForm.getPassword());
		s.setBirth(new Date());
		s.setClassNo(this.studentForm.getClassNo());
		this.studentManager.addStudent(s);
		return "add";
	}
	/**
	 * 所有学生
	 * @return
	 * @throws Exception
	 */
	public String list() throws Exception {	
		this.all = this.studentManager.getAllStudent();
		return "list";
	}
	/**
	 * 修改学生
	 * @return
	 * @throws Exception
	 */
	public String update() throws Exception {
		// System.out.println(this.studentForm.getClassNo());
		Student s = new Student();
		s.setId(Integer.parseInt(this.studentForm.getId()));
		s.setStuNo(this.studentForm.getStuNo());
		s.setStuName(this.studentForm.getStuName());
		s.setDept(this.studentForm.getDept());
		s.setAddress(this.studentForm.getAddress());
		s.setEmail(this.studentForm.getEmail());
		s.setSex(this.studentForm.getSex());
		s.setPassword(this.studentForm.getPassword());
		s.setBirth(new Date());
		s.setClassNo(this.studentForm.getClassNo());
		this.studentManager.updateStudent(s);
		// System.out.println("stuName"+stuName);
		// System.out.println(this.student.getClassNo());
		return "update";

	}

	public List<Student> getAll() {
		return all;
	}

	public StudentManager getStudentManager() {
		return studentManager;
	}

	public Integer getStuId() {
		return stuId;
	}

	public void setAll(List<Student> all) {
		this.all = all;
	}

	@Resource(name = "studentManager")
	public void setStudentManager(StudentManager studentManager) {
		this.studentManager = studentManager;
	}

	public void setStuId(Integer stuId) {
		this.stuId = stuId;
	}

	public Object getModel() {
		return studentForm;
	}
}
