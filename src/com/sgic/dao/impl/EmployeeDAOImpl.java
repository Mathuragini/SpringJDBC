package com.sgic.dao.impl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.List;

import javax.sql.DataSource;

import com.sgic.dao.EmployeeDAO;
import com.sgic.model.Employee;

public class EmployeeDAOImpl implements EmployeeDAO {

	// dependency injection
	private DataSource dataSource;

	public void setDataSource(DataSource dataSource) {
		this.dataSource = dataSource;
	}

	@Override
	public void createEmployee(Employee employee) {
		Connection connection = null;
		PreparedStatement ps = null;
		
		try {
			connection=dataSource.getConnection();
			String SQL="INSERT INTO employee_table(employee_name,email,gender,salary) VALUES (?,?,?,?)";
			ps=connection.prepareStatement(SQL);
			
			ps.setString(1, employee.getEmployeeName());
			ps.setString(2, employee.getEmail());
			ps.setString(3, employee.getGender());
			ps.setDouble(4, employee.getSalary());
			
			int executeUpdate=ps.executeUpdate();
			if(executeUpdate>0) {
				System.out.println("Employee is created");
			}
		}catch(Exception e) {
			e.printStackTrace();
		}finally {
			if(connection!=null) {
				try {
					connection.close();
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		}

	}

	@Override
	public Employee getEmployeeById(int employeeId) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void deleteEmployeeById(int employeeId) {
		// TODO Auto-generated method stub

	}

	@Override
	public void updateEmployeeEmailById(String newEmail, int employeeId) {
		// TODO Auto-generated method stub

	}

	@Override
	public List<Employee> getAllEmployeesDetails() {
		// TODO Auto-generated method stub
		return null;
	}

}
