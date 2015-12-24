package com.state.demo.workstate;

public class MorningState extends WorkState {
	
	@Override
	public void writeProgramm(Work work) {
		// TODO Auto-generated method stub
		int currentHour = work.getHour();
		if(currentHour<12){
			System.out.println("当前时间:"+currentHour+"上午工作好爽哦！！");
		}else{
			work.setWorkState(new NoonState());
			work.writeProgram();
		}
	}

}
