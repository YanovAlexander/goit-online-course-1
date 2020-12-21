package com.goit.module3;

public class DeMorgan {
    public static void main(String[] args) {
        /**
         * Коньюнкция -  логическая операция И &
         * Дизьюнкция означает логическую операцию ИЛИ |
         */
        boolean a = false;
        boolean b = false;

        String variable = "on";

        if (a = true)
            System.out.println("Giasdasd");
        else
        System.out.println();
//       !(a & b) = !a | !b
//       !(a | b)  =  !a & !b
//       !a | !b   = !(a & b)


//             !(a | b) = !a & !b;
        /**
         * 1 - true
         * 0 - false
         *
         *  a   b    a|b   !(a|b)   |   !a   !b  !a&!b
         *  0   0     0      1      |   1   1      1
         *  1   0     1      0      |   0   1      0
         *  0   1     1      0      |   1   0      0
         *  1   1     1      0      |   0   0      0
         */
    }
}
