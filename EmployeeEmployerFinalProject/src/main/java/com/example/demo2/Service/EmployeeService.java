package com.example.demo2.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;
import com.example.demo2.Entity.EmployeeEntity;
import com.example.demo2.Repository.EmployeeRepository;

@Service
public class EmployeeService {
	
	@Autowired
	private EmployeeRepository employeeRepository;
	
	
	
//	Getting Employee Data from Repository
	
	public List<EmployeeEntity> getallFromRepository(){

		List<EmployeeEntity> emp = employeeRepository.findAll();
		if (emp.isEmpty()) {
			throw new DatabaseIsEmpty("Database is empty");
		}
		return emp;
		
	}
	
	
	
	
//	Getting Employee Data from Repository by Employee_Id
	
	public EmployeeEntity getByIdFromRepository(@PathVariable("empid") int employee) {
		return employeeRepository.findById(employee).get();
		
	}
	
	
	
	
//	Posting Employee Data Into Repository
	
	public EmployeeEntity saveEmployeeIntoRepository(EmployeeEntity employee) {
		
		if (!employee.getName().matches("^[a-zA-Z]*$")) {
			throw new InvalidEmployeeName(employee.getName()+" is a Invalid Name");
		}
		
		employeeRepository.save(employee);
		return employee;
	}

}
