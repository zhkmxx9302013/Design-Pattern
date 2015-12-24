package com.observer.demo;

import java.util.Observable;

public class Test extends Observable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Investor s = new Investor( "张三" );
		Investor b = new Investor( "李四" );
		HengDa hengda = new HengDa( "HnegDa", 120.00 );
		hengda.Attach(s);
		hengda.Attach(b);
		hengda.setPrice(120.10);
		hengda.Notify();
		hengda.setPrice(121.10);
		hengda.Notify();
		hengda.setPrice(120.50);
		hengda.Notify();
		hengda.setPrice(120.70);
		hengda.Notify();
		
	}

}
