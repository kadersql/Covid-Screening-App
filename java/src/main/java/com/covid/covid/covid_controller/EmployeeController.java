package com.covid.covid.covid_controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.covid.covid.covid_dao.EmployeeDAO;
import com.covid.covid.covid_model.Employee;
@CrossOrigin
@RestController
public class EmployeeController {
	
	@Autowired
	EmployeeDAO DAO;
	
	
	
	@RequestMapping (path ="/employee/{id}", method = RequestMethod.GET)
	public Employee geteployee (@PathVariable String id) {
		
		Employee employee = DAO.getemployee(id);
		
		return employee;
	}

}


