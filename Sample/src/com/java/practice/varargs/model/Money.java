package com.java.practice.varargs.model;

public class Money {
	private float totalDeposit ;
	private float interstPaid;
	private float commission;
	
	

	public float getTotalDeposit() {
		return totalDeposit;
	}

	public void setTotalDeposit(float totalDeposit) {
		this.totalDeposit = totalDeposit;
	}

	public float getInterstPaid() {
		return interstPaid;
	}

	public void setInterstPaid(float interstPaid) {
		this.interstPaid = interstPaid;
	}

	public float getCommission() {
		return commission;
	}

	public void setCommission(float commission) {
		this.commission = commission;
	}

	@Override
	public String toString() {
		return "Money [totalDeposit=" + totalDeposit + ", interstPaid=" + interstPaid + ", commission=" + commission
				+ "]";
	}
}
