package com.goit.module5.exercises.controller;

import com.goit.module5.exercises.DataStorage;
import com.goit.module5.exercises.commands.Command;
import com.goit.module5.exercises.commands.Help;
import com.goit.module5.exercises.view.View;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MainController {

    private List<Command> commands;
    private View view;

    public MainController(View view, DataStorage dataStorage) {
        this.view = view;
        this.commands = new ArrayList<>(Arrays.asList(
            new Help(view)
        ));
    }

    public void run() {
        view.write("Welcome");
        view.write("Tratata");
        view.write("Print Command");
        doCommand();
    }

    private void doCommand() {
        label:
        while (true) {
            String inputCommand = view.read();
            for (Command command : commands) {
                try {
                    if (command.canProcess(inputCommand)) {
                        command.process();
                        break;
                    } else if (inputCommand.equals("exit")) {
                        view.write("Good bye");
                        break label;
                    }
                } catch (Exception e) {
                    printError(e.getMessage());
                    break;
                }
            }
        }
    }

    private void printError(String message) {
        view.write("Error, because of " + message);
        view.write("Please try again");
    }
}
