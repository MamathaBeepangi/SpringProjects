package SpringbootEmployee.Crudoperations.service;
import java.util.List;
import java.util.Optional;


import javax.transaction.Transactional;
 
import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Service;


import SpringbootEmployee.Crudoperations.dao.EmployeeRepo;
import SpringbootEmployee.Crudoperations.model.Employee;

 
@Service
@Transactional
public class EmpService 
{
	@Autowired 
	 EmployeeRepo emp_repository;
	
	public Employee saveEmployee(Employee e)
	{
		return emp_repository.save(e);
	}
	
	public List<Employee> getAllEmployees()
	{
		return emp_repository.findAll();
	}
	
	public Employee getEmployeebyid(Integer eid)
	{
		
		return emp_repository.findById(eid).orElseThrow();
	}
	
	
	public void delete(Integer eid)
	{
		emp_repository.deleteById(eid);
	}
	
	public List<Employee> findByName(String name)
	{
		
		return emp_repository.findByName(name).orElseThrow(NullPointerException::new);
	}
	
	
	public Employee UpdateEmployee(Employee emp)
	{
		Employee exist_emp=emp_repository.findById(emp.getEid()).orElse(null);
		exist_emp.setEid(emp.getEid());
		exist_emp.setName(emp.getName());
		exist_emp.setDesignation(emp.getDesignation());
		exist_emp.setSalary(emp.getSalary());
		return emp_repository.save(exist_emp);
	}
	
}
