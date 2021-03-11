package com.goit.module5.exercises.view;

import java.util.Scanner;

public class Console implements View {

    private Scanner scanner;

    @Override
    public void write(String message) {
        System.out.println(message);
    }

    public Console() {
        this.scanner = new Scanner(System.in);
    }

    @Override
    public String read() {
        return scanner.nextLine();
    }
}
