package com.state.demo.ColorPushPull;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Context context = new Context();
		context.setColor("red");
		context.pull();
		context.pull();
		context.pull();
		context.pull();
		context.push();
		context.push();
		context.pull();
		context.pull();
		context.push();
		context.push();
		context.push();
		context.push();
		context.push();
		context.pull();
		context.pull();
		context.push();
		context.push();
		
	}

}
