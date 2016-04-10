package com.szymonharabasz.exercises.ch01.ex13;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;

public class Ex_01_13 {

	public static void main(String[] args) {
		Random rnd = new Random();
		ArrayList<Integer> all = new ArrayList<>();
		ArrayList<Integer> drawn = new ArrayList<>();
		for (int i = 1; i < 50; ++i) { all.add(i); }
		for (int i = 0; i < 6; ++i) {
			int n = rnd.nextInt(all.size());
			drawn.add(all.get(n));
			all.remove(n);
		}
		Collections.sort(drawn);
		System.out.println(drawn);
	}

}
