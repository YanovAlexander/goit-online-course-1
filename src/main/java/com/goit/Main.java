package com.goit;

public class Main {

    public static void main(String[] args) {
        Issue book = new Book("TestNameBook", 100, "testAuthor");
        System.out.println(book.toPrint());
    }
}
