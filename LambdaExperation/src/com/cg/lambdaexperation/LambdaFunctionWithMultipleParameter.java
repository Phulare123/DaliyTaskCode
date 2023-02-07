package com.cg.lambdaexperation;

public class LambdaFunctionWithMultipleParameter {

	public static void main(String[] args) {

		// without lambda expression
		Add addable = new Add() {
			@Override
			public int add(int a, int b) {
				return a + b;
			}
		};
		addable.add(10, 20);

		// with lambda expression
		// Multiple parameters in lambda expression
		Add withLambda = (a, b) -> (a + b);
		System.out.println(withLambda.add(10, 20));

		// Multiple parameters with data type in lambda expression
		Add withLambdaD = (int a, int b) -> (a + b);
		System.out.println(withLambdaD.add(100, 200));
	}
}
