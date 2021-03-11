package com.goit.module12;

import java.util.concurrent.*;

public class CompletableFutureExample {

    public static void main(String[] args) throws ExecutionException, InterruptedException {
        calculate(10);
        System.out.println("Main thread" + Thread.currentThread().getName());
        for (int i = 0; i < 1000000; i++) {
            System.out.print("l");
        }
        System.out.println("Main finished");
    }


    private static void calculate(Integer input) {
        CompletableFuture.supplyAsync(() -> {
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            return input * input;
        })
                .thenAccept(System.out::println);
    }
}
