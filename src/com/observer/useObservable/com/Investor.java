package com.observer.useObservable.com;
import java.util.Observable;
import java.util.Observer;

/**
 * Ͷ���ߣ��۲��ߣ��۲��Ʊ����
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
			System.out.println("֪ͨ����"+name+",����Ʊ����Ϊ��"+arg);
		}
		if (arg instanceof Double) {
			System.out.println("֪ͨ����"+name+",����Ʊ�۸����Ϊ��"+arg);
		}
	}
}



