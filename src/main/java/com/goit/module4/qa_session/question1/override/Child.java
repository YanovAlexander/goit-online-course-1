package com.goit.module4.qa_session.question1.override;

public class Child extends Parent {

//    If we add Override annotation this example will not work as we have not parentMethod1 in out parentClass
//    @Override
    public void parentMethod1() {
        System.out.println("Call from a child class");
    }
}
