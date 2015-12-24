package com.state.demo.ColorPushPull;

public class GreenState extends ColorState {

	@Override
	public void pull(Context c) {
		// TODO Auto-generated method stub
		String currentColor = c.getColor();
		if(currentColor.equals("green")){
			c.setColorState(new BlueState());
			c.setColor("blue");
			System.out.println("pull:green->blue");
		}
	}

	@Override
	public void push(Context c) {
		// TODO Auto-generated method stub
		String currentColor = c.getColor();
		if(currentColor.equals("green")){
			c.setColorState(new BlackState());
			c.setColor("black");
			System.out.println("push:green->black");
		}
	}

}
