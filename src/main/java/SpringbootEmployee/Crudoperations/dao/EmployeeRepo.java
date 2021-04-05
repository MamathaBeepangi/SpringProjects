package SpringbootEmployee.Crudoperations.dao;



import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import SpringbootEmployee.Crudoperations.model.Employee;

public interface EmployeeRepo extends JpaRepository<Employee,Integer>
{
	Optional<List<Employee>> findByName(String name);
	
}
