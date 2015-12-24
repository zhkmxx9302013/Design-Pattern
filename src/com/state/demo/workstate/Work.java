package com.state.demo.workstate;

public class Work {
	private int hour;
	private boolean isWorkFinished;
	private WorkState workState;
	public Work() {
		// TODO Auto-generated constructor stub
		this.workState = new MorningState();
	}
	public int getHour() {
		return hour;
	}
	public void setHour(int hour) {
		this.hour = hour;
	}
	public boolean isWorkFinished() {
		return isWorkFinished;
	}
	public void setWorkFinished(boolean isWorkFinished) {
		this.isWorkFinished = isWorkFinished;
	}
	public WorkState getWorkState() {
		return workState;
	}
	public void setWorkState(WorkState workState) {
		this.workState = workState;
	}
	
	public void writeProgram(){
		workState.writeProgramm(this);
	}
}
