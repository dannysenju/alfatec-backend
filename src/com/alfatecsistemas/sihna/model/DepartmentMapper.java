package com.alfatecsistemas.sihna.model;

import static java.util.stream.Collectors.toList;

import java.util.List;

import com.alfatecsistemas.sihna.dto.DepartmentDTO;

/**
 * class that allows you to convert a department entity into a department DTO
 * 
 * @author danny
 *
 */
public final class DepartmentMapper {

	/**
	 * map a list of entities in a DTO list
	 * 
	 * @param entities
	 * @return
	 */
	public static List<DepartmentDTO> mapEntitiesIntoDTOs(List<Department> entities) {
		return entities.stream().map(DepartmentMapper::mapEntityIntoDTO).collect(toList());
	}

	/**
	 * map a department entity in a department DTO
	 * 
	 * @param entity
	 * @return
	 */
	public static DepartmentDTO mapEntityIntoDTO(Department entity) {
		DepartmentDTO dto = new DepartmentDTO();
		dto.setId(entity.getId());
		dto.setName(entity.getName());
		return dto;
	}

	/**
	 * map a department DTO in a department entity
	 * 
	 * @param dto
	 * @return
	 */
	public static Department mapDTOIntoEntity(DepartmentDTO dto) {
		Department entity = new Department();
		entity.setId(dto.getId());
		entity.setName(dto.getName());
		return entity;
	}

}
