package com.factorymethod.demo.phonefactory;

public class SonyFactory implements MobileFactory {

	public SonyFactory() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public  Mobile produceMobile() {
		// TODO Auto-generated method stub
		System.out.println("Sony��������������");
		return new Sony();
	}

}
