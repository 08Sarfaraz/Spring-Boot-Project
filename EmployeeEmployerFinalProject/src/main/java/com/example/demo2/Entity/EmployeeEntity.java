package com.example.demo2.Entity;



import com.fasterxml.jackson.annotation.JsonBackReference;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;

@Entity
public class EmployeeEntity {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int Employee_Id;
	
	private String name;
	private int age;
	private String position;
	
	@ManyToOne
	@JoinColumn(name = "employer_id")
	
	private EmployerEntity employer;

	public EmployeeEntity() {
		super();
	}

	public EmployeeEntity(int employee_Id, String name, int age, String position, EmployerEntity employer) {
		super();
		Employee_Id = employee_Id;
		this.name = name;
		this.age = age;
		this.position = position;
		this.employer = employer;
	}

	public int getEmployee_Id() {
		return Employee_Id;
	}

	public void setEmployee_Id(int employee_Id) {
		Employee_Id = employee_Id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getPosition() {
		return position;
	}

	public void setPosition(String position) {
		this.position = position;
	}


	public EmployerEntity getEmployer() {
		return employer;
	}

	public void setEmployer(EmployerEntity employer) {
		this.employer = employer;
	}

	@Override
	public String toString() {
		return "EmployeeEntity [Employee_Id=" + Employee_Id + ", name=" + name + ", age=" + age + ", position="
				+ position + ", employer=" + employer + "]";
	}


}
