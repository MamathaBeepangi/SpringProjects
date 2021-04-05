package com.employee.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.employee.dao.EmpDAO;
import com.employee.model.employee;


@Controller
public class EmployeeController 
{
	@Autowired
	EmpDAO dao; 
	@RequestMapping("/empform")
	public String show(Model m)
	{
		m.addAttribute("command",new employee());
		return "empform";
	}
	 @RequestMapping(value="/save",method = RequestMethod.POST)    
	public String save(@ModelAttribute("emp") employee emp)
	 {    
		 dao.createEmployee(emp);
		 return "redirect:/viewemp";    
	    
	 } 
	 @RequestMapping("/viewemp")    
	 public String viewemp(Model m)
	 {    
	        List<employee> list=dao.getAllEmployees();    
	        m.addAttribute("list",list);  
	        return "viewemp";    
	  }
	 @RequestMapping(value="/editemp/{id}")    
	 public String edit(@PathVariable int id, Model m)
	 {    
	       employee emp=dao.getEmployeebyId(id);    
	        m.addAttribute("command",emp);  
	        return "empeditform";    
	  }  
	 @RequestMapping(value="/editsave",method = RequestMethod.POST)    
	 public String editsave(@ModelAttribute("command") employee emp)
	 {    
	      dao.updateEmployee(emp);    
	       return "redirect:/viewemp";    
	  }    
	  @RequestMapping(value="/deleteemp/{id}",method = RequestMethod.GET)    
	  public String delete(@PathVariable int id)
	  {    
	        dao.deleteemp(id);    
	        return "redirect:/viewemp";    
	  }  
	 
}
