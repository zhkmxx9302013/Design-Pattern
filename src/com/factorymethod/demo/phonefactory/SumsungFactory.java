/**
 * 
 */
package com.factorymethod.demo.phonefactory;

/**
 * @author zhkmx
 * 
 */
public class SumsungFactory implements MobileFactory {

	public SumsungFactory() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public  Mobile produceMobile() {
		// TODO Auto-generated method stub
		System.out.println("Sumsung��������������");
		return new Sumsung();
	}

}
