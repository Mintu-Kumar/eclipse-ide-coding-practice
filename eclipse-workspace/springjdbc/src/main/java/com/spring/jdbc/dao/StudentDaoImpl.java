package com.spring.jdbc.dao;

import org.springframework.jdbc.core.RowMapper;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;

import com.spring.jdbc.entities.Student;

public class StudentDaoImpl implements StudentDao {

	@Autowired
	private JdbcTemplate jdbcTemplate;
	
	public int insert(Student student) {
		// TODO Auto-generated method stub
		String query = "insert into student(id,name,city) value(?,?,?)";
		
		int r = jdbcTemplate.update(query, student.getId(),student.getName(),student.getCity());
		return r;
	}
	
	public int change(Student student) {
		String query = "update student set name=? ,city=? where id=?";
		
		int r = jdbcTemplate.update(query, student.getName(),student.getCity(),student.getId());
		return r;
	}
	
	// for single result fetch use queryForObject()
	  public Student getStudent(int studentId) 
	  { 
		  RowMapper<Student> rowMapper = new
		  RowMapperImpl(); 
		  String query = "select * from student where id=?"; 
		  Student student1 =this.jdbcTemplate.queryForObject(query, rowMapper,studentId); return
	      student1; 
		  
	  }
	 
	  
	  // this the ananonymous class concept  see line 43 second argument
	
	/*
	 * public Student getStudent(int studentId) { RowMapper<Student> rowMapper = new
	 * RowMapperImpl(); String query = "select * from student where id=?"; Student
	 * student1 =jdbcTemplate.queryForObject(query, new RowMapper() {
	 * 
	 * public Object mapRow(ResultSet rs, int rowNum) throws SQLException { Student
	 * student = new Student();
	 * 
	 * student.setId(rs.getInt(1)); student.setName(rs.getString(2));
	 * student.setCity(rs.getString(3));
	 * 
	 * return student; }
	 * 
	 * 
	 * },studentId); return student1; }
	 */
	  
	  
	  //// for single result fetch use query()
	  public List<Student> getAllStudents() {
			
		  String query = "select * from student";
		  List<Student> student = this.jdbcTemplate.query(query, new RowMapperImpl());
			return student;
		}
	
	public JdbcTemplate getJdbcTemplate() {
		return jdbcTemplate;
	}
	public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
		this.jdbcTemplate = jdbcTemplate;
	}

	

	


	 

}
