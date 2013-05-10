package com.zyy.javaee.project.daohibernate;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.orm.hibernate3.HibernateTemplate;
import org.springframework.stereotype.Component;

import com.zyy.javaee.project.dao.MessageDao;
import com.zyy.javaee.project.po.Message;
@Component("messageDao")
public class MessageDaoHibernate implements MessageDao{

	private HibernateTemplate hibernateTemplate;

	public HibernateTemplate getHibernateTemplate() {
		return hibernateTemplate;
	}
	@Resource(name="hibernateTemplate")
	public void setHibernateTemplate(HibernateTemplate hibernateTemplate) {
		this.hibernateTemplate = hibernateTemplate;
	}
	public void delete(Integer id) {
		hibernateTemplate.delete(get(id));
	}

	public void delete(Message message) {
		hibernateTemplate.delete(message);
	}

	public List<Message> findAllByPage(Integer pageNo, Integer pageSize) {
		Integer offset = (pageNo-1)*pageSize;
		//hibernateTemplate实现分页
		return (List<Message>)hibernateTemplate.findByExample(new Message(), offset, pageSize);
	}
	/**
	 * 查询Message的条数
	 */
	public long findCount() {
		List messageList = hibernateTemplate.find("select count(m.id) from Message as m");
		if(messageList ==null){
			return 0;
		}
		return  (Long) messageList.get(0);
	}

	public Message get(Integer id) {
		return (Message)hibernateTemplate.load(Message.class, id);
	}

	public Integer save(Message message) {
		return (Integer)hibernateTemplate.save(message);
	}

	public void update(Message message) {
		hibernateTemplate.update(message);
	}
	public List<Message> findMessageByStuid(Integer id) {
		return (List<Message>)this.hibernateTemplate.find("from Message as m where m.student.id='"+id+"'");
	}
	public List<Message> findMessageByFlag(Integer id) {
		return (List<Message>)this.hibernateTemplate.find("from Message as m where m.flag='"+id+"'");
	}

}
