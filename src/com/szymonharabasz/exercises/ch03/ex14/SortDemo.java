package com.szymonharabasz.exercises.ch03.ex14;

import java.util.Arrays;
import java.util.Comparator;

public class SortDemo {

	public static void main(String[] args) {
		Employee szymon = new Employee("Szymon Harabasz", 4.);
		Employee[] employees = {
			szymon,
			new Employee("Szymon Harabasz", 3.),
			new Employee("Max Mustermann", 30.),
			new Employee("Martina Musterfrau", 40.),
			new Employee("Mike Masterman", 1002.),
			new Employee("Monica Masterwoman", 1002.)
		};
		Arrays.sort(employees, Comparator
				.comparing(Employee::getSalary)
				.thenComparing(Employee::getName));
		for (Employee emp : employees) {
			System.out.println(emp);
		}
		System.out.println("----------------");
		Arrays.sort(employees, Comparator
				.comparing(Employee::getName)
				.thenComparing(Employee::getSalary));
		for (Employee emp : employees) {
			System.out.println(emp);
		}
	}
}
