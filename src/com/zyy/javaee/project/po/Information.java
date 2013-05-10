package com.zyy.javaee.project.po;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
@Entity
@Table(name="t_information")

public class Information implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String content;
	private Integer id;
	//private Student student;
	private Date time;
	private String title;
	private Manager manager;
	@ManyToOne(fetch=FetchType.LAZY)
	@JoinColumn(name="MANAGER_ID")
	public Manager getManager() {
		return manager;
	}
	public void setManager(Manager manager) {
		this.manager = manager;
	}
	@Column(name="CONTENT",length=3200)
	public String getContent() {
		return content;
	}
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="ID",unique=true,nullable=false)
	public Integer getId() {
		return id;
	}/*
	@ManyToOne(cascade={CascadeType.ALL},fetch=FetchType.LAZY)
	@JoinColumn(name="STUDENT_ID")
	public Student getStudent() {
		return student;
	}*/
	@Column(name="TIME")
	public Date getTime() {
		return time;
	}
	@Column(name="TITLE",length=100)
	public String getTitle() {
		return title;
	}
	public void setContent(String content) {
		this.content = content;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	/*
	public void setStudent(Student student) {
		this.student = student;
	}*/
	public void setTime(Date time) {
		this.time = time;
	}
	public void setTitle(String title) {
		this.title = title;
	}
}
