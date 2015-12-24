package com.abstractfactory.demo.computer;

public class IBM extends ComputerFactory{
	public IBM() {
		// TODO Auto-generated constructor stub
		setCpu(new Intel());
		setHardDisk(new WestData());
		setMainBoard(new MainBoardMSI());
	}
}
