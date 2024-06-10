package com.example.demo2.Controller;

import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo2.Entity.EmployeeEntity;
import com.example.demo2.Entity.EmployerEntity;
import com.example.demo2.Service.EmployerService;


@RestController
public class EmployerController {
	
	@Autowired
	private EmployerService employerService;
	
	
//	Posting the employer data into service
	
	@PostMapping("/saveemployerintodabase")
	
	public EmployerEntity saveEmployerIntoService(@RequestBody EmployerEntity employer) {
		
		return employerService.saveEmployerIntoRepository(employer);
	}
	
	
	

//	Getting the employer data from service
	
	@GetMapping("/fetchemployeesfromdatabase/{id}")
	
	public List<EmployeeEntity> getEmpByIdFromService(@PathVariable("id") Integer emprid){

		return employerService.getEmpByIdFromRepository(emprid);
	}
	
	
	
	
	
	
//		@GetMapping("/getallemployees")
//	
//		public List<EmployeeEntity> getEmpByIdFromService(){
//			return employerService.getEmpFromRepository();
//		}

}
	

