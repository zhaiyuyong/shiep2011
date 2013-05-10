package com.zyy.javaee.project.service;
import java.util.List;

import com.zyy.javaee.project.exception.StudentException;
import com.zyy.javaee.project.po.*;
public interface MessageManager {

	//定义分页控制的每页显示的记录数目
	int STUDENT_PAGE_SIZE=10;
	/**
	 * 列出所有的Message
	 * @return
	 * @throws StudentException
	 */
	public List<Message> getAllMessages(Integer pageNo)throws StudentException;
	/**
	 * 增加一个Message
	 * @param message
	 * @throws StudentException
	 */
	public void addMessage(Message message)throws StudentException;
	/**
	 * 删除一条Message
	 * @param id
	 * @throws StudentException
	 */
	public void deleteMessage(Integer id)throws StudentException;
	/**
	 * 查找所有Message的总条数目
	 * @return
	 * @throws StudentException
	 */
	public long findAllCount() throws StudentException;
	/**
	 * 
	 * @param id
	 * @return
	 * @throws StudentException
	 */
	public Student getStudent(Integer id) throws StudentException;
	/**
	 * 
	 * @param id
	 * @return
	 * @throws StudentException
	 */
	public List<Message> getMessageByStuId(Integer id)throws StudentException;
	
	/**
	 * 
	 * @param flage
	 * @return
	 * @throws StudentException
	 */
	public List<Message> getMessageByFlag(Integer flage)throws StudentException;
	/**
	 * 
	 * @param id
	 * @return
	 * @throws StudentException
	 */
	public List<RepMessage> getRepMessageByMesId(Integer id)throws StudentException;
	
	/**
	 * 
	 * @param repmessage
	 * @throws StudentException
	 */
	public void addRepMessage(RepMessage repmessage) throws StudentException;
	/**
	 * 
	 * @param id
	 * @return
	 * @throws StudentException
	 */
	public Message getMessageById(Integer id)throws StudentException;
	/**
	 * 
	 * @param id
	 * @return
	 * @throws StudentException
	 */
	public Manager getManagerById(Integer id)throws StudentException;
	/**
	 * 
	 * @param message
	 * @throws StudentException
	 */
	public void updateMessage(Message message)throws StudentException;
	/**
	 * 
	 * @param message
	 * @throws StudentException
	 */
	
}
