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
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name="t_message")
public class Message implements Serializable{

	private String content;
	private Integer flag;
	private Integer id;
	private Student student;
	private Set<RepMessage> repmessages = new HashSet<RepMessage>();
	@OneToMany(mappedBy="message",cascade={CascadeType.ALL})
	public Set<RepMessage> getRepmessages() {
		return repmessages;
	}
	public void setRepmessages(Set<RepMessage> repmessages) {
		this.repmessages = repmessages;
	}
	private String title;
	private Date shijian;
	public Date getShijian() {
		return shijian;
	}
	public void setShijian(Date shijian) {
		this.shijian = shijian;
	}
	@Column(name="CONTENT",length=300)
	public String getContent() {
		return content;
	}
	@Column(name="FLAG")
	public Integer getFlag() {
		return flag;
	}
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="ID",unique=true,nullable=false)
	public Integer getId() {
		return id;
	}
	@ManyToOne(fetch=FetchType.LAZY)//(cascade={CascadeType.ALL})
	@JoinColumn(name="STUDENT_ID")
	public Student getStudent() {
		return student;
	}
	@Column(name="TITLE",length=50)
	public String getTitle() {
		return title;
	}
	public void setContent(String content) {
		this.content = content;
	}
	public void setFlag(Integer flag) {
		this.flag = flag;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public void setStudent(Student student) {
		this.student = student;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	
}
