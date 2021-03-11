package com.goit.module5.exercises;

import java.util.Arrays;

public class ArrayDataStorage implements DataStorage {
    private Publication[] publications;
    private int cursor;
    private int size;
    private static final int DEFAULT_SIZE = 16;

    public ArrayDataStorage() {
        this.size = DEFAULT_SIZE;
        this.publications = new Publication[DEFAULT_SIZE];
        this.cursor = 0;
    }

    public ArrayDataStorage(int size) {
        this.publications = new Publication[size];
        this.cursor = 0;
        this.size = size;
    }

    @Override
    public void addPublication(Publication publication) {
        if (publications.length == 0) {
            return;
        }

        if (size <= cursor) {
            increaseDataStorage();
        }

        publications[cursor] = publication;
        cursor++;
    }

    private void increaseDataStorage() {
        int newSize = size * 2;
        Publication[] newStorage = Arrays.copyOf(this.publications, newSize);
        this.size = newSize;
        this.publications = newStorage;
    }

    @Override
    public void removePublication(Publication publication) {
        for (int i = 0; i < publications.length; i++) {
            if (publications[i] != null) {
                if (publications[i].equals(publication)) {
                    publications[i] = null;
                }
            }
        }
    }

    @Override
    public Publication[] findAll() {
        return Arrays.copyOf(publications, publications.length);
    }

    @Override
    public String printAll() {
        StringBuilder builder = new StringBuilder();

        for (Publication publication : publications) {
            builder.append(publication.print());
            builder.append(",");
        }
        builder.setLength(builder.length() - 1);
        return builder.toString();
    }
}
