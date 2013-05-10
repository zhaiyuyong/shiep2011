package com.zyy.javaee.project.service;

import java.util.List;

import com.zyy.javaee.project.exception.StudentException;
import com.zyy.javaee.project.po.Student;

public interface StudentManager {
	
	//�����ҳ���Ƶ�ÿҳ��ʾ�ļ�¼��Ŀ
	int STUDENT_PAGE_SIZE=10;
	/**
	 * ����һ��ѧ��
	 * @param student
	 * @return
	 * @throws StudentException
	 */
	public Integer addStudent(Student student) throws StudentException;
	/**
	 * ����idɾ��һ��ѧ��
	 * @param id
	 * @throws StudentException
	 */
	public void deleteStudent(Integer id)throws StudentException;
	/**
	 * ����idȡһ��ѧ��
	 * @param id
	 * @return
	 * @throws StudentException
	 */
	public Student getStudent(Integer id)throws StudentException;
	/**
	 * ��������ȡ��ѧ��
	 * @param name
	 * @return
	 * @throws StudentException
	 */
	public List<Student> getStudent(String name)throws StudentException;
	/**
	 * ����Ա��½
	 * @param user
	 * @param pass
	 * @return
	 * @throws StudentException
	 */
	public int managerLogin(String user,String pass)throws StudentException;
	/**
	 * ȡ���е�ѧ��
	 * @return
	 * @throws StudentException
	 */
	public List<Student> getAllStudent()throws StudentException;
	/**
	 * �޸�ѧ��
	 * @param student
	 * @throws StudentException
	 */
	public void updateStudent(Student student) throws StudentException;
	
	/**
	 * ѧ����½
	 * @param username
	 * @param password
	 * @return
	 * @throws StudentException
	 */
	public int studentLogin(String username,String password)throws StudentException;
	
}
