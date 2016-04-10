package com.szymonharabasz.exercises.ch04.ex03;

import com.szymonharabasz.exercises.ch04.ex01.Point;

public class PointTest {

	public static void main(String[] args) {
		LabeledPoint lp = new LabeledPoint("E",10.4,5.2);
		Point p = new Point(-2.3,4.1);
		System.out.println(lp.dist(p));
	}

}
