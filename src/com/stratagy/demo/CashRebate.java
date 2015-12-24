package com.stratagy.demo;

public class CashRebate extends CashSuper {
	private double rate = 0.0;
	public CashRebate(double rate) {
		// TODO Auto-generated constructor stub
		this.rate = rate;
	}

	@Override
	public double acceptCash(double money) {
		// TODO Auto-generated method stub
		
		return money*rate;
	}

}
