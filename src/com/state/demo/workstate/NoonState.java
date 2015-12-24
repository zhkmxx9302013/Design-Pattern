package com.state.demo.workstate;

public class NoonState extends WorkState {

	@Override
	public void writeProgramm(Work work) {
		// TODO Auto-generated method stub
		int currentHour = work.getHour();
		if(currentHour<13){
			System.out.println("��ǰʱ�䣺"+currentHour+",�������˳Է�˯��");
		}else {
			work.setWorkState(new AfterNoon());
			work.writeProgram();
		}
	}

}
