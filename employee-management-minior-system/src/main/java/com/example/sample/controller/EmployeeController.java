package com.example.sample.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.sample.entity.Employees1;

import com.example.sample.service.EmployeeService;

@RestController
@RequestMapping("/api/v1/employees")
public class EmployeeController {

	@Autowired
	private EmployeeService employeeService;

	public EmployeeController() {
		super();
		// TODO Auto-generated constructor stub
	}

	public EmployeeController(EmployeeService employeeService) {
		super();
		this.employeeService = employeeService;
	}

	@GetMapping("/")
	public ResponseEntity<List<Employees1>> getAllEmployees() {

		List<Employees1> list = this.employeeService.getAllEmployees();
		if (list.size() <= 0) {
			return ResponseEntity.status(HttpStatus.NOT_FOUND).build();
		}
		return ResponseEntity.of(Optional.of(list));

	}

	@PostMapping("/")
	public ResponseEntity<Object> addEmployees(@RequestBody Employees1 employee) {
		Employees1 varDoctor = null;
		try {
			varDoctor = this.employeeService.addEmployee(employee);
			return ResponseEntity.of(Optional.of(varDoctor));
		} catch (Exception ex) {
			ex.printStackTrace();
			return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).build();
		}

	}

	@DeleteMapping("/{id}")
	public ResponseEntity<Void> deleteEmployeeById(@PathVariable("id") String id) {
		try {
			this.employeeService.deleteEmployeeById(Long.parseLong(id));
			return ResponseEntity.status(HttpStatus.NO_CONTENT).build();

		} catch (Exception ex) {
			ex.printStackTrace();
			return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).build();
		}
	}

	@GetMapping("/{offset}/{pageSize}")
	public ResponseEntity<Page<Employees1>> getAllEmployeeWithPagination(@PathVariable int offset,
			@PathVariable int pageSize) {

		Page<Employees1> alllist = this.employeeService.findEmployeeWithPagination(offset, pageSize);
		return ResponseEntity.of(Optional.of(alllist));

	}

	@PutMapping("/{id}")
	public ResponseEntity<Employees1> updateEmployeeById(@PathVariable Long id, @RequestBody Employees1 employee) {
		Employees1 existingEmployee = employeeService.getEmployeeById(id);
		existingEmployee.setId(id);
		existingEmployee.setFullname(employee.getFullname());
		existingEmployee.setJobtitle(employee.getJobtitle());
		existingEmployee.setPhonenumber(employee.getPhonenumber());
		existingEmployee.setEmail(employee.getEmail());
		existingEmployee.setContactDetails(employee.getContactDetails());
		Employees1 employeevar = employeeService.updateEmployeesById(existingEmployee);
		return ResponseEntity.ok().body(employeevar);

	}

}
