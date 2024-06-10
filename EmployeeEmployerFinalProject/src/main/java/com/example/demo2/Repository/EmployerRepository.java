package com.example.demo2.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo2.Entity.EmployerEntity;

public interface EmployerRepository extends JpaRepository<EmployerEntity,Integer>{

}
