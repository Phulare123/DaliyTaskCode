package com.cg.streamapi;

public class Employee2 {
	
	 private int id;  
	  private String name;  
	 private float Salary;
		public Employee2(int id, String name, float salary) {
			super();
			this.id = id;
			this.name = name;
			Salary = salary;
		}
		public int getId() {
			return id;
		}
		public void setId(int id) {
			this.id = id;
		}
		public String getName() {
			return name;
		}
		public void setName(String name) {
			this.name = name;
		}
		public float getSalary() {
			return Salary;
		}
		public void setSalary(float salary) {
			Salary = salary;
		}  

}
