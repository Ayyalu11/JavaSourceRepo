package com.java.practice.varargs;

import com.java.practice.varargs.model.Money;

public class TestAddMoney {

	public static void main(String[] args) {

		AddMoney addMoney = new AddMoney();

		Money myMoney = new Money();

		SaveToDB mySaveToDb = new SaveToDB();

		myMoney = addMoney.addMoneyToObject(2.4f, 5, 21f, -10f, 33f, 5.6f, 78f);
		// System.out.println(myMoney.toString());
		String message = mySaveToDb.saveYourData(myMoney.getTotalDeposit(), myMoney.getInterstPaid(),
				myMoney.getCommission());
		System.out.println(message);

		myMoney = addMoney.addMoneyToObject(1.2f, 5);
		// System.out.println(myMoney.toString());
		message = mySaveToDb.saveYourData(myMoney.getTotalDeposit(), myMoney.getInterstPaid(), myMoney.getCommission());
		System.out.println(message);

		myMoney = addMoney.addMoneyToObject(1.1f, 4, 20.80f, 50.00f, 87.73f);
		// System.out.println(myMoney.toString());
		message = mySaveToDb.saveYourData(myMoney.getTotalDeposit(), myMoney.getInterstPaid(), myMoney.getCommission());
		System.out.println(message);

	}

}
