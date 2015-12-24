package com.state.demo.workstate;

public class EveningState extends WorkState {

	@Override
	public void writeProgramm(Work work) {
		// TODO Auto-generated method stub
		int currentHour = work.getHour();
		if(work.isWorkFinished()){
			work.setWorkState(new RestState());
			work.writeProgram();
		}else {
			if(currentHour<21){
				System.out.println("当前时间："+currentHour+",加班累屁了~！！");
			}else {
				work.setWorkState(new SleepingState());
			}
		}
	}

}
