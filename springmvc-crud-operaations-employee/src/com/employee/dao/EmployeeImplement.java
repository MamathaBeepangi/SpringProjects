package com.employee.dao;


import java.util.List;

import javax.sql.DataSource;

import org.springframework.jdbc.core.JdbcTemplate;

import com.employee.mapper.EmployeeMapper;
import com.employee.model.employee;


public class EmployeeImplement implements EmpDAO
{

	 private DataSource dataSource;
	 private JdbcTemplate jdbcTemplateObject;

	
	public void setDataSource(DataSource ds) 
	{
		this.dataSource=ds;
		this.jdbcTemplateObject=new JdbcTemplate(dataSource);
		
	}
	
	@Override
	public void createEmployee(employee e) 
	{
	
		System.out.println("\nCreating the new Employee:\n");
		String sql="insert into emp_mvc(eid,name,designation,salary) values(?,?,?,?)";
		jdbcTemplateObject.update(sql,e.getEid(),e.getName(),e.getDesignation(),e.getSalary());
		
		
	}

	@Override
	public void updateEmployee(employee e) 
	{
		String sql="update emp_mvc set eid=?,name=?,designation=?,salary=?";
		jdbcTemplateObject.update(sql, e.getEid(),e.getName(),e.getDesignation(),e.getSalary());
	}

	@Override
	public employee getEmployeebyId(int id) 
	{
		String sql="select * from emp_mvc where eid=?";
		employee emp=jdbcTemplateObject.queryForObject(sql, new Object[]{id}, new EmployeeMapper());
		return emp;
	}

	@Override
	public void deleteemp(int id) 
	{
		String sql="delete from emp_mvc where eid=?";
		jdbcTemplateObject.update(sql, id);
		
		
	}

	@Override
	public List<employee> getAllEmployees() 
	{
		String sql="select * from emp_mvc";
		List<employee> emps=jdbcTemplateObject.query(sql, new EmployeeMapper());
		return emps;
	}


}
