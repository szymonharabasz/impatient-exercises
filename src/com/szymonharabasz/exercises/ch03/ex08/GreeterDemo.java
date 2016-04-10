package com.szymonharabasz.exercises.ch03.ex08;

public class GreeterDemo {

	public static void main(String[] args) {
		Greeter szymon = new Greeter("Szymon", 20);
		Greeter gosia = new Greeter("Gosia", 22);
		runInOrder(szymon, gosia);
		System.out.println("------------------");
		runTogether(szymon, gosia);
	}

	public static void runTogether(Runnable...runnables) {
		for (Runnable runnable : runnables) {
			new Thread(runnable).start();
		}
	}

	public static void runInOrder(Runnable...runnables) {
		for (Runnable runnable : runnables) {
			runnable.run();;
		}
	}

}
