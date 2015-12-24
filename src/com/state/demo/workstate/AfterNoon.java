package com.state.demo.workstate;

public class AfterNoon extends WorkState {

	@Override
	public void writeProgramm(Work work) {
		// TODO Auto-generated method stub
		int currentHour = work.getHour();
		if(currentHour<17){
			System.out.println("当前时间："+currentHour+",下午状态嘛，哎呦不错哦！！！");
		}else {
			work.setWorkState(new EveningState());
			work.writeProgram();
		}
	}

}
