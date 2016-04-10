package com.szymonharabasz.exercises.ch01.ex08;

import java.util.Scanner;

public class Ex_01_08 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("Input: ");
		String input = in.nextLine();
		for (int i = 0; i <= input.length(); ++i) {
			for (int j = i+1; j <= input.length(); ++j) {
				System.out.println(input.substring(i,j));
			}
		}
		in.close();
	}

}
