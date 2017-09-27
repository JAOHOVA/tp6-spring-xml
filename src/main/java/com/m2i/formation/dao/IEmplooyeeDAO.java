package com.m2i.formation.dao;

import com.m2i.formation.entity.Employee;

public interface IEmplooyeeDAO {
	
	public void addEmploye(Employee emp);

	public Employee getEmployeebyId(int id);
	
	public void saveEmployee(Employee emp);
}
