package com.zyy.javaee.project.service.impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Component;

import com.zyy.javaee.project.dao.ManagerDao;
import com.zyy.javaee.project.dao.MessageDao;
import com.zyy.javaee.project.dao.RepMessageDao;
import com.zyy.javaee.project.dao.StudentDao;
import com.zyy.javaee.project.exception.StudentException;
import com.zyy.javaee.project.po.Manager;
import com.zyy.javaee.project.po.Message;
import com.zyy.javaee.project.po.RepMessage;
import com.zyy.javaee.project.po.Student;
import com.zyy.javaee.project.service.MessageManager;
@Component("messageManager")
public class MessageManagerImpl implements MessageManager{
	
	private MessageDao messageDao;
	private StudentDao studentDao;
	private RepMessageDao repmessageDao;
	private ManagerDao managerDao;
	public ManagerDao getManagerDao() {
		return managerDao;
	}
	@Resource(name="managerDao")
	public void setManagerDao(ManagerDao managerDao) {
		this.managerDao = managerDao;
	}
	public RepMessageDao getRepmessageDao() {
		return repmessageDao;
	}
	@Resource(name="repmessageDao")
	public void setRepmessageDao(RepMessageDao repmessageDao) {
		this.repmessageDao = repmessageDao;
	}
	public MessageDao getMessageDao() {
		return messageDao;
	}
	//Spring×¢ÈëmessageDao
	@Resource(name="messageDao")
	public void setMessageDao(MessageDao messageDao) {
		this.messageDao = messageDao;
	}
	
	
	
	

	public StudentDao getStudentDao() {
		return studentDao;
	}
	@Resource(name="studentDao")
	public void setStudentDao(StudentDao studentDao) {
		this.studentDao = studentDao;
	}
	public void addMessage(Message message) throws StudentException {
		this.messageDao.save(message);	
	}

	public void deleteMessage(Integer id) throws StudentException {
		this.messageDao.delete(id);
	}

	public List<Message> getAllMessages(Integer pageNo) throws StudentException {
		return this.messageDao.findAllByPage(pageNo, STUDENT_PAGE_SIZE);
	}
	public long findAllCount() throws StudentException {
		return this.messageDao.findCount();
	}
	public Student getStudent(Integer id) throws StudentException {
		return this.studentDao.getStudent(id);
	}
	public List<Message> getMessageByStuId(Integer id) throws StudentException {
		return this.messageDao.findMessageByStuid(id);
	}
	public List<Message> getMessageByFlag(Integer flage)
			throws StudentException {
		return this.messageDao.findMessageByFlag(flage);
	}
	public List<RepMessage> getRepMessageByMesId(Integer id)
			throws StudentException {
		return this.repmessageDao.getRepmessagesByMessId(id);
	}
	public void addRepMessage(RepMessage repmessage) throws StudentException {
		this.repmessageDao.saveRepMessage(repmessage);	
	}
	public Message getMessageById(Integer id) throws StudentException {
		return this.messageDao.get(id);
	}
	public Manager getManagerById(Integer id) throws StudentException {
		return this.managerDao.getManagerById(id);
	}
	public void updateMessage(Message message) throws StudentException {
		this.messageDao.update(message);
		
	}
	
	
	

}
