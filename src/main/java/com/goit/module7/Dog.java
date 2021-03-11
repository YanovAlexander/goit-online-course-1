package com.goit.module7;

public class Dog implements Animal {
    private int paws;

    public Dog(int paws) {
        this.paws = paws;
    }

    @Override
    public int paws() {
        return paws;
    }

    @Override
    public void animal() {
        System.out.println("Dog animal");
    }
}
