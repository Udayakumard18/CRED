package com.example.SearchEmployee.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.example.SearchEmployee.Service.EmployeeService;
import com.example.SearchEmployee.domain.Employee;

@Controller

public class EmployeeController {
	
	
	
	    @Autowired
	    private EmployeeService service;
	 
	    @GetMapping("/")
	    public String add(Model model) {
	     List<Employee> listemployee = service.listAll();
	        model.addAttribute("employee", new Employee());
	        return "index";
	    }
	 
	    
	    @PostMapping("/search")
	     public String doSearchEmployee(@ModelAttribute("employeeSearchFormData") Employee formData, Model model) {
	            Employee emp = service.get(formData.getId());
	            model.addAttribute("employee", emp);
	            return "index";            
	     }
	 
	}


