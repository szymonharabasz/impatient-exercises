package com.szymonharabasz.exercises.ch01.ex06;

import java.math.BigInteger;

public class Ex_01_06 {

	public static void main(String[] args) {
		System.out.println(factorial(1000000));
	}

	public static BigInteger factorial(int num) {
		BigInteger result = BigInteger.ONE;
		for (int i = 1; i <= num; ++i) {
			result = result.multiply(BigInteger.valueOf(i));
		}
		return result;
	}
}
