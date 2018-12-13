package com.alfatecsistemas.sihna.model;

import static java.util.stream.Collectors.toList;

import java.util.List;

import com.alfatecsistemas.sihna.dto.DepartmentDTO;
import com.alfatecsistemas.sihna.dto.EmployeeDTO;

/**
 * class that allows you to convert a employee entity into a employee DTO
 * 
 * @author danny
 *
 */
public final class EmployeeMapper {

	/**
	 * map a list of entities in a DTO list
	 * 
	 * @param entities
	 * @return
	 */
	public static List<EmployeeDTO> mapEntitiesIntoDTOs(List<Employee> entities) {
		return entities.stream().map(EmployeeMapper::mapEntityIntoDTO).collect(toList());
	}

	/**
	 * map a employee entity in a employee DTO
	 * 
	 * @param entity
	 * @return
	 */
	public static EmployeeDTO mapEntityIntoDTO(Employee entity) {
		EmployeeDTO dto = new EmployeeDTO();
		dto.setId(entity.getId());
		dto.setName(entity.getName());
		dto.setLastName(entity.getLastName());
		DepartmentDTO dptDTo = new DepartmentDTO();
		dptDTo.setId(entity.getIdDepartment());
		dptDTo.setName(entity.getDepartment().getName());
		dto.setDepartmentDTO(dptDTo);
		
		return dto;
	}

	/**
	 * map a employee DTO in a employee entity
	 * 
	 * @param dto
	 * @return
	 */
	public static Employee mapDTOIntoEntity(EmployeeDTO dto) {
		Employee entity = new Employee();
		entity.setId(dto.getId());
		entity.setName(dto.getName());
		entity.setLastName(dto.getLastName());
		entity.setIdDepartment(dto.getDepartmentDTO().getId());

		return entity;
	}

}
