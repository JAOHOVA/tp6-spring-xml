package com.m2i.formation.dao;

import org.apache.log4j.Logger;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;

import com.m2i.formation.entity.Employee;

public class EmployeeDAO implements IEmplooyeeDAO {

	private static final Logger l = Logger.getLogger(EmployeeDAO.class);

	JdbcTemplate jdbcTemplate;

	// Getter JdbcTemplate
	public JdbcTemplate getJdbcTemplate() {
		return jdbcTemplate;
	}

	// Setter JdbcTemplate
	public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
		this.jdbcTemplate = jdbcTemplate;
	}

	// avec JDBCTEMPLATE ADD
	public void addEmploye(Employee employee) {

		l.info("Debut de la méthode addEmployee");

		final String INSERT_QUERY = "INSERT INTO employe (login, email, password, prenom, nom, role) VALUES (?,?,?,?,?,?)";

		jdbcTemplate.update(INSERT_QUERY, new Object[] { employee.getLogin(), employee.getEmail(),
				employee.getPassword(), employee.getPrenom(), employee.getNom(), employee.getRole() });

		l.info("Fin de la méthode addEmploye");
	}

	@Override
	public void saveEmployee(Employee employee) {

		l.info("Debut de la méthode saveEmployee");

		final String UPDATE_QUERY = "UPDATE employe set login = ?, email = ?, password = ?, prenom = ?, nom = ?, role = ?";

		jdbcTemplate.update(UPDATE_QUERY, new Object[] { employee.getLogin(), employee.getEmail(),
				employee.getPassword(), employee.getPrenom(), employee.getNom(), employee.getRole() });

		l.info("Fin de la méthode saveEmployee");
	}

	// avec JDBCTEMPLATE ID
	public Employee getEmployeebyId(int id) {

		l.info("Debut de la méthode getEmployee");

		final String SELECT_QUERY = "SELECT ID, login, email, password, prenom, nom, role FROM employe WHERE ID = ?";

		Employee employee = jdbcTemplate.queryForObject(SELECT_QUERY, BeanPropertyRowMapper.newInstance(Employee.class),
				id);
		l.info("Nom : " + employee.getNom());
		l.info("Fin de la méthode addEmployee");

		return employee;

	}
}
