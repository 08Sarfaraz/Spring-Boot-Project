package com.example.demo2.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo2.Entity.EmployeeEntity;
import com.example.demo2.Service.EmployeeService;




@RestController()

public class EmployeeController {
	
	@Autowired
	private EmployeeService employeeService;
	
	
//	Getting Employee Data from Service
	
	@GetMapping("/fetchemployees")
	
	public List<EmployeeEntity> getEmployeesFromService(){
		
		return employeeService.getallFromRepository();
	}
	
	
//	Getting Employee Data from Service by Id
	
	@GetMapping("/fetchemplbyid/{empid}")
	
	public EmployeeEntity getByIdFromService(@PathVariable("empid") int empid) {
		
		return employeeService.getByIdFromRepository(empid);
	}
	
	
//	Posting Employee Data from Service
	
	@PostMapping("/postemployeeintodatabase")
	
	public EmployeeEntity saveEmployeeIntoService(@RequestBody EmployeeEntity employee) {
		
		return employeeService.saveEmployeeIntoRepository(employee);
	}
}
