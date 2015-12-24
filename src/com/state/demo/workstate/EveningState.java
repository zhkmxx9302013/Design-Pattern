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
				System.out.println("��ǰʱ�䣺"+currentHour+",�Ӱ���ƨ��~����");
			}else {
				work.setWorkState(new SleepingState());
			}
		}
	}

}
