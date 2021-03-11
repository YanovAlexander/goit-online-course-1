package com.goit.module5.exercises.commands;


public interface Command {

    void process();

    String format();

    default boolean canProcess(String command) {
       return format().equals(command);
    }
}
