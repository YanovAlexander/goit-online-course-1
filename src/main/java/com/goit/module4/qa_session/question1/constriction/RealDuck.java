package com.goit.module4.qa_session.question1.constriction;

public class RealDuck extends Duck {
    @Override
    public void quack() {
        System.out.println("Крякает настоящая утка");
    }

    public void eat() {
        System.out.println("Ем траву");
    }

    public void walk() {
        System.out.println("I am walking");
    }

    public void fly () {
        System.out.println("I am flying");
    }
}
