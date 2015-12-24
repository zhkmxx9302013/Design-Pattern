package com.order.demo.fortunetask;

public class FibonacciTask implements Task {
	int n1 = 1;
	int n2 = 0;
	int num;

	public FibonacciTask() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public void performTask() {
		// TODO Auto-generated method stub
		num = n1 + n2;
		System.out.println("Next Fibonacci number is: " + num);
		n1 = n2;
		n2 = num;

	}

	public String toString() {
		return ("Fibonacci Sequence Task");
	}

}
