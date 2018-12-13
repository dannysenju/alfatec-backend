package com.alfatecsistemas.sihna.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.alfatecsistemas.sihna.commons.Utility;
import com.alfatecsistemas.sihna.dto.DepartmentDTO;
import com.alfatecsistemas.sihna.model.Department;
import com.alfatecsistemas.sihna.model.DepartmentMapper;
import com.alfatecsistemas.sihna.repository.DepartmentRepository;
import com.alfatecsistemas.sihna.service.DepartmentService;

/**
 * implementation of the department services interface
 * 
 * @author danny
 * 
 */
@Service("departmentService")
public class DeparmentServiceImpl implements DepartmentService {

	@Autowired
	private DepartmentRepository departmentRepository;

	@Override
	public List<DepartmentDTO> findAllDepartments() {

		List<Department> list = Utility.getInstance().toList(departmentRepository.findAll());

		return DepartmentMapper.mapEntitiesIntoDTOs(list);
	}

	@Override
	public DepartmentDTO findById(Long id) {
		// TODO Auto-generated method stub
		return DepartmentMapper.mapEntityIntoDTO(departmentRepository.findOne(id));
	}

	@Override
	public DepartmentDTO findByName(String name) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void save(DepartmentDTO department) {
		// TODO Auto-generated method stub
		departmentRepository.save(DepartmentMapper.mapDTOIntoEntity(department));
	}

	@Override
	public void update(DepartmentDTO department) {
		// TODO Auto-generated method stub

	}

	@Override
	public void delete(Long id) {
		// TODO Auto-generated method stub

	}

}
