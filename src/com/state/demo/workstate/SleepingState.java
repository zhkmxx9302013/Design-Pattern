package com.state.demo.workstate;

public class SleepingState extends WorkState {

	@Override
	public void writeProgramm(Work work) {
		// TODO Auto-generated method stub
		System.out.println("��ǰʱ��:"+work.getHour()+"���������������ˡ�������˯��");
	}

}
