package com.FuncPointer.demo;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Utilities u = new Utilities();
		System.out.println(Utilities.compare(9, 4, new IntegerComparetor()));
		System.out.println(Utilities.compare(9, 4, new StringComparetor()));
	}	

}
