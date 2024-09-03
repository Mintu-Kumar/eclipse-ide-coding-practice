package com.spring.orm.springorm.dao;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.orm.hibernate5.HibernateTemplate;

import com.spring.orm.springorm.entities.Student;

public class StudentDao {
	
	private HibernateTemplate hibernateTemplate; 
	
	//save student
	@Transactional
	public int insert(Student student) {
	
		Integer i = (Integer)hibernateTemplate.save(student);
		return i;
	}
	
	// get single record from table
	public Student  getStudent(int studentId) {
		Student student = this.hibernateTemplate.get(Student.class, studentId);
		return student;
	}
	
	// get multiple row
	public List<Student> getStudents(){
		List<Student> student = this.hibernateTemplate.loadAll(Student.class);
		return student;
	}
	
	// delete the record
	
	public void deleteRecord(int studentId) {
		Student student =  this.hibernateTemplate.get(Student.class, studentId);
		this.hibernateTemplate.delete(student);
		
	}
	
	//update record
	
	public void updateRecord(Student student) {
		this.hibernateTemplate.update(student);
	}

	public HibernateTemplate getHibernateTemplate() {
		return hibernateTemplate;
	}

	public void setHibernateTemplate(HibernateTemplate hibernateTemplate) {
		this.hibernateTemplate = hibernateTemplate;
	}
	

}
