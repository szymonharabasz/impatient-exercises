package com.szymonharabasz.exercises.ch04.ex04;

import com.szymonharabasz.exercises.ch04.ex01.Point;

public class Rectangle extends Shape {

	private double width;
	private double height;
	
	public Rectangle(Point topLeft, double width, double height) {
		super(topLeft);
		this.width = width;
		this.height = height;
	}

	@Override
	public Point getCenter() {
		return new Point(0.5*(point.getX() + width), 0.5*(point.getY() + height));
	}

	@Override
	public Rectangle clone() {
		return new Rectangle(point, width, height);
	}
}
