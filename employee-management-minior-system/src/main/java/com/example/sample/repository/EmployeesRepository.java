package com.example.sample.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.sample.entity.Employees1;

public interface EmployeesRepository extends JpaRepository<Employees1, Long> {

}
