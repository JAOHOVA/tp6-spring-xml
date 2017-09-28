package com.m2i.formation;

import static org.junit.Assert.*;

import org.junit.Test;

import com.m2i.formation.entity.Employee;
import com.m2i.formation.presentation.Demo;

public class DemoTest {

//	@Test
//	public void testAjoutEmp() {
//		Demo demo = new Demo();
//		Employee employee = new Employee("sdffsdf", "m2i", "Maris", "JEAN",  "juldas@yahoo.fr", "Product O");
//		demo.AjoutEmpl(employee);
//	}

	@Test
	public void testRecupEmp() {
		Demo demo = new Demo();
		demo.RecupEmpl(5);
	}

}
