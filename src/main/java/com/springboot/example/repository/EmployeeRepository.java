package com.springboot.example.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.springboot.example.Model.Employee;

@Repository
public interface EmployeeRepository extends JpaRepository<Employee,Long>
{

}
