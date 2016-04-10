package com.szymonharabasz.exercises.ch04.ex01;

public class Point {
	protected double x;
	protected double y;

	public Point(double x, double y) {
		this.x = x;
		this.y = y;
	}

	public double getX() { return x; }
	public double getY() { return y; }
	
	@Override
	public String toString() {
		return getClass().getName() + "[x=" + x + ", y=" + y + "]";
	}
	
	@Override
	public boolean equals(Object other) {
		if (this == other) return true;
		if (other == null) return false;
		if (getClass() != other.getClass()) return false;
		Point otherPoint = (Point)other;
		return x == otherPoint.x && y == otherPoint.y;
	}
	
	@Override
	public int hashCode() {
		return 31*Double.hashCode(x) + Double.hashCode(y);
	}
}
