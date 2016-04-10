package com.szymonharabasz.exercises.ch01.ex03;

import java.util.Scanner;

public class Ex_01_03 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int[] nums = new int[3];
		for (int i = 0; i < 3; ++i) {
			System.out.printf("Number #%d ", i+1);
			String input = in.nextLine();
			nums[i] = Integer.parseInt(input);
		}
		System.out.printf("Largest number %d\n", nums[0] > nums[1] ? (nums[0] > nums[2] ? nums[0] : nums[2]) : (nums[1] > nums[2] ? nums[1] : nums[2]));
		System.out.printf("Largest number %d\n", Math.max(nums[0], Math.max(nums[1], nums[2])));
		in.close();
	}

}
