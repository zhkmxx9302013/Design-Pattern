package com.observer.demo;

public class Investor implements IInvestor {

	private String name;
	private String observerState;
	private Stock stock;

	public Investor(String name) {
		// TODO Auto-generated constructor stub
		this.name = name;
	}

	@Override
	public void Update(Stock stock) {
		// TODO Auto-generated method stub
		System.out.println("通知股民"+name+stock.getSymbolString()+"最新股价为："+stock.getPrice());
	}
	

}
