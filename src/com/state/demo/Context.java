package com.state.demo;

public class Context {
	private State state;

	public Context(State state) {
		// TODO Auto-generated constructor stub
		this.state = state;
	}
	
	public State getState() {
		return state;
	}

	public void setState(State state) {
		this.state = state;
		System.out.println("µ±Ç°×´Ì¬£º"+state.getClass().getName().toString());
	}
	
	public void Request(){
		state.Handle(this);
	}
}
