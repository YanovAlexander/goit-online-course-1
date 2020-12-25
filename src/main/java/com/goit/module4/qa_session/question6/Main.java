package com.goit.module4.qa_session.question6;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        getDayOfTheWeek(1);
        getDayOfTheWeek(3);
        getDayOfTheWeek(2);
        getDayOfTheWeek(4);
        getDayOfTheWeek(5);
        getDayOfTheWeek(6);
        getDayOfTheWeek(7);
        /**for (int i=1; i<=8; i++) {
         System.out.println(i + " - " + getDayOfTheWeek(i));
         }**/
        System.out.println("введите номер дня недели:");
        Scanner in = new Scanner(System.in);
        while (in.hasNext()) {
            System.out.println(getDayOfTheWeek(getNumber((in.nextLine()))));
        }
    }
    public static int getNumber (String line) {
        try {
            Integer integer = Integer.parseInt(line);
        } catch (NumberFormatException ex) {
            System.out.println("Не правильный формат");
        }


        for (int i = 0; i < line.length(); i++) {
            if ('1'<=line.charAt(i)&& line.charAt(i)<'9') {
                return Character.getNumericValue(line.charAt(i));
            }
        }
        return 0;
    }

    public static String getDayOfTheWeek(int dayNum) {
        switch (dayNum) {
            case 1:
                return "Monday";
            case 2:
                return "Tuesday";
            case 3:
                return "Wednesday";
            case 4:
                return "Thursday";
            case 5:
                return "Friday";
            case 6:
                return "Saturday";
            case 7:
                return "Sunday";
            default:
                return "неправильное число, введите число в диапазоне от 1 до 7";
        }
    }
}
