package com.goit.module4.exercices;

import java.util.Arrays;

public class ArrayInverter {

    public static void main(String[] args) {
        int[] arr = new int[]{1, 2, 3, 4, 5, 8, 10, 15};
        invert(arr);
        System.out.println(Arrays.toString(arr));
    }


    public static void invert(int[] arr) {
        for (int k = 0; k < arr.length / 2; k++) {
            int tmp = arr[k];
            arr[k] = arr[arr.length - k - 1];
            arr[arr.length - k - 1] = tmp;
        }
    }
}
