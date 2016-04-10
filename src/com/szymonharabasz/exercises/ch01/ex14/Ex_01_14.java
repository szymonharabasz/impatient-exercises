package com.szymonharabasz.exercises.ch01.ex14;

import java.util.ArrayList;
import java.util.Scanner;

public class Ex_01_14 {
	
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("Input: ");
		String input;
		ArrayList<ArrayList<Integer>> square = new ArrayList<>();
		do {
			input = in.nextLine();
			String[] tokens = input.split(" ");
			if (tokens.length > 0 && tokens[0].length() > 0) {
				ArrayList<Integer> row = new ArrayList<>();
				for (String token : tokens) {
					row.add(Integer.parseInt(token));
				}
				square.add(row);
			}
		} while (input.length() > 0);
		System.out.println(isMagic(square));
		in.close();
	}
	
	public static boolean isMagic(ArrayList<ArrayList<Integer>> square) {
		int nrows = square.size();
		boolean firstSum = true;
		int storedSum = 0;
		for (ArrayList<Integer> row : square) {
			if (row.size() != nrows) {
				System.out.println("Number of entires not equal number of rows");
				return false;
			}
			if (firstSum) {
				storedSum = sum(row);
			} else {
				int rowSum = sum(row);
				if (storedSum != rowSum) {
					System.out.println("Stored sum " + storedSum + " != sum of row " + rowSum);
					return false;
				}
			}
		}
		for (int i = 0; i < square.size(); ++i) {
			int colSum = sumCol(square,i);
			if (storedSum != colSum) {
				System.out.println("Stored sum " + storedSum + " != sum of col " + colSum);				
				return false;
			}
		}
		int diagSum = sumDiag(square,true);
		if (storedSum != diagSum) {
			System.out.println("Stored sum " + storedSum + " != sum of counterdiagonal " + diagSum);				
			return false;
		}
		diagSum = sumDiag(square,false);
		if (storedSum != diagSum) {
			System.out.println("Stored sum " + storedSum + " != sum of diagonal " + diagSum);				
			return false;
		}
		return true;
	}
	
	private static int sum(ArrayList<Integer> row) {
		int sum = 0;
		for (Integer i : row) {
			sum += i;
		}
		return sum;
	}
	
	private static int sumCol(ArrayList<ArrayList<Integer>> square, final int k) {
		int sum = 0;
		int n = square.size();
		for (int i = 0; i < n; ++i) {
			sum += square.get(i).get(k);
		}
		return sum;
	}
	
	private static int sumDiag(ArrayList<ArrayList<Integer>> square, final boolean counter) {
		int sum = 0;
		int n = square.size();
		for (int i = 0; i < n; ++i) {
			if (counter) {
				sum += square.get(n-i-1).get(i);
			} else {
				sum += square.get(i).get(i);
			}
		}
		return sum;
	}
		
}
