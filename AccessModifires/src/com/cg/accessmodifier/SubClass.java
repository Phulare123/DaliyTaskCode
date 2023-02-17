package com.cg.accessmodifier;

public class SubClass extends Student {
	
	public static void main(String[] args) {
		new SubClass().test();
		
	}

	private void test() {
		System.out.println(rollNumber);
		
	}

}
