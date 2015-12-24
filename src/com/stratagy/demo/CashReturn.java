package com.stratagy.demo;

/**
 * ����Ӫ��
 * 
 * @author zhkmx
 * 
 */
public class CashReturn extends CashSuper {
	private double conditionMoney = 0.0;
	private double returnMoney = 0.0;

	public CashReturn(double conditionMoney, double returnMoney) {
		// TODO Auto-generated constructor stub
		this.conditionMoney = conditionMoney;
		this.returnMoney = returnMoney;
	}

	@Override
	public double acceptCash(double money) {
		double result = money;
		// �����ڷ�������������Ҫ��ȥ����ֵ
		if (money >= conditionMoney)
			result = money - Math.floor(money / conditionMoney) * returnMoney;

		return result;

	}

}
