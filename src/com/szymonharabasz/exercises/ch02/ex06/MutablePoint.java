package com.szymonharabasz.exercises.ch02.ex06;

public class MutablePoint {
	public MutablePoint() {
		x = 0.;
		y = 0.;
	}
	
	public MutablePoint(double x, double y) {
		this.x = x;
		this.y = y;
	}
	
	public double getX() { return x; }
	public double getY() { return y; }
	
	public void translate(double x, double y) {
		this.x += x;
		this.y += y;
	}
	
	public void scale(double aspect) {
		this.x *= aspect;
		this.y *= aspect;
	}
	
	public String toString() {
		return x + ", " + y;
	}
	private double x, y;
}