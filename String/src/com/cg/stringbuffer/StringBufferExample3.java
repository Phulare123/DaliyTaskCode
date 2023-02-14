package com.cg.stringbuffer;

public class StringBufferExample3 {
	public static void main(String[] args) {
		StringBuffer sb = new StringBuffer("Java");

		sb.append(" programing"); // append a string

		System.out.println(sb); // output: "hello world"

		sb.insert(5, ","); // insert a character at index 5

		System.out.println(sb); // output: "hello, world"

		sb.delete(5, 6); // delete a character at index 5
		System.out.println(sb); // output: "hello world"
		sb.reverse(); // reverse the order of characters
		System.out.println(sb); // 

	}
}
