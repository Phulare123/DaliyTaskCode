package com.cg.streamapi;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Employee1Main {
	
	public static void main(String[] args) {
		   List<Employee> employeeList = new ArrayList<Employee>();  
		   
		   employeeList.add((new Employee(1,"Ram",25000f)));
		   employeeList.add((new Employee(2,"Naya",20000f)));
		   employeeList.add((new Employee(3,"Ravi",35000f)));
		   employeeList.add((new Employee(4,"Sakshi",65000f)));
		   
		   
		   // Converting Product List into a Map  
		   Map<Integer,String> employeeSalary =employeeList.stream().collect(Collectors.toMap(p->p.id, p->p.name));  
	              
	        System.out.println(employeeSalary);  
			}

}
