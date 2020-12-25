package com.goit.module4.qa_session.question2;

public class Example {
    private int[] arr = new int[] {1, 2, 3, 4, 5,6};
    private Counter counter = new Counter();

    public int[] getArr() {
        return arr;
    }

    public void setArr(int[] arr) {
        this.arr = arr;
    }

    public Counter getCounter() {
        return counter;
    }

    public void setCounter(Counter counter) {
        if (counter != null) {
            this.counter = counter;
        }
    }
}
