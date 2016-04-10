package com.szymonharabasz.exercises.ch03.ex12;

import java.io.File;
import java.util.Arrays;

public class SortFilesDemo {

	public static void main(String[] args) {
		File file = new File("/home/harabasz");
		File[] list = file.listFiles((dir,name) -> true);
		Arrays.sort(list, (a, b) -> {
			if (a.isDirectory() && !b.isDirectory()) {
				return -1;
			} else if (!a.isDirectory() && b.isDirectory()) {
				return 1;
			} else {
				return a.getName().compareTo(b.getName());
			}
		});
		for (File f : list) {
			System.out.println(f);
		}
	}

}
