package com.szymonharabasz.exercises.ch02.ex04;

import org.omg.CORBA.IntHolder;

public class SwapInteger {

	public static void main(String[] args) {
		IntHolder a = new IntHolder(4);
		IntHolder b = new IntHolder(3);
		swap(a, b);
		System.out.println(a.value + " " + b.value);
		Integer c = 6;
		Integer d = 5;
		swap(c, d);
		System.out.println(c + " " + d);	
	}

	public static void swap(IntHolder a, IntHolder b) {
		int temp = a.value;
		a.value = b.value;
		b.value = temp;
	}

	public static void swap(Integer a, Integer b) {
		int temp = a.intValue();
		a = b.intValue();
		b = temp;
	}

}
