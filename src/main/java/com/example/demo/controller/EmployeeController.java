package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.EmployeeModel;
import com.example.demo.service.EmployeeService;

@RestController
@RequestMapping("/employee")
public class EmployeeController {
	
	@Autowired
	public EmployeeService employeeService;
	
	@PostMapping("/saveEmployee") 
	public String saveNewEmployee(@RequestBody EmployeeModel employeeModel) {
		employeeService.saveEmployeeDetails(employeeModel);
		return employeeModel.getEmployeeName() + " Saved ";
	}
	
	@GetMapping("/getAllEmployees")
	public List<EmployeeModel> getAllEmployeeDetails() {
		return employeeService.getAllEmployees();
	}

}
