package com.szymonharabasz.exercises.ch05.ex04;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class ReadTest {

	public static void main(String[] args) {
		ArrayList<Double> arr = new ArrayList<>();
		ArrayList<Double> sum = new ArrayList<>();
		int ret = sumOfValues("/home/harabasz/doubles.txt", arr, sum);
		if (ret == 0) {
			System.out.println(sum.get(0));
		} else if (ret == 2) {
			System.err.println("Number in wrong format");
		} else if (ret == 1) {
			System.err.println("File not found");
		}
	}
	
	public static int readValues(String filename, ArrayList<Double> arr) {
		Scanner scanner;
		try {
			scanner = new Scanner(new FileInputStream(filename));
		} catch (FileNotFoundException e) {
			return 1;
		}
		try {
			while (scanner.hasNext()) {
				arr.add(Double.parseDouble(scanner.next()));
			}
		} catch (NumberFormatException ex) {
			return 2;
		} finally {
			scanner.close();
		}
		return 0;
	}

	public static int sumOfValues(String filename, ArrayList<Double> arr, ArrayList<Double> result) {
		double sum = 0.;
		int ret = readValues(filename, arr);
		if (ret == 0) {
			for (Double d : arr) {
				sum += d;
			}
			result.add(sum);
		}
		return ret;
	}
}
