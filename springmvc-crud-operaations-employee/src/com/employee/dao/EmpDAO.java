package com.employee.dao;

import java.util.List;

import javax.sql.DataSource;

import com.employee.model.employee;

public interface EmpDAO 
{
	public void setDataSource(DataSource ds);
	public void createEmployee(employee e);
	public void updateEmployee(employee e);
	public employee getEmployeebyId(int id);
	public void deleteemp(int id);
	public List<employee> getAllEmployees();
}
