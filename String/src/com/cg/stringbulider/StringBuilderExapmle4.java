package com.cg.stringbulider;

public class StringBuilderExapmle4 {
	public static void main(String[] args) {

        // create object for StringBuilder 
		StringBuilder str = new StringBuilder("java Programm");

		// add more string to StringBuilder
		str.append("WebTech");

		// print capacity
		System.out.println("Capacity before " + "applying trimToSize() = " + str.capacity());

		// applying trimToSize() Method
		str.trimToSize();

		// print string
		System.out.println("String = " + str.toString());

		// print capacity
		System.out.println("Capacity after" + " applying trimToSize() = " + str.capacity());
	}
}
