package com.zyy.javaee.project.dao;

import java.util.List;

import com.zyy.javaee.project.po.Student;

public interface StudentDao {

	/**
	 * 持久化指定的Student实例
	 * @param student 需要被持久化的Atudent实例
	 * @return Student实例被持久化后的标志属性值
	 */
	public Integer save(Student student);
	/**
	 * 
	 * @param name
	 * @return
	 */
	public boolean chaeckUserExistsWithName(String name);
	/**
	 * 查询全部的Student实例
	 * @return 数据库中的全部的Student实例
	 */
	public List<Student> getUsers();
	/**
	 * 根据标志属性删除Student实例
	 * @param id 需要被删除的Student实例的标志属性值
	 */
	public void delete(int id);
	/**
	 * 删除指定的Student实例
	 * @param student 需要被删除的Student实例
	 */
	public void delete(Student student);
	/**
	 * 修改指定的Student实例
	 * @param student 需要被修改的Student实例
	 */
	public void update(Student student);
	/**
	 * 
	 * @param name
	 * @return
	 */
	public List<Student>  findByName(String name);
	/**
	 * 根据标志属性来加载Student实例
	 * @param id需要加载的Student实例的标志属性
	 * @return 指定标志属性对应的Student实例
	 */
	public Student getStudent(Integer id);
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
	public  List<Student> findAllByPage(Integer pageNo,Integer pageSize);
	/**
	 * 
	 * @param stuno
	 * @return
	 */
	public List<Student> findStudentByNo(String stuno);
	
}
