package com.state.demo.ColorPushPull;

public class BlackState extends ColorState {

	@Override
	public void pull(Context c) {
		// TODO Auto-generated method stub
		String currentColor = c.getColor();
		if(currentColor.equals("black")){
			c.setColorState(new BlueState());
			c.setColor("green");
			System.out.println("pull:black->green");
		}
	}

	@Override
	public void push(Context c) {
		// TODO Auto-generated method stub
		String currentColor = c.getColor();
		if(currentColor.equals("black")){
			c.setColorState(new RedState());
			c.setColor("red");
			System.out.println("push:black->red");
		}
	}

}
