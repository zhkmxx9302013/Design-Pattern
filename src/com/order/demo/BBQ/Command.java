package com.order.demo.BBQ;

public abstract class Command {
	private Barbecuer barbecuer;
	
	public Command(Barbecuer barbecuer) {
		// TODO Auto-generated constructor stub
		this.barbecuer = barbecuer;
	}
	/******************/
	public abstract void ExcuteCommand();
	/******************/
	public Barbecuer getBarbecuer() {
		return barbecuer;
	}
	public void setBarbecuer(Barbecuer barbecuer) {
		this.barbecuer = barbecuer;
	}


	
}
