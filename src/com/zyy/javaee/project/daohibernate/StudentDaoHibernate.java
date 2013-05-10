package com.zyy.javaee.project.daohibernate;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.orm.hibernate3.HibernateTemplate;
import org.springframework.stereotype.Component;

import com.zyy.javaee.project.dao.StudentDao;
import com.zyy.javaee.project.po.Student;
@Component("studentDao")
public class StudentDaoHibernate implements StudentDao{
	private HibernateTemplate hibernateTemplate;

	public HibernateTemplate getHibernateTemplate() {
		return hibernateTemplate;
	}
	@Resource(name="hibernateTemplate")
	public void setHibernateTemplate(HibernateTemplate hibernateTemplate) {
		this.hibernateTemplate = hibernateTemplate;
	}

	public boolean chaeckUserExistsWithName(String name) {
		// TODO Auto-generated method stub
		return false;
	}

	public void delete(int id) {
		hibernateTemplate.delete(getStudent(id));
		
	}

	public void delete(Student student) {
		hibernateTemplate.delete(student);
		
	}

	public List<Student> findByName(String name) {
		return (List<Student>)hibernateTemplate.find("from Student s where s.stuName = '"+name+"'");
	}

	public Student getStudent(Integer id) {
		return (Student) hibernateTemplate.load(Student.class, id);
	}

	public List<Student> getUsers() {
		return (List<Student>)hibernateTemplate.find("from Student student");
	
	}

	public Integer save(Student student) {
		return (Integer)hibernateTemplate.save(student);
	}

	public void update(Student student) {
		hibernateTemplate.update(student);
	}
	public List<Student> findAllByPage(Integer pageNo, Integer pageSize) {
		Integer offset = (pageNo-1)*pageSize;
		//hibernateTemplate µœ÷∑÷“≥
		return (List<Student>)hibernateTemplate.findByExample(new Student(), offset, pageSize);
	}
	public long findCount() {
		List studentList = hibernateTemplate.find("select count(s.id) from Student as s");
		if(studentList ==null){
			return 0;
		}
		return  (Long) studentList.get(0);
	}
	public List<Student> findStudentByNo(String stuno) {
		return (List<Student>)hibernateTemplate.find("from Student s where s.stuNo = '"+stuno+"'");
	}

	
}
