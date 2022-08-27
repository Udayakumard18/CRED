package com.example.SearchEmployee.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.SearchEmployee.Repository.EmployeeRepository;
import com.example.SearchEmployee.domain.Employee;

@Service
public class EmployeeService {

	@Autowired
	    private EmployeeRepository repo;
	public List<Employee> listAll() {
	        return repo.findAll();
	    }
	    
	    
	    
	    public Employee get(long id) {
	        return repo.findById(id).get();
	    }
	 
	}


