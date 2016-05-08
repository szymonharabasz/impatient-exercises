package com.szymonharabasz.exercises.ch05.ex01;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class ReadTest {

	public static void main(String[] args) {
		try {
			System.out.println(sumOfValues("/home/harabasz/doubles.txt"));
		} catch (NumberFormatException e) {
			System.err.println("Number in wrong format: " + e.getMessage());
		} catch (FileNotFoundException e) {
			System.err.println("File not found: " + e.getMessage());
		}
	}
	
	public static ArrayList<Double> readValues(String filename) throws FileNotFoundException, NumberFormatException {
		ArrayList<Double> arr = new ArrayList<>();
		Scanner scanner = new Scanner(new FileInputStream(filename));
		while (scanner.hasNext()) {
			arr.add(Double.parseDouble(scanner.next()));
		}
		scanner.close();
		return arr;
	}

	public static double sumOfValues(String filename) throws NumberFormatException, FileNotFoundException {
		double sum = 0.;
		for (Double d : readValues(filename)) {
			sum += d;
		}
		return sum;
	}
}
