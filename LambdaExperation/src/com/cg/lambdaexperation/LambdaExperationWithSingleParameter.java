package com.cg.lambdaexperation;
// lambda function with single example
public class LambdaExperationWithSingleParameter {

	public static void main(String[] args) {
		// without lambda expression
		Printable printable = new Printable() {
			@Override
			public void print(String msg) {
				System.out.println(msg);
			}
		};
		printable.print(" Print msg");

		// with lambda expression
		Printable withLambda = (msg) -> System.out.println(msg);
		withLambda.print(" print msg");
	}

}
