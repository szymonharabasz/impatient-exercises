package com.szymonharabasz.exercises.ch01.ex01;

import java.util.Scanner;

public class Ex_01_01 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("Give an integer: ");
		String input = in.nextLine();
		int num = Integer.parseInt(input);
		System.out.printf("Binary: \t\t %s\n", Integer.toBinaryString(num));
		System.out.printf("Octal: \t\t\t %o\n", num);
		System.out.printf("Hexadecimal: \t\t %x\n", num);
		double inverse = 1./num;
		System.out.printf("Inverse hexadecimal: \t %a\n", inverse);
		in.close();
	}

}
