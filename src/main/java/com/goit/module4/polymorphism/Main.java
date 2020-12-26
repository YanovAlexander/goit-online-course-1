package com.goit.module4.polymorphism;

import java.util.Arrays;
import java.util.Comparator;

public class Main {

    public static void main(String[] args) {
        Book book1 = new Book();
        Book book2 = new Book();
        Book book3 = new Book();
        Book book4 = new Book();

        book1.setAuthor("Oleksandr");
        book2.setAuthor("Tatiana");
        book3.setAuthor("Daniil");
        book4.setAuthor("Ekaterina");
        Book[] books = new Book[]{book1, book2, book3, book4};

        sortBooks(books);
        System.out.println("Books sort " + Arrays.toString(books));

        Book historicBook1 = new HistoricBook();
        Book historicBook2 = new HistoricBook();
        Book historicBook3 = new HistoricBook();
        Book historicBook4 = new HistoricBook();

        historicBook1.setAuthor("Oleksandr");
        historicBook2.setAuthor("Tatiana");
        historicBook3.setAuthor("Daniil");
        historicBook4.setAuthor("Ekaterina");
        Book[] historikBooks = new Book[]{historicBook1, historicBook2, historicBook3, historicBook4};
        sortBooks(historikBooks);
        System.out.println("Historic books sort " + Arrays.toString(historikBooks));

        Book artisticBook1 = new ArtisticBook();
        Book artisticBook2 = new ArtisticBook();
        Book artisticBook3 = new ArtisticBook();
        Book artisticBook4 = new ArtisticBook();

        artisticBook1.setAuthor("Oleksandr");
        artisticBook2.setAuthor("Tatiana");
        artisticBook3.setAuthor("Daniil");
        artisticBook4.setAuthor("Ekaterina");
        Book[] artisticBooks = new Book[]{artisticBook1, artisticBook2, artisticBook3, artisticBook4};

        sortBooks(artisticBooks);
        System.out.println("Artistic books sort " + Arrays.toString(artisticBooks));
    }

    //WIthout polymorphism
    private static void sortArtisticBooks(ArtisticBook[] books) {
        Arrays.sort(books, new Comparator<ArtisticBook>() {
            @Override
            public int compare(ArtisticBook o1, ArtisticBook o2) {
                return o1.getAuthor().compareTo(o2.getAuthor());
            }
        });
    }
    //WIthout polymorphism
    private static void sortHistoricBook(HistoricBook[] books) {
        Arrays.sort(books, new Comparator<HistoricBook>() {
            @Override
            public int compare(HistoricBook o1, HistoricBook o2) {
                return o1.getAuthor().compareTo(o2.getAuthor());
            }
        });
    }

    private static void sortBooks(Book[] books) {
        Arrays.sort(books, new Comparator<Book>() {
            @Override
            public int compare(Book o1, Book o2) {
                return o1.getAuthor().compareTo(o2.getAuthor());
            }
        });
    }
}
