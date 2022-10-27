package com.java.practice.varargs;

import com.java.practice.varargs.model.Money;

public class AddMoney {

	public Money addMoneyToObject(float irate, int months, float... vals) {

		Money money = new Money();

		float total = 0;
		float totalInterst = 0;
		float totalCommission = 0;

		for (float val : vals) {
			total = total + val;
		}

		totalInterst = (total * months * irate) / 100;

		totalCommission = (total) / 100f;

		money.setTotalDeposit(total);
		money.setInterstPaid(totalInterst);
		money.setCommission(totalCommission);

		return money;
	}

}
