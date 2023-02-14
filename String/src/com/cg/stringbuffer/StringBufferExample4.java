package com.cg.stringbuffer;

public class StringBufferExample4 {

	public static void main(String[] args) {

		// Create a new StringBuffer object
		StringBuffer sb = new StringBuffer("Hello, World!");

		// Use some of the main methods of the StringBuffer class
		sb.append(" How are you?"); // append a string to the end
		sb.insert(7, "there, "); // insert a string at a given index
		sb.delete(13, 16); // delete a substring from a given range of indices
		sb.reverse(); // reverse the order of the characters

		// Output the final result
		System.out.println(sb.toString());

	}
}
