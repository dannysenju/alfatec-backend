package com.alfatecsistemas.sihna.repository;

import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.data.repository.CrudRepository;

import com.alfatecsistemas.sihna.model.Department;

/**
 * department repository interface
 * 
 * @author danny
 */
public interface DepartmentRepository extends CrudRepository<Department, Long>, JpaSpecificationExecutor<Department> {

}
