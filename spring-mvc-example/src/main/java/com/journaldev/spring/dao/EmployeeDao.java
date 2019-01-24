package com.journaldev.spring.dao;

import java.util.ArrayList;

import com.journaldev.spring.model.Employee;

public class EmployeeDao {
	private static ArrayList<Employee> employeesList = new ArrayList<Employee>(); 
	public void addEmployeeDAO(Employee employee)
	{
		EmployeeDao.employeesList.add(employee);
		//System.out.println(employeesList);
	}
	public ArrayList<Employee> getEmployeeDao()
	{
		//System.out.println(employeesList);
		return employeesList;
	}
	public void deleteEmployee(Employee employee)
	{   for(int i=0;i<employeesList.size();i++)
	{     if(employeesList.get(i).getEmpId()==employee.getEmpId()) {
		employeesList.remove(i);

	}
	System.out.println("Record deleted successfully");
	}
	}
	public Employee searchEmployeeDao(Employee employee)
	{   Employee emp =new  Employee();
	for(int i=0;i<employeesList.size();i++){
		System.out.println(employeesList.get(i).getEmpId());

		if(employeesList.get(i).getEmpId()==employee.getEmpId()) {
			emp =  employeesList.get(i);
			System.out.println(emp.getEmpId());	 
		}

	}
	return emp;
	}
	public void updateEmployee(Employee employee)
	{   for(int i=0;i<employeesList.size();i++)
	{     if(employeesList.get(i).getEmpId()==employee.getEmpId()) {
		employee =  employeesList.get(i);
		employeesList.remove(i);
		employeesList.add(employee);

	}
	System.out.println("Record updated successfully");
	};

	}
}

