package com.szymonharabasz.exercises.ch03.ex07;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class LuckySort {

	public static void main(String[] args) {
		ArrayList<String> strings = new ArrayList<>();
		strings.add("Szymek");
		strings.add("Karol");
		strings.add("Tomek");
		strings.add("Gosia");
		strings.add("Georgy");
		strings.add("Tetyana");
		strings.add("Adrian");
		strings.add("Florian");
		strings.add("Frederic");
		strings.add("Manuel");
		strings.add("Jochen");
		luckySort(strings, String::compareTo);
		for (String person : strings) {
			System.out.println(person);
		}
	}
	
	public static void luckySort(ArrayList<String> strings, Comparator<String> comp) {
		while(!sorted(strings, comp)) {
			Collections.shuffle(strings);
		}
	}
	
	private static boolean sorted(ArrayList<String> strings, Comparator<String> comp) {
		for (int i = 0; i < strings.size() - 1; ++i) {
			if (comp.compare(strings.get(i), strings.get(i+1)) > 0) {
				return false;
			}
		}
		return true;
	}
}
