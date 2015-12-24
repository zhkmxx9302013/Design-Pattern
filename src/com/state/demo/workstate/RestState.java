package com.state.demo.workstate;

public class RestState extends WorkState {

	@Override
	public void writeProgramm(Work work) {
		// TODO Auto-generated method stub
		System.out.println("当前时间："+work.getHour()+",完成任务下班回家了");
	}

}
