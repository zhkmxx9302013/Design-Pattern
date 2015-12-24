package com.state.demo;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Context context = new Context(new ConcreteStateA());
		
		context.Request();
		context.Request();
		context.Request();
		context.Request();
	}

}
