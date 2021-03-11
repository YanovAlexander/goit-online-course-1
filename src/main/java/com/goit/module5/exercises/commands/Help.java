package com.goit.module5.exercises.commands;

import com.goit.module5.exercises.view.View;

public class Help implements Command {

    private View view;

    public Help(View view) {
        this.view = view;
    }

    @Override
    public void process() {
        view.write("add book - add a book to a storage");
        view.write("help - list all commands");
    }

    @Override
    public String format() {
        return "help";
    }
}
