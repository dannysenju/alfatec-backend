package com.alfatecsistemas.sihna.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnore;

/**
 * @author danny
 *
 */
@Entity
@Table(name="EMPLOYEE")
public class Employee {

	@Id
	@Column
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;

	@Column
	private String name;
	
	@Column(name="last_name")
	private String lastName;
	
	@Column(name="id_department")
	private Long idDepartment;
	
	
	@JoinColumn(name = "id_department", referencedColumnName = "id", insertable=false, updatable=false)
	@OneToOne(fetch = FetchType.LAZY)
	@JsonIgnore
	private Department department;

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

	/**
	 * @return
	 */
	public String getLastName() {
		return lastName;
	}

	/**
	 * @param lastName
	 */
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	/**
	 * @return
	 */
	public Long getIdDepartment() {
		return idDepartment;
	}

	/**
	 * @param idDepartment
	 */
	public void setIdDepartment(Long idDepartment) {
		this.idDepartment = idDepartment;
	}

	/**
	 * @return
	 */
	public Department getDepartment() {
		return department;
	}

	/**
	 * @param department
	 */
	public void setDepartment(Department department) {
		this.department = department;
	}

}
