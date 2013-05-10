package com.zyy.javaee.project.po;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
@Entity
@Table(name="t_manager")
public class Manager implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private Integer id;
	private String name;
	private String password;
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="ID",unique=true,nullable=false)
	public Integer getId() {
		return id;
	}
	public Manager(Integer id) {
		super();
		this.id = id;
	}
	public Manager() {
		super();
	}
	public void setId(Integer id) {
		this.id = id;
	}
	@Column(name="NAME",length=30)
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	@Column(name="PASSWORD",length=30)
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
}
