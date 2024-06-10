package com.example.demo2.Service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import com.example.demo2.Entity.EmployeeEntity;
import com.example.demo2.Entity.EmployerEntity;
import com.example.demo2.Repository.EmployerRepository;

@Service
public class EmployerService {
	
	@Autowired
	private EmployerRepository employerRepository;
	
	
//	Posting the employer data from Repository
	
	public EmployerEntity saveEmployerIntoRepository(@RequestBody EmployerEntity employer) {
		employerRepository.save(employer);
		return employer;
	}

	
//	Getting the employer data from Repository by Id
	
	public List<EmployeeEntity> getEmpByIdFromRepository(Integer emprid){
		
		Optional<EmployerEntity> employer = employerRepository.findById(emprid);
		if(employerRepository.findAll().isEmpty()) {
			throw new TableIsEmpty("Table is Empty");
		}
		
		else if(employer.isEmpty()) {
			throw new UserNotFoundException(emprid + "This employee_Id is not found in table");
		}
		
		return employer.get().getEmployee();
	}

	
	
//	public List<EmployeeEntity> getEmpFromRepository(){
//		List<EmployerEntity> emp = employerRepository.findAll();
//		if(employerRepository.findAll().isEmpty()) {
//			throw new TableIsEmpty("Table is Empty");
//			
//		}
//		
//
//		return ((EmployerEntity) emp).getEmployee();
//	}
//	
}

