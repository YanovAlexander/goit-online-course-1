package com.goit.module7;

public interface Animal {


    int paws();

    default void animal() {
        
        System.out.println("It's an animal");
    }

    static void hello() {
        System.out.println("Hello");
    }
}
