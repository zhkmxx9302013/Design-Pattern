package com.state.demo.ColorPushPull;

public class RedState extends ColorState{
	
	@Override
	public void pull(Context c) {
		// TODO Auto-generated method stub
		String currentColor = c.getColor();
		if(currentColor.equals("red")){
			c.setColorState(new GreenState());
			c.setColor("green");
			System.out.println("pull:red->green");
		}
	}

	@Override
	public void push(Context c) {
		// TODO Auto-generated method stub
		String currentColor = c.getColor();
		if(currentColor.equals("red")){
			c.setColorState(new BlueState());
			c.setColor("blue");
			System.out.println("push:red->blue");
		}
	}

}
