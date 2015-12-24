package com.factorymethod.demo.phonefactory;

public class SonyFactory implements MobileFactory {

	public SonyFactory() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public  Mobile produceMobile() {
		// TODO Auto-generated method stub
		System.out.println("Sony工厂生产了索尼");
		return new Sony();
	}

}
