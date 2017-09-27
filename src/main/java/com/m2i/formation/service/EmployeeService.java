package com.m2i.formation.service;

import org.apache.log4j.Logger;

import com.m2i.formation.dao.IEmplooyeeDAO;
import com.m2i.formation.entity.Employee;

public class EmployeeService {

	private static final Logger l = Logger.getLogger(EmployeeService.class);

	IEmplooyeeDAO employeeDAO;

	// Getter
	public IEmplooyeeDAO getEmployeeDAO() {
		return employeeDAO;
	}

	// Setter
	public void setEmployeeDAO(IEmplooyeeDAO employeeDAO) {
		this.employeeDAO = employeeDAO;
	}

	public Boolean addEmployee(Employee employee) {
		Boolean employeeAdded = true;
		try {
			employeeDAO.addEmploye(employee);
		} catch (Exception e) {
			employeeAdded = false;
		}

		return employeeAdded;
	}

	public Employee getEmployeebyId(int id) {
		Employee employee = null;

		try {
			l.info("Entrée dans la méthode getEmployeebyId");
			employee = employeeDAO.getEmployeebyId(id);

		} catch (Exception e) {
			l.error("Error : " + e);
		}

		return employee;

	}
}
