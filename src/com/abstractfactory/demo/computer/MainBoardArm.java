package com.abstractfactory.demo.computer;

public class MainBoardArm implements MainBoard {

	@Override
	public void Attach(Cpu cpu) throws Exception {
		// TODO Auto-generated method stub
		if(cpu.getClass().toString().equals("AMD")){
			System.out.println("MainBoardArm with AMD CPU");
		}
	}

}
