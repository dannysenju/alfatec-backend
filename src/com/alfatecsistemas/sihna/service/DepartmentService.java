package com.alfatecsistemas.sihna.service;

import java.util.List;

import com.alfatecsistemas.sihna.dto.DepartmentDTO;

/**
 * service interface department
 * 
 * @author danny
 * 
 */
public interface DepartmentService {

	/**
	 * find all departments
	 * 
	 * @return
	 */
	List<DepartmentDTO> findAllDepartments();

	/**
	 * find single department by id
	 * 
	 * @param id
	 * @return
	 */
	DepartmentDTO findById(Long id);

	/**
	 * find single department by name
	 * 
	 * @param name
	 * @return
	 */
	DepartmentDTO findByName(String name);

	/**
	 * persist a department object
	 * 
	 * @param department
	 */
	void save(DepartmentDTO department);

	/**
	 * update a department object
	 * 
	 * @param department
	 */
	void update(DepartmentDTO department);

	/**
	 * delete a department record
	 * 
	 * @param id
	 */
	void delete(Long id);

}
