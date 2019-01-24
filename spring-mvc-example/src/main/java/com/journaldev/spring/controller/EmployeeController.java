package com.journaldev.spring.controller;

import java.sql.Date;
import java.text.DateFormat;
import java.util.Locale;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.journaldev.spring.dao.EmployeeDao;
import com.journaldev.spring.model.Employee;
import com.journaldev.spring.model.User;
import com.journaldev.spring.service.EmployeeService;

@Controller
public class EmployeeController {

	@RequestMapping(value = "/", method = RequestMethod.GET)
	public String home(Locale locale, Model model) {
		System.out.println("Home Page Requested, locale = " + locale);
		Date date = new Date(0);
		DateFormat dateFormat = DateFormat.getDateTimeInstance(DateFormat.LONG, DateFormat.LONG, locale);

		String formattedDate = dateFormat.format(date);

		model.addAttribute("serverTime", formattedDate);

		return "home";
	}

	@RequestMapping(value = "/user", method = RequestMethod.GET)
	public String user(@Validated User user, Model model) {
		System.out.println("User Page Requested");
		model.addAttribute("userName", user.getUserName());
		//return "user";
		return "index";
	}
	@RequestMapping(value = "/display", method = RequestMethod.POST)
	public String addEmployee(@ModelAttribute("SpringWeb")Employee employee,
			ModelMap model) {
		model.addAttribute("empId", employee.getEmpId());
		model.addAttribute("name", employee.getEmpName());
		model.addAttribute("designation", employee.getDesignation());
		model.addAttribute("salary", employee.getSalary());

		new EmployeeService().addEmployeeService(employee);
		return "index";
	}

	@RequestMapping(value = "/form", method = RequestMethod.GET)
	public ModelAndView empoloyee() {
		return new ModelAndView("form", "command", new Employee());
	}
	@RequestMapping(value = "/display", method = RequestMethod.GET)
	public ModelAndView display() {
		ModelAndView model = new ModelAndView("display");
		model.addObject("listOfEmployees",new EmployeeService().getEmployeeService());
		return model;
	}
	@RequestMapping(value = "/delete", method = RequestMethod.GET)
	public ModelAndView Employee() { 
		return new ModelAndView("delete", "command", new Employee());
	}
	@RequestMapping(value = "/deleteId", method = RequestMethod.POST)
	public String deleteEmployee(@ModelAttribute("SpringWeb")Employee emp,
			ModelMap model) {
		new EmployeeService().deleteEmployeeService(emp);
		return "success";
	}
	@RequestMapping(value = "/update", method = RequestMethod.GET)
	public ModelAndView updateEmployee() { 
		return new ModelAndView("update","empData", new Employee());
	}
	/*@RequestMapping(value = "/fetchId", method = RequestMethod.POST)
	public String updateEmployee(@ModelAttribute("SpringWeb")Employee emp,
			ModelMap model) {
		ModelAndView model1= new ModelAndView("update");
		model.addAttribute("empId", emp.getEmpId());
		model.addAttribute("name", emp.getEmpName());
		model.addAttribute("designation", emp.getDesignation());
		model.addAttribute("salary", emp.getSalary());
		model1.addObject("listOfEmployees",new EmployeeService().fetchEmployeeService(emp));
		System.out.println("hiiiii");
		System.out.println(emp.getEmpId());
		//new EmployeeService().fetchEmployeeService(emp);
		return "update";
	}*/
	@RequestMapping(value = "/search", method = RequestMethod.POST)
	public ModelAndView search(@ModelAttribute()Employee emp) {
		emp = new EmployeeService().searchEmployeeService(emp);
		return new ModelAndView("update", "empData", emp);
	}
	@RequestMapping(value = "/updateEmployee", method = RequestMethod.POST)
	public String editEmployee(@ModelAttribute()Employee emp) {
		System.out.println("record updated successfully");
		new EmployeeService().updateEmployeeService(emp);
		return "success";
	}
}


