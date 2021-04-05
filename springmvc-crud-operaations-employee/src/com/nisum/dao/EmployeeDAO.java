package com.nisum.dao;

import java.util.List;

import com.employee.model.employee;

 
public interface EmployeeDAO {
 
    public void addEmployee(employee employee);
 
    public List<employee> getAllEmployees();
 
    public void deleteEmployee(Integer employeeId);
 
    public employee updateEmployee(employee employee);
 
    public employee getEmployee(int employeeid);
}
