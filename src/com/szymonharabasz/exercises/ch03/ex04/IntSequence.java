package com.szymonharabasz.exercises.ch03.ex04;

public interface IntSequence {
    default boolean hasNext() { return true; };
    static IntSequence of(int... nums) {
		return new IntSequence() {
			private int index = 0;
			
			@Override
			public int next() {
				int number = nums[index];
				++index;
				return number;
			}
			
			@Override
			public boolean hasNext() {
				return index < nums.length;
			}
		};
    }
    static IntSequence constant(int val) {
    	return () -> val;
    }
    int next();
}
