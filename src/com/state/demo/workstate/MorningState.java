package com.state.demo.workstate;

public class MorningState extends WorkState {
	
	@Override
	public void writeProgramm(Work work) {
		// TODO Auto-generated method stub
		int currentHour = work.getHour();
		if(currentHour<12){
			System.out.println("��ǰʱ��:"+currentHour+"���繤����ˬŶ����");
		}else{
			work.setWorkState(new NoonState());
			work.writeProgram();
		}
	}

}
