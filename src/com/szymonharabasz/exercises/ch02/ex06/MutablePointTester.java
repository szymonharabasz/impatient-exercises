package com.szymonharabasz.exercises.ch02.ex06;

public class MutablePointTester {

	public static void main(String[] args) {
		MutablePoint p = new MutablePoint(3, 4);
		p.translate(1, 3);
		p.scale(0.5);
		System.out.println(p);
	}
}
