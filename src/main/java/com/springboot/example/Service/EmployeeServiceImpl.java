package com.springboot.example.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.springboot.example.Model.Employee;
import com.springboot.example.repository.EmployeeRepository;

@Service
public class EmployeeServiceImpl implements EmployeeService
{
    @Autowired
	private EmployeeRepository dao;
	
	public List<Employee> getAllEmplo() {
		
		return dao.findAll();
	}

} 
