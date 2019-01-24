package com.journaldev.spring.service;

import java.util.ArrayList;

import com.journaldev.spring.dao.EmployeeDao;
import com.journaldev.spring.model.Employee;

public class EmployeeService {
	public void addEmployeeService(Employee employee)
	{
		new EmployeeDao().addEmployeeDAO(employee);
	}
	public ArrayList<Employee> getEmployeeService()
	{
		ArrayList<Employee> e =  new EmployeeDao().getEmployeeDao();
		//System.out.println(e);
		return e;
	}
	public void deleteEmployeeService(Employee emp)
	{
		new EmployeeDao().deleteEmployee(emp);
	}
	public Employee searchEmployeeService(Employee emp)
	{
		emp= new EmployeeDao().searchEmployeeDao(emp);
		return  emp;
	}
	public void updateEmployeeService(Employee emp)
	{
		new EmployeeDao().updateEmployee(emp);
	}

}
