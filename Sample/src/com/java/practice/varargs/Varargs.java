package com.java.practice.varargs;

public class Varargs {
	public static void main(String args[]) {

	}

	public int addAllValues(int... vals) {

		System.out.println("Passed Values length: " + vals.length);
		int total = 0;

		if (!(vals == null)) {
			for (int val : vals) {
				total += val;
			}
		}
		return total;
	}

	public void printTotal(int total) {
		System.out.println("Total: " + total);
	}

}
