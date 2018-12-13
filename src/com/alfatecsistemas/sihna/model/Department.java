package com.alfatecsistemas.sihna.model;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnore;

/**
 * @author danny
 * 
 */
@Entity
@Table(name="DEPARTMENT")
public class Department {
	
	@Id
	@Column
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	
	@Column
	private String name;
	
	@JsonIgnore
	@OneToMany(mappedBy = "idDepartment", fetch = FetchType.LAZY)
    private List<Employee> empleadoList;
	
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
	public List<Employee> getEmpleadoList() {
		return empleadoList;
	}
	/**
	 * @param empleadoList
	 */
	public void setEmpleadoList(List<Employee> empleadoList) {
		this.empleadoList = empleadoList;
	}
	
	
}
