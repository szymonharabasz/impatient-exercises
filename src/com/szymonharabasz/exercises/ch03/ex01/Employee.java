package com.szymonharabasz.exercises.ch03.ex01;

public class Employee implements Measurable {
    private String name;
    private double salary;
        
    public Employee(String name, double salary) {
        this.name = name;
        this.salary = salary;
    }
    
    public Employee(String name) {
        this(name, 0);
    }

    public void raiseSalary(double byPercent) {
        double raise = salary * byPercent / 100;
        salary += raise;    
    }
    
    public String getName() {
        return name;
    }
    
    public double getSalary() {
        return salary;
    }

	@Override
	public double getMeasure() {
		return salary;
	}
}

