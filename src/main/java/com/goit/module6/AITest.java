package com.goit.module6;

class AITest {
    public static void main(String[] args) {
        for (int i = 0; i < 3; i++) {
            int a = Const.INT;
            new AI();
        }
    }
}

class AI {
    static {
        System.out.println("AI loaded!");
    }

    {
        System.out.println("New AI created!");
    }
}

