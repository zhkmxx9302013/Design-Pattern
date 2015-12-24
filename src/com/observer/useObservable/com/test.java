package com.observer.useObservable.com;

import java.util.Observable;

public class test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Stock stock = new Stock("Hengda", 20.66);
		Investor investor1 = new Investor("ÕÔ×ÓºØ");
		Investor investor2 = new Investor("³ÂÒ»Ãù");
		stock.addObserver(investor1);
		stock.addObserver(investor2);
		stock.setPrice(50);
		stock.setPrice(20);
		stock.setStockname("Hnegdayy");
	}

}
