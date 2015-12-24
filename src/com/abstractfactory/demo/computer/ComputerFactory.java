package com.abstractfactory.demo.computer;

import java.util.concurrent.ForkJoinPool.ManagedBlocker;

public abstract class ComputerFactory {
	private Cpu cpu = null;
	private HardDisk hardDisk = null;
	private MainBoard mainBoard = null;
	
	public Cpu getCpu() {
		return cpu;
	}

	public void setCpu(Cpu cpu) {
		this.cpu = cpu;
	}

	public HardDisk getHardDisk() {
		return hardDisk;
	}

	public void setHardDisk(HardDisk hardDisk) {
		this.hardDisk = hardDisk;
	}

	public MainBoard getMainBoard() {
		return mainBoard;
	}

	public void setMainBoard(MainBoard mainBoard) {
		this.mainBoard = mainBoard;
	}

	public void show()
	{
        System.out.println(this.getClass().getName() .toString () + "生产的电脑配置");
        System.out.println ("cpu:" + cpu.getCpu());
        System.out.println ("HardDisk:" + hardDisk.getSize());
        System.out.print ("MainBoard:");
        try {
			mainBoard.Attach(cpu);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
