package com.cg.streamapi;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class EmployeeMain {
	
	public static void main(String[] args) {
		   List<Employee> employeeList = new ArrayList<Employee>();  
		   
		   employeeList.add((new Employee(1,"Ram",25000f)));
		   employeeList.add((new Employee(2,"Naya",20000f)));
		   employeeList.add((new Employee(3,"Ravi",35000f)));
		   employeeList.add((new Employee(4,"Sakshi",65000f)));
		   
		   List<Float> employeeList2 =employeeList.stream()  
                   .filter(p -> p.Salary > 25000f)  
                   .map(p->p.Salary)         
                   .collect(Collectors.toList());  
System.out.println(employeeList);  
	}

}
