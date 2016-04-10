package com.szymonharabasz.exercises.ch04.ex11;

import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class HelloWorld {

	public static void main(String[] args) throws NoSuchFieldException, SecurityException, 
	IllegalArgumentException, IllegalAccessException, NoSuchMethodException, InvocationTargetException
	{
		long begin = System.currentTimeMillis();
		for (int i = 0; i < 100; ++i) {
			Class<?> classSystem = System.class;
			Field fieldOut = classSystem.getField("out");
			Object out = fieldOut.get(null);
			Method m = out.getClass().getMethod("println", String.class);	
			m.invoke(out, "Hello world");
		}
		long end = System.currentTimeMillis();
		System.out.println("Time: " + (end-begin) + " ms");
		begin = System.currentTimeMillis();
		for (int i = 0; i < 100; ++i) {
			System.out.println("Hello world");
		}
		end = System.currentTimeMillis();
		System.out.println("Time: " + (end-begin) + " ms");
	}

}
