package com.m2i.formation.presentation;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.m2i.formation.entity.Employee;
import com.m2i.formation.service.EmployeeService;

public class Demo {

	public void AjoutEmpl(Employee employee) {

		//Employee employee = new Employee("FHA", "rttt", "dfggf", "sdsdf", "sdfsdf", "dgf"); 
		
		ApplicationContext appContext = (ApplicationContext) new ClassPathXmlApplicationContext("application-context.xml");  
		EmployeeService employeeService = (EmployeeService) appContext.getBean("employeeService"); 
		employeeService.addEmployee(employee); 

	}

	public void RecupEmpl(int id) {

		ApplicationContext appContext = (ApplicationContext) new ClassPathXmlApplicationContext("application-context.xml");  
		EmployeeService employeeService = (EmployeeService) appContext.getBean("employeeService"); 
		employeeService.getEmployeebyId(id); 

	}
}
