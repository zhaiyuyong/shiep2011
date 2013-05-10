package com.zyy.javaee.project.service;
import java.util.List;

import com.zyy.javaee.project.exception.StudentException;
import com.zyy.javaee.project.po.*;
public interface MessageManager {

	//�����ҳ���Ƶ�ÿҳ��ʾ�ļ�¼��Ŀ
	int STUDENT_PAGE_SIZE=10;
	/**
	 * �г����е�Message
	 * @return
	 * @throws StudentException
	 */
	public List<Message> getAllMessages(Integer pageNo)throws StudentException;
	/**
	 * ����һ��Message
	 * @param message
	 * @throws StudentException
	 */
	public void addMessage(Message message)throws StudentException;
	/**
	 * ɾ��һ��Message
	 * @param id
	 * @throws StudentException
	 */
	public void deleteMessage(Integer id)throws StudentException;
	/**
	 * ��������Message��������Ŀ
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
