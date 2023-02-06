package com.cg.streamapi;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class Employee2Main {
	
	
	public static void main(String[] args) {
		List<Employee2> employeeList = new ArrayList<Employee2>();

		employeeList.add((new Employee2(1, "Ram", 25000f)));
		employeeList.add((new Employee2(2, "Naya", 20000f)));
		employeeList.add((new Employee2(3, "Ravi", 35000f)));
		employeeList.add((new Employee2(4, "Sakshi", 65000f)));
		// Converting product List into Set
		Set<Float> list = employeeList.stream().filter(product -> product.getSalary() < 30000) // filter product on the base
																							// of price
				.map(product -> product.getSalary()).collect(Collectors.toSet()); // collect it as Set(remove duplicate
																				// elements)
		System.out.println("Employee Salary:" + list);

	}
}
