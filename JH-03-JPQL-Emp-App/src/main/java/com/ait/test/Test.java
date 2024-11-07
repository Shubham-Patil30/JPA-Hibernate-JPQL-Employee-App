package com.ait.test;

import java.util.List;

import com.ait.dao.EmployeeDAO;
import com.ait.dao.impl.EmployeeDAOImpl;
import com.ait.entity.EmployeeEntity;

public class Test {

	public static void main(String[] args) {
		EmployeeEntity emp = new EmployeeEntity(); 
		EmployeeDAO dao = new EmployeeDAOImpl(); 
		
//		emp.setEmpNo(101);
//		emp.setEmpName("shubham");
//		emp.setDeptNo(1);
//		emp.setSalary(50000.00);
//		
//		EmployeeEntity emp1 = new EmployeeEntity(); 
//		emp1.setEmpNo(102);
//		emp1.setEmpName("Rahul");
//		emp1.setDeptNo(2);
//		emp1.setSalary(40000.00);
		
//		dao.saveEmployee(emp);
//		dao.saveEmployee(emp1);
//		
		EmployeeEntity e1 =  dao.getEmployeeById(101);
		System.out.println(e1);
		
		List<EmployeeEntity> empList = dao.getAllEmployee(); 
		
		for (EmployeeEntity employee : empList) {
			System.out.println(employee);
		}
		
		List<Object[]>  l2 = dao.getNameAndSal(); 
		for (Object[] objects : l2) {
			System.out.println("NAME: "+objects[0]+ "SAL: "+objects[1]);
		}

	}

}
