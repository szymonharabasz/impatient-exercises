package com.szymonharabasz.exercises.ch04.ex09;

import java.lang.reflect.Field;
import java.lang.reflect.Modifier;
import java.util.Stack;

import com.szymonharabasz.exercises.ch04.ex01.Point;
import com.szymonharabasz.exercises.ch04.ex04.Rectangle;

public class GenericToString {
	private static Stack<Object> owners = new Stack<>();
	
	public static String toString(Object obj, Class<?> clazz) throws IllegalArgumentException, IllegalAccessException {
		if (owners.search(obj) > -1) return "";
		StringBuilder builder = new StringBuilder(clazz.getCanonicalName());
		Field[] fields = clazz.getDeclaredFields();
		for (int i = 0; i < fields.length; ++i) {
			if (i == 0) builder.append("[");
			Field field = fields[i];
			System.out.println(field.getName() + " " + field.getType());
			field.setAccessible(true);
			if (!Modifier.isStatic(field.getModifiers())) {
				builder.append(field.getName() + "=");
				Object objField = field.get(obj);
				if (field.getType().isPrimitive() || field.getType() == String.class) {
					builder.append(objField);
				} else {
					owners.push(obj);
					builder.append(toString(objField,field.getType()));
					owners.pop();
				}
			}
			if (i == fields.length - 1) {
				builder.append("]");
			} else {
				builder.append(", ");
			}
		}
		if (clazz.getSuperclass() != Object.class && clazz != Object.class) {
			builder.append("[super:");
			Class<?> superclazz = obj.getClass().getSuperclass();
			builder.append(toString(obj, superclazz));
			builder.append("]");
		}
		return builder.toString();
	}
	
	public static String toString(Object obj) throws IllegalArgumentException, IllegalAccessException {
		return toString(obj, obj.getClass());
	}
	
	public static void main(String[] args) throws IllegalArgumentException, IllegalAccessException {
		Rectangle r = new Rectangle(new Point(1.2, 3.2), 5.5, 0.3);
		System.out.println(toString(r));
		
		
		CircularList list = new CircularList();
		list.add("Szymon");
		list.add("Max Mustermann");
		list.add("Martina Musterfrau");
		System.out.println(toString(list));
		
	}
}
