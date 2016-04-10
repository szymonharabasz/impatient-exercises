package com.szymonharabasz.exercises.ch04.ex13;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.function.DoubleFunction;

public class MethodTest {

	public static void main(String[] args) {
		long begin = System.currentTimeMillis();
		try {
			Method mathSqrt = Math.class.getMethod("sqrt", double.class);
			printTableReflect(mathSqrt, 0, 100, 1);
			Method doubleToHexString = Double.class.getMethod("toHexString", double.class);
			printTableReflect(doubleToHexString, 0, 100, 1);
		} catch (NoSuchMethodException e) {
			e.printStackTrace();
		} catch (SecurityException e) {
			e.printStackTrace();
		} catch (IllegalAccessException e) {
			e.printStackTrace();
		} catch (IllegalArgumentException e) {
			e.printStackTrace();
		} catch (InvocationTargetException e) {
			e.printStackTrace();
		}
		long end = System.currentTimeMillis();
		System.out.println("Time : " + (end-begin) + " ms");
		begin = System.currentTimeMillis();
		printTableGeneric(Math::sqrt, 0, 100, 1);
		printTableGeneric(Double::toHexString, 0, 100, 1);
		end = System.currentTimeMillis();
		System.out.println("Time : " + (end-begin) + " ms");
	}
	
	public static void printTableReflect(Method m, double lower, double upper, double step)
			throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
		for (double num = lower; num <= upper; num += step) {
			Object result = m.invoke(null, num);
			System.out.println("| " + num + " | " + result + " |");
		}
	}

	public static void printTableGeneric(DoubleFunction<Object> func, double lower, double upper, double step) {
		for (double num = lower; num <= upper; num += step) {
			Object result = func.apply(num);
			System.out.println("| " + num + " | " + result + " |");
		}
	}
	
}
