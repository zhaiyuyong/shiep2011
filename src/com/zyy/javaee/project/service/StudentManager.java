package com.zyy.javaee.project.service;

import java.util.List;

import com.zyy.javaee.project.exception.StudentException;
import com.zyy.javaee.project.po.Student;

public interface StudentManager {
	
	//定义分页控制的每页显示的记录数目
	int STUDENT_PAGE_SIZE=10;
	/**
	 * 增加一个学生
	 * @param student
	 * @return
	 * @throws StudentException
	 */
	public Integer addStudent(Student student) throws StudentException;
	/**
	 * 根据id删除一个学生
	 * @param id
	 * @throws StudentException
	 */
	public void deleteStudent(Integer id)throws StudentException;
	/**
	 * 根据id取一个学生
	 * @param id
	 * @return
	 * @throws StudentException
	 */
	public Student getStudent(Integer id)throws StudentException;
	/**
	 * 根据名字取得学生
	 * @param name
	 * @return
	 * @throws StudentException
	 */
	public List<Student> getStudent(String name)throws StudentException;
	/**
	 * 管理员登陆
	 * @param user
	 * @param pass
	 * @return
	 * @throws StudentException
	 */
	public int managerLogin(String user,String pass)throws StudentException;
	/**
	 * 取所有的学生
	 * @return
	 * @throws StudentException
	 */
	public List<Student> getAllStudent()throws StudentException;
	/**
	 * 修改学生
	 * @param student
	 * @throws StudentException
	 */
	public void updateStudent(Student student) throws StudentException;
	
	/**
	 * 学生登陆
	 * @param username
	 * @param password
	 * @return
	 * @throws StudentException
	 */
	public int studentLogin(String username,String password)throws StudentException;
	
}
