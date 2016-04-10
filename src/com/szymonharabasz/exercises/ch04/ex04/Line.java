package com.szymonharabasz.exercises.ch04.ex04;

import com.szymonharabasz.exercises.ch04.ex01.Point;

public class Line extends Shape {

	private Point endPoint;
	
	public Line(Point from, Point to) {
		super(from);
		endPoint = to;
	}

	@Override
	public Point getCenter() {
		return new Point(0.5*(point.getX() + endPoint.getX()), 0.5*(point.getY() + endPoint.getY()));
	}
	
	@Override
	public void moveBy(double dx, double dy) {
		super.moveBy(dx, dy);
		endPoint = new Point(endPoint.getX() + dx, endPoint.getY() + dy);
	}
	
	@Override
	public Line clone() {
		return new Line(point, endPoint);
	}

}
