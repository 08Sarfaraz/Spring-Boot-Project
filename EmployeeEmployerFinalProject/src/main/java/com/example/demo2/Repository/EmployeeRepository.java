package com.example.demo2.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo2.Entity.EmployeeEntity;

public interface EmployeeRepository extends JpaRepository<EmployeeEntity,Integer>{

}
