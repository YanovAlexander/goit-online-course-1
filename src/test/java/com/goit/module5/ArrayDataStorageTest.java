package com.goit.module5;

import com.goit.module5.exercises.*;
import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class ArrayDataStorageTest {

    @Test
    public void testDataStorageEmptyShouldNotSaveElement() {
        DataStorage dataStorage = new ArrayDataStorage(0);
        dataStorage.addPublication(new Book("Book", 100, "Oleksandr"));
        assertThat(dataStorage.findAll().length, is(0));
    }

    @Test
    public void testDataStorageShouldReturnOne() {
        DataStorage dataStorage = new ArrayDataStorage(1);
        dataStorage.addPublication(new Publication("Book", 100));
        assertThat(dataStorage.findAll().length, is(1));
    }

    @Test
    public void testDataStorageShouldReturnTwo() {
        DataStorage dataStorage = new ArrayDataStorage(1);
        dataStorage.addPublication(new Publication("Book", 100));
        dataStorage.addPublication(new Publication("Book", 100));
        assertThat(dataStorage.findAll().length, is(2));
    }

    @Test
    public void testDataStorageShouldRemoveElement() {
        DataStorage dataStorage = new ArrayDataStorage(1);
        Publication publication = new Publication("Book", 100);
        Publication publicationToRemove = new Publication("Book", 100);
        dataStorage.addPublication(publication);
        dataStorage.removePublication(publicationToRemove);
        assertThat(dataStorage.findAll(), is(new Publication[1]));
    }

    @Test
    public void testDataStorageShouldNotRemoveBook() {
        DataStorage dataStorage = new ArrayDataStorage(2);
        Publication book = new Book("Book", 100, "author");
        Publication journal = new Journal("Journal", 100, 101, 1991);

        dataStorage.addPublication(book);
        dataStorage.addPublication(journal);

        dataStorage.removePublication(new Publication("Book", 100));

        assertThat(dataStorage.printAll(), is("Book{name=Book,countPages=100,author=author},Journal{name=Journal," +
                "countPages=100,year=1991,number=101}"));
    }
}
