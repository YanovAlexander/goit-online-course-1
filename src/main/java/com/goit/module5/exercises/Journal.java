package com.goit.module5.exercises;

import java.util.Objects;

public class Journal extends Publication{
    private int number;
    private int publicationYear;

    public Journal(String name, int countPages, int number, int publicationYear) {
        super(name, countPages);
        this.number = number;
        this.publicationYear = publicationYear;
    }

    @Override
    protected String print() {
        return "Journal{" + super.print() + ",year=" + this.publicationYear + ",number=" + this.number +"}";
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Journal journal = (Journal) o;
        return number == journal.number &&
                publicationYear == journal.publicationYear;
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), number, publicationYear);
    }
}
