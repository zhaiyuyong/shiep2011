package com.zyy.javaee.project.dao;

import com.zyy.javaee.project.po.Manager;

public interface ManagerDao {
	/**
	 * 
	 * @param no
	 * @return
	 */
	public Manager findByNo(String no);
	
	public Manager getManagerById(Integer id);
}
