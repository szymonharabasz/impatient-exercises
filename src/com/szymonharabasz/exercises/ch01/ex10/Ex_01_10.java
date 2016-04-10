package com.szymonharabasz.exercises.ch01.ex10;

import java.util.Random;

public class Ex_01_10 {

	public static void main(String[] args) {
		long num = Math.abs(new Random().nextLong());
		System.out.println(Long.toString(num, 36));
	}

}
