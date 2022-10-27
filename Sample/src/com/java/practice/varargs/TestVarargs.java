package com.java.practice.varargs;

public class TestVarargs {

	public static void main(String[] args) {
		Varargs varargs = new Varargs();
		int total = 0;

		total = varargs.addAllValues(7, 8, -10, 56, 9);
		varargs.printTotal(total);

		total = varargs.addAllValues(-232);
		varargs.printTotal(total);

		total = varargs.addAllValues();
		varargs.printTotal(total);
	}

}
