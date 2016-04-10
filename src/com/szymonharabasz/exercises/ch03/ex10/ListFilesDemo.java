package com.szymonharabasz.exercises.ch03.ex10;

import java.io.File;
import java.io.FileFilter;

public class ListFilesDemo {

	public static void main(String[] args) {
		
		File[] dirs = list3("/home/harabasz");
		for(File dir : dirs) {
			System.out.println(dir);
		}

	}
	
	public static File[] list1(String dir) {
		File file = new File(dir);
		return file.listFiles(new FileFilter() {

			@Override
			public boolean accept(File pathname) {
				return pathname.isDirectory();
			}
			
		});
	}

	public static File[] list2(String dir) {
		File file = new File(dir);
		return file.listFiles((pathname) -> pathname.isDirectory());
	}


	public static File[] list3(String dir) {
		File file = new File(dir);
		return file.listFiles(File::isDirectory);
	}}
