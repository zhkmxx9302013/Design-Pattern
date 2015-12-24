package com.order.demo.fortunetask;

public class FortuneTask implements Task {

	int nextFortune = 0;
	String[] fortunes = { "She who studies hard, gets A",
			"Seeth the pattern and knoweth the truth",
			"He who leaves state the day after final, graduates not" };

	public FortuneTask() {
		// TODO Auto-generated constructor stub
		
	}

	@Override
	public void performTask() {
		// TODO Auto-generated method stub
		System.out.println("Your fortune is: " + fortunes[nextFortune]);
		nextFortune = (nextFortune + 1) % fortunes.length;

	}

	public String toString() {
		return ("Fortune Telling Task");
	}

}
