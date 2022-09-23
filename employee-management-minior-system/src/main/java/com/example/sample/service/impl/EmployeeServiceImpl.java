package com.example.sample.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Service;

import com.example.sample.entity.Employees1;
import com.example.sample.repository.ContactDetailsRepository;
import com.example.sample.repository.EmployeesRepository;
import com.example.sample.service.EmployeeService;

@Service
public class EmployeeServiceImpl implements EmployeeService {

	@Autowired
	private EmployeesRepository employeesRepository;
	@Autowired
	private ContactDetailsRepository contactDetailsRepository;

	public EmployeeServiceImpl() {
		super();
		// TODO Auto-generated constructor stub
	}

	public EmployeeServiceImpl(EmployeesRepository employeesRepository,
			ContactDetailsRepository contactDetailsRepository) {
		super();
		this.employeesRepository = employeesRepository;
		this.contactDetailsRepository = contactDetailsRepository;
	}

	public EmployeeServiceImpl(EmployeesRepository employeesRepository) {
		super();
		this.employeesRepository = employeesRepository;
	}

	@Override
	public List<Employees1> getAllEmployees() {
		// TODO Auto-generated method stub
		return employeesRepository.findAll();
	}

	@Override
	public Employees1 addEmployee(Employees1 employee) {
		// TODO Auto-generated method stub
		return employeesRepository.save(employee);
	}

	@Override
	public void deleteEmployeeById(Long id) {
		// TODO Auto-generated method stub
		employeesRepository.deleteById(id);
	}

	@Override
	public Employees1 updateEmployeesById(Employees1 employee) {
		return employeesRepository.save(employee);
		// TODO Auto-generated method stub

	}

	@Override
	public Employees1 getEmployeeById(Long id) {
		// TODO Auto-generated method stub
		return employeesRepository.findById(id).get();
	}

	@Override
	public Page<Employees1> findEmployeeWithPagination(int offset, int pageSize) {
		// TODO Auto-generated method stub
		Page<Employees1> emp = employeesRepository.findAll(PageRequest.of(offset, pageSize));
		return emp;
	}

}
