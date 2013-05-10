package com.zyy.javaee.project.dao;

import java.util.List;

import com.zyy.javaee.project.po.Student;

public interface StudentDao {

	/**
	 * �־û�ָ����Studentʵ��
	 * @param student ��Ҫ���־û���Atudentʵ��
	 * @return Studentʵ�����־û���ı�־����ֵ
	 */
	public Integer save(Student student);
	/**
	 * 
	 * @param name
	 * @return
	 */
	public boolean chaeckUserExistsWithName(String name);
	/**
	 * ��ѯȫ����Studentʵ��
	 * @return ���ݿ��е�ȫ����Studentʵ��
	 */
	public List<Student> getUsers();
	/**
	 * ���ݱ�־����ɾ��Studentʵ��
	 * @param id ��Ҫ��ɾ����Studentʵ���ı�־����ֵ
	 */
	public void delete(int id);
	/**
	 * ɾ��ָ����Studentʵ��
	 * @param student ��Ҫ��ɾ����Studentʵ��
	 */
	public void delete(Student student);
	/**
	 * �޸�ָ����Studentʵ��
	 * @param student ��Ҫ���޸ĵ�Studentʵ��
	 */
	public void update(Student student);
	/**
	 * 
	 * @param name
	 * @return
	 */
	public List<Student>  findByName(String name);
	/**
	 * ���ݱ�־����������Studentʵ��
	 * @param id��Ҫ���ص�Studentʵ���ı�־����
	 * @return ָ����־���Զ�Ӧ��Studentʵ��
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
