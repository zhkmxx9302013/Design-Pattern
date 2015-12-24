package com.abstractfactory.demo.computer;

public class MainBoardMSI implements MainBoard {

	@Override
	public void Attach(Cpu cpu) throws Exception {
		// TODO Auto-generated method stub
		if (cpu.getClass().toString().equals("Intel")) {
			System.out.println("MainBoardMSI with Intel CPU");
		}
	}
}
