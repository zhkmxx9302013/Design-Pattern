package com.observer.demo;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.attachment.AttachmentMarshaller;
public abstract class Stock {
	protected String symbolString;
	protected double price;
	private List<Investor> investors = new ArrayList<Investor>();
	public String getSymbolString() {
		return symbolString;
	}
	public void setSymbolString(String symbolString) {
		this.symbolString = symbolString;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public Stock(String symbol,double price) {
		// TODO Auto-generated constructor stub
		this.symbolString = symbol;
		this.price = price;
	}
	public void Attach(Investor investor){
		investors.add(investor);
	}
	public void Detach(Investor investor){
		investors.remove(investor);
	}
	public void Notify(){
		for(Investor investor:investors){
			investor.Update(this);
		}
	}
}
