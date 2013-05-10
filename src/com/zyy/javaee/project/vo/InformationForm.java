package com.zyy.javaee.project.vo;

import java.util.Date;



public class InformationForm {
	private String content;
	private Integer id;	
	private Date time;
	private String title;
	private String manager_name;
	private String student_name;
	public String getContent() {
		return content;
	}
	public void setContent(String content) {
		this.content = content;
	}
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public Date getTime() {
		return time;
	}
	public void setTime(Date time) {
		this.time = time;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getManager_name() {
		return manager_name;
	}
	public void setManager_name(String managerName) {
		manager_name = managerName;
	}
	public String getStudent_name() {
		return student_name;
	}
	public void setStudent_name(String studentName) {
		student_name = studentName;
	}
	
}
