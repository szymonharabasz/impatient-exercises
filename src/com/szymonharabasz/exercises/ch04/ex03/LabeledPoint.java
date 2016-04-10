package com.szymonharabasz.exercises.ch04.ex03;

import com.szymonharabasz.exercises.ch04.ex01.Point;

public class LabeledPoint extends Point {
    private String label;
	
	public LabeledPoint(String label, double x, double y) {
		super(x, y);
		this.label = label;		
	}
	
	public String getLabel() { return label; }

	@Override
	public String toString() {
		return super.toString() + "[label=" + label + "]";
	}
	
	@Override
	public boolean equals(Object other) {
		if (this == other) return true;
		if (other == null) return false;
		if (getClass() != other.getClass()) return false;
		if (!super.equals(other)) return false;
		LabeledPoint otherPoint = (LabeledPoint)other;
		return label == otherPoint.label;
	}
	
	
	@Override
	public int hashCode() {
		return 33*super.hashCode() + label.hashCode();
	}
	
	public double dist(Point other) {
		//Accessing protected variable in superclass from other package
		//does not work.
		//double dx = x-other.x;
		//double dy = y-other.y;
		double dx = x-other.getX();
		double dy = y-other.getY();
		return Math.sqrt(dx*dx+dy*dy);
	}
}
