package com.szymonharabasz.exercises.ch03.ex01;

public class MeasursbleDemo {

	public static void main(String[] args) {
		Measurable szymon = new Employee("Szymon Harabasz", 4.);
		Measurable[] employees = {
			szymon,
			new Employee("Max Mustermann", 30.),
			new Employee("Martina Musterfrau", 40.),
			new Employee("Mike Masterman", 1002.),
			new Employee("Monica Masterwoman", 1002.)
			
		};
		System.out.println(average(employees));
		System.out.println(((Employee)largest(employees)).getName());
	}
	
	public static double average(Measurable[] objects) {
		double average = 0;
		for (Measurable obj : objects) {
			average += obj.getMeasure();
		}
		average /= objects.length;
		return average;
	}

	public static Measurable largest(Measurable[] objects) {
		int largestInd = 0;
		for (int i = 1; i < objects.length; ++i) {
			if (objects[i].getMeasure() > objects[largestInd].getMeasure()) {
				largestInd = i;
			}
		}
		return objects[largestInd];
	}
}
