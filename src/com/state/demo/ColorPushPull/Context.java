package com.state.demo.ColorPushPull;

public class Context {
	private ColorState colorState;
	private String color;
	public Context() {
		this.colorState = new RedState();
	}
	
	public ColorState getColorState() {
		return colorState;
	}
	public void setColorState(ColorState colorState) {
		this.colorState = colorState;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	
	public void push(){
		colorState.push(this);
	}
	public void pull(){
		colorState.pull(this);
	}
}
