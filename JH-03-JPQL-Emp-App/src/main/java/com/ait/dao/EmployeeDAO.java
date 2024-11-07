package com.ait.dao;

import java.util.List;

import com.ait.entity.EmployeeEntity;

public interface EmployeeDAO {
	EmployeeEntity saveEmployee(EmployeeEntity emp);
	
	EmployeeEntity getEmployeeById(Integer empId);
	
	List<EmployeeEntity> getAllEmployee(); 
	
	List<Object[]>  getNameAndSal();
	
}
