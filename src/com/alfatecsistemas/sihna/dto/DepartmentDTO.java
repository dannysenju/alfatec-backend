package com.alfatecsistemas.sihna.dto;

/**
 * dto to support the entity Department
 * 
 * @author danny
 */
public class DepartmentDTO {

	private Long id;

	private String name;

	/**
	 * @return
	 */
	public Long getId() {
		return id;
	}

	/**
	 * @param id
	 */
	public void setId(Long id) {
		this.id = id;
	}

	/**
	 * @return
	 */
	public String getName() {
		return name;
	}

	/**
	 * @param name
	 */
	public void setName(String name) {
		this.name = name;
	}
}
