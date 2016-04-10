package com.szymonharabasz.exercises.ch04.ex08;

public class ClassToStringTest {

	public static void main(String[] args) {
		System.out.println("Arrays:");
		int[] is = { 3,4 };
		System.out.println("getName()\t\t" + is.getClass().getName());
		System.out.println("getSimpleName()\t\t" + is.getClass().getSimpleName());
		System.out.println("getCanonicalName()\t" + is.getClass().getCanonicalName());
		System.out.println("getTypeName()\t\t" + is.getClass().getTypeName());
		System.out.println("toString()\t\t" + is.getClass().toString());
		System.out.println("toGenericString()\t" + is.getClass().toGenericString());

		System.out.println("Normal types:");
		String str = "Hello world";
		System.out.println("getName()\t\t" + str.getClass().getName());
		System.out.println("getSimpleName()\t\t" + str.getClass().getSimpleName());
		System.out.println("getCanonicalName()\t" + str.getClass().getCanonicalName());
		System.out.println("getTypeName()\t\t" + str.getClass().getTypeName());
		System.out.println("toString()\t\t" + str.getClass().toString());
		System.out.println("toGenericString()\t" + str.getClass().toGenericString());

		System.out.println("Inner classes:");
		External ex = new External();
		External.Internal in = ex.new Internal();
		System.out.println("getName()\t\t" + in.getClass().getName());
		System.out.println("getSimpleName()\t\t" + in.getClass().getSimpleName());
		System.out.println("getCanonicalName()\t" + in.getClass().getCanonicalName());
		System.out.println("getTypeName()\t\t" + in.getClass().getTypeName());
		System.out.println("toString()\t\t" + in.getClass().toString());
		System.out.println("toGenericString()\t" + in.getClass().toGenericString());

		System.out.println("Primitive types:");
		System.out.println("getName()\t\t" + int.class.getName());
		System.out.println("getSimpleName()\t\t" + int.class.getSimpleName());
		System.out.println("getCanonicalName()\t" + int.class.getCanonicalName());
		System.out.println("getTypeName()\t\t" + int.class.getTypeName());
		System.out.println("toString()\t\t" + int.class.toString());
		System.out.println("toGenericString()\t" + int.class.toGenericString());
	}
}
