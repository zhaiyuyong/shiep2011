package com.zyy.javaee.project.vo;

public class MessageForm {

	private String content;
	
	private Integer id;
	private String title;
	public String getContent() {
		return content;
	}
	
	public Integer getId() {
		return id;
	}
	public String getTitle() {
		return title;
	}
	public void setContent(String content) {
		this.content = content;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	
}
