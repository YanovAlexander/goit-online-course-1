package com.goit.module5.exercises;

import com.goit.module5.exercises.controller.MainController;
import com.goit.module5.exercises.view.Console;
import com.goit.module5.exercises.view.View;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        DataStorage dataStorage = new ArrayDataStorage();
        View view = new Console();

        MainController controller = new MainController(view, dataStorage);
        controller.run();
    }

    private static void run(DataStorage dataStorage, Scanner scanner) {
        System.out.println("Welcome");
        System.out.println("Type command or use 'help' to list all commands");

        while (true) {
            String command = scanner.nextLine();
            if (command.equals("add book")) {
                System.out.println("please provide book name:");
                String bookName = scanner.nextLine();
                System.out.println("please provide book size:");
                String size = scanner.nextLine();
                System.out.println("please provide book author:");
                String author = scanner.nextLine();
                Book book = new Book(bookName, Integer.parseInt(size), author);
                dataStorage.addPublication(book);
                System.out.println("Book saved");
            } else if (command.equals("help")) {
                System.out.println("add book - add a book to a storage");
                System.out.println("help - list all commands");
            } else if (command.equals("exit")) {
                System.out.println("Good bye!");
                break;
            }
            System.out.println("Type command or use 'help' to list all commands");
        }
    }
}
