package com.goit.module4.exercices;

public class MatrixSum {
    public static void main(String[] args) {
        final int[][] input = {{1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}};
        sum(input);
    }

    static void sum(int[][] input) {
        int sum = 0;
        for (int i = 0; i < input.length; i++) {
            for (int j = (i + 1) - 1; j < input[i].length; j++) {
                sum = sum + input[i][j];
            }
        }
        System.out.println("sum=" + sum);
    }
}
