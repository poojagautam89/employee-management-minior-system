package com.example.sample.service;

import java.util.List;

import org.springframework.data.domain.Page;

import com.example.sample.entity.Employees1;

public interface EmployeeService {
	public List<Employees1> getAllEmployees();

	public Employees1 addEmployee(Employees1 employee);

	public void deleteEmployeeById(Long id);

	public Employees1 updateEmployeesById(Employees1 employee);

	public Employees1 getEmployeeById(Long id);

	public Page<Employees1>findEmployeeWithPagination(int offset, int pageSize);

}
