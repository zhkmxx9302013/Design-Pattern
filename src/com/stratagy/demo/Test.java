package com.stratagy.demo;
public class Test {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CashContext cc = null;
		double resultMoney = 0.0;
		cc = Swich(1);//正常模式
		resultMoney = cc.GetResult(1000);
		System.out.println(resultMoney);
		cc = Swich(2);//打折
		resultMoney = cc.GetResult(1000);
		System.out.println(resultMoney);
		cc = Swich(3);//返利
		resultMoney = cc.GetResult(1000);
		System.out.println(resultMoney);
	}
	
	public static CashContext Swich(int i) {
		switch (i) {
		case 1:
			return new CashContext(new CashNormal());
		case 2:
			return new CashContext(new CashRebate(0.8));
		case 3:
			return new CashContext(new CashReturn(300, 100));
		default:
			return null;
		}
	}
}
