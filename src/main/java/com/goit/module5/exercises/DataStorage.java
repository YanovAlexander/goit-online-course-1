package com.goit.module5.exercises;

public interface DataStorage {
    void addPublication(Publication publication);

    void removePublication(Publication publication);

    Publication[] findAll();

    String printAll();
}
