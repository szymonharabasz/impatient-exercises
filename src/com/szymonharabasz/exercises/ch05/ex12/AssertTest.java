package com.szymonharabasz.exercises.ch05.ex12;

/**
 * Created by harabasz on 08.05.16.
 */
public class AssertTest {
    int min(int[] values) {
        int min = values[0];
        for (int i = 1; i < values.length; ++i) {
            if (values[i] < min) {
                min = values[i];
            }
        }
        assert isSmallest(min, values) : "The value " + min + " isn't the smallest in the array.";
        return min;
    }

    boolean isSmallest(int min, int[] values) {
        for (int value : values) {
            if (value < min) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        int[] values = {2,4,5,2,7,13,143,-2};
        System.out.println(new AssertTest().min(values));
    }
}
