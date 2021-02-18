package com.covid.covid.covid_dao;

import java.util.ArrayList;
import java.util.List;

import javax.sql.DataSource;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.support.rowset.SqlRowSet;
import org.springframework.stereotype.Component;

import com.covid.covid.covid_model.Employee;

@Component
public class EmployeeSqlDAO implements EmployeeDAO {
	
	private JdbcTemplate jdbcTemplate;
	Employee emp = new Employee();
	
	public EmployeeSqlDAO (DataSource dataSource) {
		jdbcTemplate = new JdbcTemplate(dataSource);
	}
	

	@Override
	public Employee getemployee (String id) {
		Employee employee = null;

		String sql = "select emp_id, emp_name from employees where emp_id = ?";
		
	
		
		SqlRowSet results = jdbcTemplate.queryForRowSet(sql, id);
		
		if (results.next()) {
			employee = mapRowSetToEmployee(results);
	
		}
		
		
		return employee ;
	}
	

//	@Override
//	public String[] employee(String id) {
//		String [] employee = null;
//		
//		String sql = "select emp_id, emp_name from employees where emp_id = ?";
//		SqlRowSet results = jdbcTemplate.queryForRowSet(sql, id);
//		while (results.next()) {
//			mapRowSetToEmployee(results);
//		}
//		
//		employee[0] = emp.getEmpid();
//		employee[1] = emp.getName();
//		
//		return employee;
//	}

	
	
	private Employee mapRowSetToEmployee (SqlRowSet rs) {
		Employee employee = new Employee();
		
		employee.setEmpid(rs.getString("emp_id"));
		employee.setName(rs.getString("emp_name"));
		
		return employee;
		
	}


	
	
	
	
}
