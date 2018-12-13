package com.alfatecsistemas.sihna.repository;

import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.data.repository.CrudRepository;

import com.alfatecsistemas.sihna.model.Employee;

/**
 * employee repository interface
 * 
 * @author danny
 *
 */

public interface EmployeeRepository extends CrudRepository<Employee, Long>, JpaSpecificationExecutor<Employee> {

}
