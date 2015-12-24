package com.abstractfactory.demo.computer;

public class Dell extends ComputerFactory {
	public Dell() {
		// TODO Auto-generated constructor stub
		setCpu(new AMD());
		this.setHardDisk(new SanDisk());
		setMainBoard(new MainBoardArm());
	}
}
