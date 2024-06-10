package com.example.demo2.Entity;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnore;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;

@Entity
public class EmployerEntity {
	
	@Id
	private int Employer_id;
	
	private String employer_Name;
	private String location;
	
	@OneToMany(mappedBy = "employer")
	@JsonIgnore
	
	private List<EmployeeEntity> employee;

	public EmployerEntity() {
		super();
	}

	public EmployerEntity(int employer_id, String employer_Name, String location) {
		super();
		Employer_id = employer_id;
		this.employer_Name = employer_Name;
		this.location = location;
		
	}

	public int getEmployer_id() {
		return Employer_id;
	}

	public void setEmployer_id(int employer_id) {
		Employer_id = employer_id;
	}

	public String getEmployer_Name() {
		return employer_Name;
	}

	public void setEmployer_Name(String employer_Name) {
		this.employer_Name = employer_Name;
	}

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	public List<EmployeeEntity> getEmployee() {
		return employee;
	}

	public void setEmployee(List<EmployeeEntity> employee) {
		this.employee = employee;
	}

	@Override
	public String toString() {
		return "EmployerEntity [Employer_id=" + Employer_id + ", employer_Name=" + employer_Name + ", location="
				+ location + ", employee=" + employee + "]";
	}
	
	
	
	
	
	

}
