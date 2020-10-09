package com.springuse.service;

import java.util.List;
import com.springuse.dao.EmployeeDAO;
import com.springuse.domain.Employee;

public class EmployeeService {
	EmployeeDAO empDAO= new EmployeeDAO();
	public void addNewEmployee(Employee emp ) {
		empDAO.addNewEmployee(emp);
	}
	public List<Employee> getEmployees(){
		return empDAO.getAllEmployees();
	}
}