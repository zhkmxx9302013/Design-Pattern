package com.order.demo.BBQ;

public class Client {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Barbecuer boyBarbecuer = new Barbecuer();
		Command bakeMutton1 = new BakeMuttonCommand(boyBarbecuer);
		Command bakeMutton2 = new BakeMuttonCommand(boyBarbecuer);
		Command bakeMutton3 = new BakeMuttonCommand(boyBarbecuer);
		Command bakeMutton4 = new BakeMuttonCommand(boyBarbecuer);
		Command bakeChikenWings1 = new BakeChikenWingsCommand(boyBarbecuer);
		
		Waiter girWaiter = new Waiter();
		
		girWaiter.setOrderInList(bakeMutton1);
		girWaiter.setOrderInList(bakeMutton2);
		girWaiter.setOrderInList(bakeMutton3);
		girWaiter.setOrderInList(bakeMutton4);
		girWaiter.setOrderInList(bakeChikenWings1);
		
		girWaiter.cancelOrderFromList(bakeMutton1);
		girWaiter.NotifyAll();
	}

}
