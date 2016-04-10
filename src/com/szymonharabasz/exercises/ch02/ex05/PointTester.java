package com.szymonharabasz.exercises.ch02.ex05;

public class PointTester {

	public static void main(String[] args) {
		Point p = new Point(3, 4).translate(1, 3).scale(0.5);
		System.out.println(p);
	}
}
