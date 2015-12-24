package com.state.demo.workstate;

public class NoonState extends WorkState {

	@Override
	public void writeProgramm(Work work) {
		// TODO Auto-generated method stub
		int currentHour = work.getHour();
		if(currentHour<13){
			System.out.println("当前时间："+currentHour+",饿了困了吃饭睡觉");
		}else {
			work.setWorkState(new AfterNoon());
			work.writeProgram();
		}
	}

}
