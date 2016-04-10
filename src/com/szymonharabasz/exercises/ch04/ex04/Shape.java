package com.szymonharabasz.exercises.ch04.ex04;

import com.szymonharabasz.exercises.ch04.ex01.Point;

public abstract class Shape {
	protected Point point;
	
	public Shape(Point point) {
		this.point = point;
	}
	
	public void moveBy(double dx, double dy) {
		point = new Point(point.getX() + dx, point.getY() + dy);
	}
	
	abstract public Point getCenter();
}
