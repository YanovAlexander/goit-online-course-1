package com.goit.module12;

import java.util.concurrent.*;

public class Feature {
    private static ExecutorService executor = Executors.newSingleThreadExecutor();

    public static void main(String[] args) throws ExecutionException, InterruptedException {
        final Future<Integer> calculate = calculate(10);
        Integer integer = calculate.get();
        System.out.println(integer);
        System.out.println("Main thread" + Thread.currentThread().getName());
        executor.shutdown();
    }


    private static Future<Integer> calculate(Integer input) {
        return executor.submit(new Callable<Integer>() {
            @Override
            public Integer call() throws Exception {
                Thread.sleep(3000);
                System.out.println("THread " + Thread.currentThread().getName());
                return input * input;
            }
        });
    }
}

