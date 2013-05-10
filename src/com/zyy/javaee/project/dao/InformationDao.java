package com.zyy.javaee.project.dao;

import java.util.List;

import com.zyy.javaee.project.po.Information;

public interface InformationDao {
	/**
	 * 
	 * @param information
	 * @return
	 */
	public Integer save(Information information);
	/**
	 * 
	 * @param id
	 * @return
	 */
	public Information get(Integer id);
	/**
	 * 
	 * @param id
	 */
	public void delete(Integer id);
	/**
	 * 
	 * @param information
	 */
	public void delete(Information information);
	/**
	 * 
	 * @param information
	 */
	public void update(Information information);
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
	public  List<Information> findAllByPage(Integer pageNo,Integer pageSize);
	/**
	 * 
	 * @return
	 */
	public List<Information> findAll();
	
	public List<Information> findAllBySize(int size);
}
