package com.sujeetpoc.springbootfeatures.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.sujeetpoc.springbootfeatures.domain.DomainRecords.Employee;
import com.sujeetpoc.springbootfeatures.exception.InvalidEmployee;
import com.sujeetpoc.springbootfeatures.service.EmployeeService;

@RestController
@RequestMapping(value = "/employees")
public class EmployeeController {

	@Autowired
	EmployeeService employeeService;

	@GetMapping(value = "/sample")
	public Employee getSampleEmployee(@RequestParam(name="id") Integer id, @RequestParam(name="empname") String empName) {
		return employeeService.getSampleEmployee(id,empName);
	}
	
	@GetMapping(value = "/samplewithpath/{empid}/{empname}")
	public Employee getSampleEmployee2(@PathVariable(name="empid") Integer id, @PathVariable(name="empname") String empName) {
		return employeeService.getSampleEmployee(id,empName);
	}
	
	@GetMapping(value = "/null")
	public Employee getNullEmployee() {
		return employeeService.getNullEmployee();
	}
	
	@GetMapping(value = "/sayhello")
	public String getSayHelloEmp() {
		return employeeService.getSayHelloEmp();
	}
	
	@GetMapping(value = "/invalid")
	public String getInValidEmp() throws InvalidEmployee {
		return employeeService.getInValidEmp();
	}
	
	@GetMapping(value = "")
	public ResponseEntity<String> getEmployees() {
		return new ResponseEntity<String>(employeeService.getEmployees(), HttpStatus.OK);
	}
}