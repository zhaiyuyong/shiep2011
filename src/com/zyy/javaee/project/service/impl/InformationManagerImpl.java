package com.zyy.javaee.project.service.impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Component;

import com.zyy.javaee.project.dao.InformationDao;
import com.zyy.javaee.project.dao.ManagerDao;
import com.zyy.javaee.project.exception.StudentException;
import com.zyy.javaee.project.po.Information;
import com.zyy.javaee.project.po.Manager;
import com.zyy.javaee.project.service.InformationManager;
@Component("informationManager")
public class InformationManagerImpl implements InformationManager{
	private ManagerDao managerDao;
	public ManagerDao getManagerDao() {
		return managerDao;
	}
	@Resource(name="managerDao")
	public void setManagerDao(ManagerDao managerDao) {
		this.managerDao = managerDao;
	}
	private InformationDao informationDao;
	public InformationDao getInformationDao() {
		return informationDao;
	}
	@Resource(name="informationDao")
	public void setInformationDao(InformationDao informationDao) {
		this.informationDao = informationDao;
	}
	public List<Information> findAllByPage(Integer pageNo)
			throws StudentException {
		return this.informationDao.findAllByPage(pageNo, STUDENT_PAGE_SIZE);
	}
	public void addInformation(Information information)throws StudentException{
		this.informationDao.save(information);
	}
	public Manager getManager(Integer id) throws StudentException {
		return this.managerDao.getManagerById(id);
	}
	public List<Information> getAll() throws StudentException {
		return this.informationDao.findAll();
	}
	public void deleteInformation(Integer id) throws StudentException {
		this.informationDao.delete(id);	
	}
	public Information getInformation(Integer id) throws StudentException {
		return this.informationDao.get(id);
	}
	public void updateInformation(Information information)
			throws StudentException {
		this.informationDao.update(information);	
	}
	public List<Information> getInfoBySize(int size) throws StudentException {
		return this.informationDao.findAllBySize(size);
	}
	public long findAllCount() throws StudentException {
		return this.informationDao.findCount();
	}

}
