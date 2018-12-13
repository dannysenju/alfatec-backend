package com.alfatecsistemas.sihna.specs;

import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Predicate;
import javax.persistence.criteria.Root;

import org.springframework.data.jpa.domain.Specification;

import com.alfatecsistemas.sihna.model.Department;
import com.alfatecsistemas.sihna.model.Department_;

/**
 * JPA specification for department
 * 
 * @author danny
 *
 */
public class DepartmentSpecs {

	/**
	 * get a department by name
	 * 
	 * @param name
	 * @return
	 */
	public static Specification<Department> getDepartmentByNameSpec(String name) {
		return new Specification<Department>() {
			@Override
			public Predicate toPredicate(Root<Department> root, CriteriaQuery<?> query,
					CriteriaBuilder criteriaBuilder) {
				Predicate equalPredicate = criteriaBuilder.equal(root.get(Department_.name), name);
				return equalPredicate;
			}
		};
	}

	/**
	 * get a department by id
	 * 
	 * @param id
	 * @return
	 */
	public static Specification<Department> getDepartmentByIdSpec(Long id) {
		return new Specification<Department>() {
			@Override
			public Predicate toPredicate(Root<Department> root, CriteriaQuery<?> query,
					CriteriaBuilder criteriaBuilder) {
				Predicate equalPredicate = criteriaBuilder.equal(root.get(Department_.id), id);
				return equalPredicate;
			}
		};
	}

}
