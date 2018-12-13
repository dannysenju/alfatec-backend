package com.alfatecsistemas.sihna.specs;

import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Join;
import javax.persistence.criteria.Predicate;
import javax.persistence.criteria.Root;
import javax.persistence.criteria.Subquery;

import org.springframework.data.jpa.domain.Specification;

import com.alfatecsistemas.sihna.model.Department;
import com.alfatecsistemas.sihna.model.Department_;
import com.alfatecsistemas.sihna.model.Employee;
import com.alfatecsistemas.sihna.model.Employee_;

/**
 * JPA specification for employee
 * 
 * @author danny
 *
 */
public class EmployeeSpecs {

	/**
	 * get employee by id
	 * 
	 * @param id
	 * @return
	 */
	public static Specification<Employee> getEmployeeByIdSpec(Long id) {
		return new Specification<Employee>() {
			@Override
			public Predicate toPredicate(Root<Employee> root, CriteriaQuery<?> query, CriteriaBuilder criteriaBuilder) {
				Predicate equalPredicate = criteriaBuilder.equal(root.get(Employee_.id), id);
				return equalPredicate;
			}
		};
	}

	/**
	 * get employee filter by department id
	 * 
	 * @param idDepartment
	 * @return
	 */
	public static Specification<Employee> getEmployeeFilterByDepartment(final Long idDepartment) {
		return (root, cq, cb) -> {
			final Subquery<Long> departmentQuery = cq.subquery(Long.class);
			final Root<Department> department = departmentQuery.from(Department.class);

			final Join<Department , Employee> employees = department.join(Department_.empleadoList);

			departmentQuery.select(employees.get(Employee_.id));
			
			departmentQuery.where(cb.equal(department.get(Department_.id), idDepartment));

			return cb.in(root.get("id")).value(departmentQuery);
		};
	}

}
