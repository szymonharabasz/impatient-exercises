package com.szymonharabasz.exercises.ch04.ex04;

import com.szymonharabasz.exercises.ch04.ex01.Point;

public class Circle extends Shape {

	private double radius;
	
	public Circle(Point center, double radius) {
		super(center);
		this.radius = radius;
	}

	@Override
	public Point getCenter() {
		return point;
	}
	
	@Override
	public Circle clone() {
		return new Circle(point, radius);
	}

}
