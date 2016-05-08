package com.szymonharabasz.exercises.ch05.ex10;

public class StackTraceTest {

	public static void main(String[] args) {
		System.out.println(new StackTraceTest().factorial(10));
	}
	
	long factorial(long n) {
		if (n <= 1) {
			new Exception().printStackTrace();
			return 1;
		} else {
			return n*factorial(n-1);
		}
	}

}
