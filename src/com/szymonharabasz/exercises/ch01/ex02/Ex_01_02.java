package com.szymonharabasz.exercises.ch01.ex02;

import java.util.Scanner;

public class Ex_01_02 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("Give an integer angle: ");
		String input = in.nextLine();
		int num = Integer.parseInt(input);
		System.out.printf("Normalized: %d\n", Math.floorMod(num, 360));
		in.close();
	}

}
