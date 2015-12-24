package com.stratagy.demo;

public class CashContext {
	private CashSuper cashSuper;
	public CashContext(CashSuper cashSuper) {
		// TODO Auto-generated constructor stub
		this.cashSuper = cashSuper;
	}
	public double GetResult(double money) {
		return cashSuper.acceptCash(money);
	}
}
