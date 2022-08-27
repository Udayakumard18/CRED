package com.example.SearchEmployee.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.SearchEmployee.domain.Employee;

@Repository
public interface EmployeeRepository extends JpaRepository<Employee, Long>{
 
}