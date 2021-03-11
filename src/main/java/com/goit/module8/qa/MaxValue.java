package com.goit.module8.qa;

public class MaxValue<T extends Comparable<T>> {

    public T maximum (T a, T b, T c) {
        T max = a;
        if (b.compareTo(max) > 0) {
            max = b;
        }
        if (c.compareTo(max) > 0) {
            max = c;
        }

        return max;
    }
}
