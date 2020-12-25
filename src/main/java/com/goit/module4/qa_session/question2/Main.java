package com.goit.module4.qa_session.question2;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Example example = new Example();
        final int[] arr = example.getArr();
        System.out.println(Arrays.toString(arr));

        arr[1] = 100;

        final int[] oneMoreArray = example.getArr();
        System.out.println(Arrays.toString(oneMoreArray));


        Counter counter = example.getCounter();
        System.out.println(example.getCounter().getA());
        counter.setA(1000);

        System.out.println(example.getCounter().getA());

        Example example1 = new Example();
        System.out.println(Arrays.toString(example1.getArr()));
        System.out.println(example1.getCounter().getA());

        Counter counter1 = new Counter();
        example.setCounter(counter1);
    }
}
