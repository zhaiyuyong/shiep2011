package com.zyy.javaee.project.dao;

import java.util.List;

import org.springframework.stereotype.Component;

import com.zyy.javaee.project.po.Message;
@Component("messageDao")
public interface MessageDao {
	/**
	 * 
	 * @param message
	 * @return
	 */
	public Integer save(Message message);
	/**
	 * 
	 * @param id
	 * @return
	 */
	public Message get(Integer id);
	/**
	 * 
	 * @param id
	 */
	public void delete(Integer id);
	/**
	 * 
	 * @param message
	 */
	public void delete(Message message);
	/**
	 * 
	 * @param message
	 */
	public void update(Message message);
	/**
	 * 
	 * @return
	 */
	public long findCount();
	/**
	 * 
	 * @param pageNo
	 * @param pageSize
	 * @return
	 */
	public  List<Message> findAllByPage(Integer pageNo,Integer pageSize);
	/**
	 * 
	 * @param id
	 * @return
	 */
	public List<Message> findMessageByStuid(Integer id);
	/**
	 * 
	 * @param id
	 * @return
	 */
	public List<Message> findMessageByFlag(Integer id);
	
}
