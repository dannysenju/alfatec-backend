package com.alfatecsistemas.sihna.model;

import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@StaticMetamodel(Employee.class)
public class Employee_ {

	public static volatile SingularAttribute<Employee, Long> id;

	public static volatile SingularAttribute<Employee, String> name;

	public static volatile SingularAttribute<Employee, String> lastName;

	public static volatile SingularAttribute<Employee, Department> department;

	public static volatile SingularAttribute<Employee, Long> idDepartment;

}
