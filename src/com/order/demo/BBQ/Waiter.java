package com.order.demo.BBQ;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Waiter {
	List<Command> orderList = new ArrayList<Command>();
	
	public void setOrderInList(Command command){
		//System.out.println(command.getClass().getName());
		if(command.getClass().getName().equals("com.order.demo.BBQ.BakeMuttonCommand")){
			orderList.add(command);
			Date date = new Date();
			System.out.println("增加订单："+GetName(command)+",时间："+date.toGMTString());
		}
		if(command.getClass().getName().equals("com.order.demo.BBQ.BakeChikenWingsCommand")){
			System.out.println("没鸡翅了");
		}
	}
	
	public void cancelOrderFromList(Command command){
		orderList.remove(command);
		System.out.println("取消订单："+GetName(command)+",时间："+new Date().toGMTString());
	}
	
	public void NotifyAll() {
		for(Command command:orderList){
			command.ExcuteCommand();
		}
	}

	public String GetName(Command command) {
		if(command.getClass().getName().equals("com.order.demo.BBQ.BakeMuttonCommand")){
			return "BakeMuttonCommand";
		}
		if(command.getClass().getName().equals("com.order.demo.BBQ.BakeChikenWingsCommand")){
			return "BakeChikenWingsCommand";
		}
		return super.toString();
	}
}
