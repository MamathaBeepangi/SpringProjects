package SpringbootEmployee.Crudoperations.controller;


import java.util.List;
import java.util.NoSuchElementException;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;

import org.springframework.web.bind.annotation.RestController;


import SpringbootEmployee.Crudoperations.model.Employee;
import SpringbootEmployee.Crudoperations.service.EmpService;




@RestController

public class EmployeeController 
{
	@Autowired
	EmpService service;
	

	@PostMapping("/addEmployee")
	public Employee addemp(@RequestBody Employee emp)
	{
		return service.saveEmployee(emp);
	}
	
	@GetMapping("/employees")
	public List<Employee> getallEmployees()
	{
		return service.getAllEmployees();
	}
	
	@GetMapping("/Employee/{id}")
	public Employee getEmpbyId(@PathVariable Integer id )
	{
		return service.getEmployeebyid(id);
	}
	
	@PutMapping("/empUpdate")
	public Employee update(@RequestBody Employee emp)
	{
		return service.UpdateEmployee(emp);
	}

	@DeleteMapping("/delete/{id}")
	public void delete(@PathVariable Integer id)
	{
		service.delete(id);
	}
	
	

	@GetMapping("/Byname/{name}")
	public List<Employee> getByname(@PathVariable String name)
	{
		return service.findByName(name);
	}
	}
	

