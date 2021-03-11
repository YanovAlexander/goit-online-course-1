package com.goit.module7;

public class Journal {
    private int number;
    private int publicationYear;
    private String name;
    private int countPages;

    private Journal(Builder builder) {
        this.name = builder.name;
        this.countPages = builder.countPages;
        this.number = builder.number;
        this.publicationYear = builder.publicationYear;
    }

    protected String print() {
        return "Journal{" + ",year=" + this.publicationYear + ",number=" + this.number +"}";
    }

    static class Builder {
        private int number;
        private int publicationYear;
        private String name;
        private int countPages;

        public Builder setNumber(int number) {
            this.number = number;
            return this;
        }

        public Builder setPublicationYear(int publicationYear) {
            this.publicationYear = publicationYear;
            return this;
        }

        public Builder setName(String name) {
            this.name = name;
            return this;
        }

        public Builder setCountPages(int countPages) {
            this.countPages = countPages;
            return this;
        }

        public Journal build() {
            return new Journal(this);
        }
    }
}
