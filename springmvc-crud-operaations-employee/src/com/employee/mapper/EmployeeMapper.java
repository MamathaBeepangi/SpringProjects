package com.employee.mapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.employee.model.employee;



public class EmployeeMapper implements RowMapper<employee>
{

	@Override
	public employee mapRow(ResultSet rs, int arg1) throws SQLException 
	{
		employee e=new employee();
		e.setEid(rs.getInt("eid"));
		e.setName(rs.getString("name"));
		e.setDesignation(rs.getString("designation"));
		e.setSalary(rs.getInt("salary"));
		
		return e;
	}

}
