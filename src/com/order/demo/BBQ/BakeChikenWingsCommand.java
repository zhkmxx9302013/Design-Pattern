package com.order.demo.BBQ;

public class BakeChikenWingsCommand extends Command {

	public BakeChikenWingsCommand(Barbecuer barbecuer) {
		super(barbecuer);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void ExcuteCommand() {
		// TODO Auto-generated method stub
		this.getBarbecuer().BakeChikenWings();
	}

}
