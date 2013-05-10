package com.zyy.javaee.project.service;

import java.util.List;

import com.zyy.javaee.project.exception.StudentException;
import com.zyy.javaee.project.po.Information;
import com.zyy.javaee.project.po.Manager;

public interface InformationManager {

	//定义分页控制的每页显示的记录数目
	int STUDENT_PAGE_SIZE=10;
	/**
	 * 根据页号来查找所有信息
	 * @param pageNo
	 * @return
	 * @throws StudentException
	 */
	public List<Information> findAllByPage(Integer pageNo) throws StudentException;
	/**
	 * 增加一条information
	 * @param information
	 * @throws StudentException
	 */
	public void addInformation(Information information)throws StudentException;
	/**
	 * 
	 * @param id
	 * @return
	 * @throws StudentException
	 */
	public Manager getManager(Integer id)throws StudentException;
	/**
	 * 查找所有的information
	 * @return
	 * @throws StudentException
	 */
	public List<Information> getAll()throws StudentException;
	/**
	 * 根据id来删除一条information
	 * @param id
	 * @throws StudentException
	 */
	public void deleteInformation(Integer id)throws StudentException;
	/**
	 * 根据id来查找一条information
	 * @param id
	 * @return
	 * @throws StudentException
	 */
	public Information getInformation(Integer id) throws StudentException;
	/**
	 * 修改一条information
	 * @param information
	 * @throws StudentException
	 */
	public void updateInformation(Information information)throws StudentException;
	/**
	 * 首页需要用
	 * 查出前5条information
	 * @param size
	 * @return
	 * @throws StudentException
	 */
	public List<Information> getInfoBySize(int size) throws StudentException;
	/**
	 * 查找所有information的总条数
	 * @return
	 * @throws StudentException
	 */
	public long findAllCount() throws StudentException;
}
