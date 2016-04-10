package com.szymonharabasz.exercises.ch03.ex08;

public class Greeter implements Runnable {
	private int n;
	private String target;
	
	public Greeter(String target, int n) {
		this.target = target;
		this.n = n;
	}

	@Override
	public void run() {
		for (int i = 0; i < n; ++i) {
			System.out.println("Hello " + target);
		}
	}

}
