package com.state.demo.ColorPushPull;

public class BlueState extends ColorState {

	@Override
	public void pull(Context c) {
		// TODO Auto-generated method stub
		String currentColor = c.getColor();
		if(currentColor.equals("blue")){
			c.setColorState(new RedState());
			c.setColor("red");
			System.out.println("pull:blue->red");
		}
	}

	@Override
	public void push(Context c) {
		// TODO Auto-generated method stub
		String currentColor = c.getColor();
		if(currentColor.equals("bule")){
			c.setColorState(new GreenState());
			c.setColor("green");
			System.out.println("push:blue->green");
		}
	}
}
