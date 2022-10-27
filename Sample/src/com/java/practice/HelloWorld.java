package com.java.practice;

public class HelloWorld {

	private String returnMessage;

	public HelloWorld() {

	}

	public HelloWorld(String incomingMessage) {
		this.returnMessage = incomingMessage;
	}

	public HelloWorld(int v1, int v2) {
		addValues(v1, v2);
	}

	private void addValues(int v101, int v102) {
		int total = v101 + v102;
		System.out.println("Total: " + total);
	}

	public String getReturnMessage() {
		return returnMessage;
	}

	public void setReturnMessage(String returnMessage) {
		this.returnMessage = returnMessage;
	}

	@Override
	public String toString() {
		return "HelloWorld [returnMessage=" + returnMessage + "]";
	}

}
