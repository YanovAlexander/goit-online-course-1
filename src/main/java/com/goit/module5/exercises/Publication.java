package com.goit.module5.exercises;

import java.util.Objects;

public class Publication {
    private String name;
    private int countPages;

    public Publication(String name, int countPages) {
        this.name = name;
        this.countPages = countPages;
    }

    protected String print() {
        return "name=" + this.name + ",countPages=" + this.countPages;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || this.getClass() != o.getClass()) return false;
        Publication that = (Publication) o;
        return countPages == that.countPages &&
                name.equals(that.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, countPages);
    }
}
