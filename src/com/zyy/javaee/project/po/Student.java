package com.zyy.javaee.project.po;

import java.io.Serializable;
import java.util.Date;
import java.util.HashSet;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
@Entity
@Table(name="t_student")
public class Student implements Serializable{

	private String address;
	private Date birth;
	private String classNo;
	private String dept;
	private String email;
	private Integer id;
	//private Set<Information> informations = new HashSet<Information>();
	private Set<Message> messages = new HashSet<Message>();
	private String password;
	private String sex;
	private String stuName;
	private String stuNo;
	@Column(name="ADDRESS",length=50)
	public String getAddress() {
		return address;
	}
	@Column(name="BIRTH")
	public Date getBirth() {
		return birth;
	}
	@Column(name="CLASSNO" ,length=7)
	public String getClassNo() {
		return classNo;
	}
	@Column(name="DEPT",length=30)
	public String getDept() {
		return dept;
	}
	@Column(name="EMAIL",length=50)
	public String getEmail() {
		return email;
	}
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="ID",unique=true,nullable=false)
	public Integer getId() {
		return id;
	}/*
	@OneToMany(mappedBy="student",fetch=FetchType.LAZY)
	//@LazyCollection(LazyCollectionOption.FALSE)
	public Set<Information> getInformations() {
		return informations;
	}*/
	@OneToMany(mappedBy="student",cascade={CascadeType.ALL})
	//@LazyCollection(LazyCollectionOption.FALSE)
	
	public Set<Message> getMessages() {
		return messages;
	}
	
	@Column(name="PASSWORD",length=30)
	public String getPassword() {
		return password;
	}
	@Column(name="SEX",length=2)
	public String getSex() {
		return sex;
	}
	@Column(name="STUNAME",length=20)
	public String getStuName() {
		return stuName;
	}
	@Column(name="STUNO",length=8)
	public String getStuNo() {
		return stuNo;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	
	public void setBirth(Date birth) {
		this.birth = birth;
	}
	public void setClassNo(String classNo) {
		this.classNo = classNo;
	}
	public void setDept(String dept) {
		this.dept = dept;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	/*
	public void setInformations(Set<Information> informations) {
		this.informations = informations;
	}*/
	public void setMessages(Set<Message> messages) {
		this.messages = messages;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public void setSex(String sex) {
		this.sex = sex;
	}
	public void setStuName(String stuName) {
		this.stuName = stuName;
	}
	public void setStuNo(String stuNo) {
		this.stuNo = stuNo;
	}
	
}
