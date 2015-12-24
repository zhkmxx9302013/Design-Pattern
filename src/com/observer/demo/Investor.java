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
		System.out.println("֪ͨ����"+name+stock.getSymbolString()+"���¹ɼ�Ϊ��"+stock.getPrice());
	}
	

}
