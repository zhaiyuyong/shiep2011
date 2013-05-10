package com.zyy.javaee.project.service.impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Component;

import com.zyy.javaee.project.dao.ManagerDao;
import com.zyy.javaee.project.dao.StudentDao;
import com.zyy.javaee.project.exception.StudentException;
import com.zyy.javaee.project.po.Manager;
import com.zyy.javaee.project.po.Student;
import com.zyy.javaee.project.service.StudentManager;
@Component("studentManager")
public class StudentManagerImpl implements StudentManager{
	
	private StudentDao studentDao;
	private ManagerDao managerDao;

	public ManagerDao getManagerDao() {
		return managerDao;
	}
	@Resource(name="managerDao")
	public void setManagerDao(ManagerDao managerDao) {
		this.managerDao = managerDao;
	}
	public StudentManagerImpl() {
		System.out.println("StudentManagerImpl 初始化开始........");
	}
	public StudentDao getStudentDao() {
		return studentDao;
	}
	@Resource(name="studentDao")
	public void setStudentDao(StudentDao studentDao) {
		this.studentDao = studentDao;
	}

	public Integer addStudent(Student student) throws StudentException {
		Integer id=studentDao.save(student);
		return id;
	}

	public void deleteStudent(Integer id) throws StudentException {
		studentDao.delete(id);	
	}

	public Student getStudent(Integer id) throws StudentException {
		return (Student)studentDao.getStudent(id);
	}
	public List<Student> getStudent(String name) throws StudentException {
		return (List<Student>)studentDao.findByName(name);
	}
	public int managerLogin(String user, String pass) throws StudentException {
		Manager manager = managerDao.findByNo(user);
		if(manager!=null&&manager.getPassword().equals(pass)){
			return manager.getId();
		}
		return -1;
	}
	public List<Student> getAllStudent() throws StudentException {
		return studentDao.getUsers();
	}
	public void updateStudent(Student student) throws StudentException {
		this.studentDao.update(student);
		
	}
	public int studentLogin(String username, String password)
			throws StudentException {
		Student student = this.studentDao.findStudentByNo(username).get(0);
		if(student!=null&&student.getPassword().equals(password)){
			return student.getId();
		}
		return -1;
	}

}
