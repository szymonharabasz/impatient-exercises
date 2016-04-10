package com.szymonharabasz.exercises.ch02.ex05;

public class Point {
	public Point() {
		x = 0.;
		y = 0.;
	}
	
	public Point(double x, double y) {
		this.x = x;
		this.y = y;
	}
	
	public double getX() { return x; }
	public double getY() { return y; }
	
	public Point translate(double x, double y) {
		return new Point(this.x + x, this.y + y);
	}
	
	public Point scale(double aspect) {
		return new Point(this.x * aspect, this.y * aspect);
	}
	
	public String toString() {
		return x + ", " + y;
	}
	private double x, y;
}