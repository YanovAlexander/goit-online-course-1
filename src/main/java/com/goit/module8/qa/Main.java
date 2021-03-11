package com.goit.module8.qa;


import java.util.*;

public class Main {
    public static void main(String[] args) {
       Set<Box<String>> box = new TreeSet<>(new Comparator<Box<String>>() {
           @Override
           public int compare(Box<String> o1, Box<String> o2) {
               return o1.get().compareTo(o2.get());
           }
       });
    }
}
