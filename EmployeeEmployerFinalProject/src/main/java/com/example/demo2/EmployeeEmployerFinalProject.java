package com.example.demo2;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.example.demo2.Entity.EmployeeEntity;
import com.example.demo2.Entity.EmployerEntity;
import com.example.demo2.Repository.EmployeeRepository;
import com.example.demo2.Repository.EmployerRepository;

@SpringBootApplication
public class EmployeeEmployerFinalProject implements CommandLineRunner{

	@Autowired
	private EmployeeRepository employeeRepository;
	
	@Autowired
	private EmployerRepository employerRepository;
	
	public static void main(String[] args) {
		SpringApplication.run(EmployeeEmployerFinalProject.class, args);
	}

	
	public void run(String...strings ) throws Exception{
		EmployeeEntity emp = new EmployeeEntity();
		
		EmployerEntity empr = new EmployerEntity();
	}
}
