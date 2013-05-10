package com.zyy.javaee.project.service;

import java.util.List;

import com.zyy.javaee.project.exception.StudentException;
import com.zyy.javaee.project.po.Information;
import com.zyy.javaee.project.po.Manager;

public interface InformationManager {

	//�����ҳ���Ƶ�ÿҳ��ʾ�ļ�¼��Ŀ
	int STUDENT_PAGE_SIZE=10;
	/**
	 * ����ҳ��������������Ϣ
	 * @param pageNo
	 * @return
	 * @throws StudentException
	 */
	public List<Information> findAllByPage(Integer pageNo) throws StudentException;
	/**
	 * ����һ��information
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
	 * �������е�information
	 * @return
	 * @throws StudentException
	 */
	public List<Information> getAll()throws StudentException;
	/**
	 * ����id��ɾ��һ��information
	 * @param id
	 * @throws StudentException
	 */
	public void deleteInformation(Integer id)throws StudentException;
	/**
	 * ����id������һ��information
	 * @param id
	 * @return
	 * @throws StudentException
	 */
	public Information getInformation(Integer id) throws StudentException;
	/**
	 * �޸�һ��information
	 * @param information
	 * @throws StudentException
	 */
	public void updateInformation(Information information)throws StudentException;
	/**
	 * ��ҳ��Ҫ��
	 * ���ǰ5��information
	 * @param size
	 * @return
	 * @throws StudentException
	 */
	public List<Information> getInfoBySize(int size) throws StudentException;
	/**
	 * ��������information��������
	 * @return
	 * @throws StudentException
	 */
	public long findAllCount() throws StudentException;
}
