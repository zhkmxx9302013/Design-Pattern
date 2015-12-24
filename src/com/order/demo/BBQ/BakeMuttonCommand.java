package com.order.demo.BBQ;

public class BakeMuttonCommand extends Command {

	public BakeMuttonCommand(Barbecuer barbecuer) {
		super(barbecuer);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void ExcuteCommand() {
		// TODO Auto-generated method stub
		this.getBarbecuer().BakeMutton();
	}

}
