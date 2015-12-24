package com.observer.useObservable.com;
import java.util.Observable;
import java.util.Observer;

/**
 * 投资者，观察者，观察股票行情
 * @author zhkmx
 *
 */
public class Investor implements Observer {
	private String name;
	private String observerState;
	
	public Investor(String name) {
		// TODO Auto-generated constructor stub
		this.name = name;
	}
	@Override
	public void update(Observable o, Object arg) {
		// TODO Auto-generated method stub
		if(arg instanceof String){
			System.out.println("通知股民："+name+",恒大股票更名为："+arg);
		}
		if (arg instanceof Double) {
			System.out.println("通知股民："+name+",恒大股票价格更变为："+arg);
		}
	}
}



