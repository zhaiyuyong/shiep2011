package com.zyy.javaee.project.po;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import org.hibernate.annotations.LazyToOne;
@Entity
@Table(name="t_repmessage")
public class RepMessage implements Serializable{
	private String content;
	private Integer id;
	private Manager manager;
	private Date shijian;
	private Student student;
	private Message message;
	@ManyToOne(fetch=FetchType.LAZY)
	@JoinColumn(name="MESSAGE_ID")
	public Message getMessage() {
		return message;
	}
	public void setMessage(Message message) {
		this.message = message;
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
	}
	@ManyToOne(fetch=FetchType.LAZY)
	@JoinColumn(name="MANAGER_ID")
	public Manager getManager() {
		return manager;
	}
	@Column(name="SHIJIAN")
	public Date getShijian() {
		return shijian;
	}
	@ManyToOne(fetch=FetchType.LAZY)
	@JoinColumn(name="STUDENT_ID")
	public Student getStudent() {
		return student;
	}
	public void setContent(String content) {
		this.content = content;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public void setManager(Manager manager) {
		this.manager = manager;
	}
	public void setShijian(Date shijian) {
		this.shijian = shijian;
	}
	public void setStudent(Student student) {
		this.student = student;
	}
	
}
