package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.model.EmployeeModel;
import com.example.demo.repos.EmployeeRepository;

@Service
public class EmployeeService {
	
	@Autowired
	private EmployeeRepository employeeRepository;

	public void saveEmployeeDetails(EmployeeModel employeeModel) {
		employeeRepository.save(employeeModel);
	}

	public List<EmployeeModel> getAllEmployees() {
		return employeeRepository.findAll();
	}

}
