package com.sgic.client;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.sgic.model.Employee;
import com.sgic.service.EmployeeService;
import com.sgic.service.impl.EmployeeServiceImpl;

public class Test {

	public static void main(String[] args) {

		AbstractApplicationContext ctx=new ClassPathXmlApplicationContext("Beans.xml");
		
		EmployeeService employeeService=ctx.getBean("employeeService",EmployeeServiceImpl.class);
		
		Employee employee=new Employee();
		employee.setEmail("test@hj.com");
		employee.setEmployeeName("John");
		employee.setGender("Male");
		employee.setSalary(9000.00);
		
		employeeService.addEmployee(employee);
	}

}
