package SpringbootEmployee.Crudoperations.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="EmployeeCRUD")
public class Employee {
	@Id
	@GeneratedValue
	private Integer id;
	private String name;
	private String designation;
	private Integer salary;

	public Employee() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Employee(Integer id, String name, String designation, Integer salary) {
		super();
		this.id = id;
		this.name = name;
		this.designation = designation;
		this.salary = salary;
	}

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	public Integer getEid() {
		return id;
	}

	public void setEid(Integer eid) {
		this.id = eid;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDesignation() {
		return designation;
	}

	public void setDesignation(String designation) {
		this.designation = designation;
	}

	public Integer getSalary() {
		return salary;
	}

	public void setSalary(Integer salary) {
		this.salary = salary;
	}

	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", designation=" + designation + ", salary=" + salary + "]";
	}

}
