package com.zyy.javaee.project.daohibernate;

import java.util.List;

import javax.annotation.Resource;

import org.junit.Test;
import org.springframework.orm.hibernate3.HibernateTemplate;
import org.springframework.stereotype.Component;

import com.zyy.javaee.project.dao.InformationDao;
import com.zyy.javaee.project.po.Information;
@Component("informationDao")
public class InformationDaoHibernate implements InformationDao{

	public InformationDaoHibernate() {
		System.out.println("InformationDaoHibernate 初始化开始........");
	}
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

	public void delete(Information information) {
		hibernateTemplate.delete(information);
	}

	@SuppressWarnings("unchecked")
	public List<Information> findAllByPage(Integer pageNo, Integer pageSize) {
		Integer offset = (pageNo-1)*pageSize;
		//hibernateTemplate实现分页
		return (List<Information>)hibernateTemplate.findByExample(new Information(), offset, pageSize);
	}

	public long findCount() {
		List informationList = hibernateTemplate.find("select count(i.id) from Information as i");
		if(informationList ==null){
			return 0;
		}
		return  (Long) informationList.get(0);
	}

	public Information get(Integer id) {
		return (Information) hibernateTemplate.load(Information.class, id);
	}

	public Integer save(Information information) {
		return (Integer) hibernateTemplate.save(information);
	}

	public void update(Information information) {
		hibernateTemplate.update(information);
	}
	public List<Information> findAll() {
		return (List<Information>)hibernateTemplate.find("from Information information");
	}
	public List<Information> findAllBySize(int size) {
		return (List<Information>)hibernateTemplate.findByExample(new Information(), 0, size);
	}
	

}
