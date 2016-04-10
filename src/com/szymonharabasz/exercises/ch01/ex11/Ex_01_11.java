package com.szymonharabasz.exercises.ch01.ex11;

import java.util.Scanner;

public class Ex_01_11 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("Input: ");
		String input = in.nextLine();
		int n = input.codePointCount(0, input.length());
		for (int i = 0; i < n; ++i) {
			int cp = input.codePointAt(input.offsetByCodePoints(0, i));
			if (cp > 127) {
				String character = new String(new int[] {cp},0,1);
				System.out.println(character + " : \\u" + Integer.toHexString(cp));
			}
		}
		in.close();
	}

}
