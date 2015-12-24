package com.state.demo.workstate;

public class SleepingState extends WorkState {

	@Override
	public void writeProgramm(Work work) {
		// TODO Auto-generated method stub
		System.out.println("当前时间:"+work.getHour()+"，不行了困死爹了。。！！睡死");
	}

}
