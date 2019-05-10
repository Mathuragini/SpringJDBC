package com.sgic.service.impl;

import java.util.List;

import com.sgic.dao.EmployeeDAO;
import com.sgic.model.Employee;
import com.sgic.service.EmployeeService;

public class EmployeeServiceImpl implements EmployeeService {

	//dependency injection
	private EmployeeDAO employeeDAO;
	
	public void setEmployeeDAO(EmployeeDAO employeeDAO) {
		this.employeeDAO = employeeDAO;
	}

	@Override
	public void addEmployee(Employee employee) {
		employeeDAO.createEmployee(employee);
		
	}

	@Override
	public Employee fetchEmployeeById(int employeeId) {
		
		return employeeDAO.getEmployeeById(employeeId);
	}

	@Override
	public void deleteEmployeeById(int employeeId) {
		employeeDAO.deleteEmployeeById(employeeId);
		
	}

	@Override
	public void updateEmployeeEmailById(String newEmail, int employeeId) {
		// TODO Auto-generated method stub
		employeeDAO.updateEmployeeEmailById(newEmail, employeeId);
	}

	@Override
	public List<Employee> getAllEmployeesDetails() {
		// TODO Auto-generated method stub
		return employeeDAO.getAllEmployeesDetails();
	}
	


	
}
