package com.alfatecsistemas.sihna.service;

import java.util.List;

import com.alfatecsistemas.sihna.dto.EmployeeDTO;

/**
 * service interface employee
 * 
 * @author danny
 * 
 */
public interface EmployeeService {

	/**
	 * find all employees from different departments
	 * 
	 * @return
	 */
	List<EmployeeDTO> findAllEmployees();

	/**
	 * find all employees of a department
	 * 
	 * @param id
	 * @return
	 */
	List<EmployeeDTO> findAllEmployeesByDepartmentId(Long id);

	/**
	 * find single employee by id
	 * 
	 * @param id
	 * @return
	 */
	EmployeeDTO findById(Long id);

	/**
	 * persist a employee object
	 * 
	 * @param department
	 */
	void save(EmployeeDTO department);

	/**
	 * update a employee object
	 * 
	 * @param department
	 */
	void update(EmployeeDTO department);

	/**
	 * delete a employee record
	 * 
	 * @param id
	 */
	void delete(Long id);
	
}
