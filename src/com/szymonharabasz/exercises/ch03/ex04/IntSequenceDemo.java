package com.szymonharabasz.exercises.ch03.ex04;

public class IntSequenceDemo {

	public static void main(String[] args) {
		IntSequence seq = IntSequence.of(3, 1, 4, 1, 5, 9);
		while (seq.hasNext()) {
			System.out.println(seq.next());
		}
		IntSequence constant = IntSequence.constant(4);
		for (int i = 0; i < 100; ++i) {
			System.out.print(constant.next() + " ");
		}
		System.out.println("");
	}

}
