package com.goit.module4.qa_session.question1.constriction;

public class Main {
    public static void main(String[] args) {
        //Добавили сужение что бы легче переключатся между реализациями
        Duck duck = new YellowDuck();
        duck.quack();
        duck.eat();
    }
}
