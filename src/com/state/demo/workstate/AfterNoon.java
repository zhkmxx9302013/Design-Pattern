package com.state.demo.workstate;

public class AfterNoon extends WorkState {

	@Override
	public void writeProgramm(Work work) {
		// TODO Auto-generated method stub
		int currentHour = work.getHour();
		if(currentHour<17){
			System.out.println("��ǰʱ�䣺"+currentHour+",����״̬����ϲ���Ŷ������");
		}else {
			work.setWorkState(new EveningState());
			work.writeProgram();
		}
	}

}
