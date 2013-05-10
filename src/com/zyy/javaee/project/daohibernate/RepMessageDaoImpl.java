package com.zyy.javaee.project.daohibernate;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.orm.hibernate3.HibernateTemplate;
import org.springframework.stereotype.Component;

import com.zyy.javaee.project.dao.RepMessageDao;
import com.zyy.javaee.project.po.RepMessage;
@Component("repmessageDao")
public class RepMessageDaoImpl implements RepMessageDao{

	private HibernateTemplate hibernateTemplate;

	public HibernateTemplate getHibernateTemplate() {
		return hibernateTemplate;
	}
	@Resource(name="hibernateTemplate")
	public void setHibernateTemplate(HibernateTemplate hibernateTemplate) {
		this.hibernateTemplate = hibernateTemplate;
	}
	
	public List<RepMessage> getRepmessagesByMessId(Integer id) {
		return (List<RepMessage>)this.hibernateTemplate.find("from RepMessage as rm where rm.message.id='"+id+"'");
	}

	public void saveRepMessage(RepMessage repmessage) {
		this.hibernateTemplate.save(repmessage);
		
	}

}
