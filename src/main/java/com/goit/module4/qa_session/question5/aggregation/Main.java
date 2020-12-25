package com.goit.module4.qa_session.question5.aggregation;

public class Main {
    public static void main(String[] args) {
        //Агрегация
        Halter halter = new Halter();
        Horse horse = new Horse(halter);
        horse = null;

        Horse immortalHorse = new Horse(halter);
    }
}
