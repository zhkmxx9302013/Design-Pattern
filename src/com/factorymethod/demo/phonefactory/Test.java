package com.factorymethod.demo.phonefactory;

public class Test {
	public static void main(String[] args) {
		MobileFactory mFactory = null;
		Mobile mobile = null;
		
		mFactory = new SonyFactory();
		mobile = mFactory.produceMobile();
		mobile.call();
		
		mFactory = new SumsungFactory();
		mobile = mFactory.produceMobile();
		mobile.call();
	}
}
