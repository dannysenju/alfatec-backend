package com.alfatecsistemas.sihna.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.alfatecsistemas.sihna.commons.Utility;
import com.alfatecsistemas.sihna.dto.EmployeeDTO;
import com.alfatecsistemas.sihna.model.Employee;
import com.alfatecsistemas.sihna.model.EmployeeMapper;
import com.alfatecsistemas.sihna.repository.DepartmentRepository;
import com.alfatecsistemas.sihna.repository.EmployeeRepository;
import com.alfatecsistemas.sihna.service.EmployeeService;
import com.alfatecsistemas.sihna.specs.EmployeeSpecs;

/**
 * implementation of the department services interface
 * 
 * @author danny
 * 
 */
@Transactional
@Service("employeeService")
public class EmployeeServiceImpl implements EmployeeService {

	@Autowired
	private EmployeeRepository employeeRepository;

	@Autowired
	private DepartmentRepository departmentRepositoryy;

	@Override
	public List<EmployeeDTO> findAllEmployees() {
		List<Employee> list = Utility.getInstance().toList(employeeRepository.findAll());

		for (Employee employee : list) {
			employee.setDepartment(departmentRepositoryy.findOne(employee.getIdDepartment()));
		}
		return EmployeeMapper.mapEntitiesIntoDTOs(list);
	}

	@Override
	public List<EmployeeDTO> findAllEmployeesByDepartmentId(Long id) {

		List<Employee> list = Utility.getInstance()
				.toList(employeeRepository.findAll(EmployeeSpecs.getEmployeeFilterByDepartment(id)));

		for (Employee employee : list) {
			employee.setDepartment(departmentRepositoryy.findOne(employee.getIdDepartment()));
		}

		return EmployeeMapper.mapEntitiesIntoDTOs(list);
	}

	@Override
	public EmployeeDTO findById(Long id) {
		Employee e = employeeRepository.findOne(id);

		e.setDepartment(departmentRepositoryy.findOne(e.getIdDepartment()));

		return EmployeeMapper.mapEntityIntoDTO(e);
	}

	@Override
	public void save(EmployeeDTO employeeDTO) {
		employeeRepository.save(EmployeeMapper.mapDTOIntoEntity(employeeDTO));
	}

	@Override
	public void update(EmployeeDTO employeeDTO) {
		employeeRepository.save(EmployeeMapper.mapDTOIntoEntity(employeeDTO));

	}

	@Override
	public void delete(Long id) {
		employeeRepository.delete(id);
	}

}
