package com.observer.useObservable.com;
import java.util.Observable;
/**
 * 被观察者,一支股票
 * Concrete subject
 * @author zhkmx
 *
 */
public class Stock extends Observable {
	private String stockname;
	private double price;
	
	public Stock(String stockname, double price) {
		// TODO Auto-generated constructor stub
		this.stockname = stockname;
		this.price = price;
	}
	public String getStockname() {
		return stockname;
	}
	public void setStockname(String stockname) {
		this.stockname = stockname;
		setChanged();
		notifyObservers(stockname);
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
		setChanged();
		notifyObservers(new Double(price));
	}
}
