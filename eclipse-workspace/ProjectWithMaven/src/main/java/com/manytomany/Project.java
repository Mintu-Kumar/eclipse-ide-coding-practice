package com.manytomany;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToMany;

@Entity
public class Project {
	

	@Id
	private int pId;
	private String pName;
	
	@ManyToMany(mappedBy = "project")
	private List<Employee> employee;

	public Project() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Project(int pId, String pName, List<Employee> employee) {
		super();
		this.pId = pId;
		this.pName = pName;
		this.employee = employee;
	}

	public int getpId() {
		return pId;
	}

	public void setpId(int pId) {
		this.pId = pId;
	}

	public String getpName() {
		return pName;
	}

	public void setpName(String pName) {
		this.pName = pName;
	}

	public List<Employee> getEmployee() {
		return employee;
	}

	public void setEmployee(List<Employee> employee) {
		this.employee = employee;
	}
	
	

}
