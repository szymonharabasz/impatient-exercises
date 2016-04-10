package com.szymonharabasz.exercises.ch03.ex11;

import java.io.File;

public class ListFilesDemo {

	public static void main(String[] args) {
		
		File[] dirs = list("/home/harabasz","pdf");
		for(File dir : dirs) {
			System.out.println(dir);
		}

	}
	
	public static File[] list(String dir, String extension) {
		File file = new File(dir);
		return file.listFiles((directory,name) -> name.endsWith("." + extension));
	}
}