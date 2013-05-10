package com.zyy.javaee.project.daohibernate;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.orm.hibernate3.HibernateTemplate;
import org.springframework.stereotype.Component;

import com.zyy.javaee.project.dao.ManagerDao;
import com.zyy.javaee.project.po.Manager;
@Component("managerDao")
public class ManagerDaoHibernate implements ManagerDao{

	private HibernateTemplate hibernateTemplate;

	public HibernateTemplate getHibernateTemplate() {
		return hibernateTemplate;
	}
	@Resource(name="hibernateTemplate")
	public void setHibernateTemplate(HibernateTemplate hibernateTemplate) {
		this.hibernateTemplate = hibernateTemplate;
	}
	public Manager findByNo(String no) {
		return (Manager)hibernateTemplate.find("from Manager m where m.name = '"+no+"'").get(0);
	}
	public Manager getManagerById(Integer id) {
		return  (Manager) hibernateTemplate.load(Manager.class, id);
	}

}
