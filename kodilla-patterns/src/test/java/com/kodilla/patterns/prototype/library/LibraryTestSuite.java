package com.kodilla.patterns.prototype.library;

import org.junit.Assert;
import org.junit.Test;

import java.time.LocalDate;

public class LibraryTestSuite {
    @Test
    public void testGetBooks() {
        //Given
        //creating books
        Book book1 = new Book("The Godfather", "Mario Puzo", LocalDate.of(1969, 3, 10));
        Book book2 = new Book("The Hunger Games", "Suzanne Collins", LocalDate.of(2008, 9, 14));
        Book book3 = new Book("The Hobbit", "J.R.R. Tolkien", LocalDate.of(1937, 1, 11));
        Book book4 = new Book("Messi", "Luca Caioli", LocalDate.of(2011, 11, 9));

        //creating library
        Library library = new Library("Library 1");
        library.getBooks().add(book1);
        library.getBooks().add(book2);
        library.getBooks().add(book3);
        library.getBooks().add(book4);

        //making a shallow copy of object library
        Library cloneLibrary = null;
        try {
            cloneLibrary = library.shallowCopy();
            cloneLibrary.setName("Library 2");
        } catch (CloneNotSupportedException e) {
            System.out.println(e);
        }

        //making a deep copy of object library
        Library deepCloneLibrary = null;
        try {
            deepCloneLibrary = library.deepCopy();
            deepCloneLibrary.setName("Library 3");
        } catch (CloneNotSupportedException e) {
            System.out.println(e);
        }

        //When
        library.getBooks().remove(book1);
        //Then
        System.out.println(library);
        System.out.println(cloneLibrary);
        System.out.println(deepCloneLibrary);
        Assert.assertEquals(3, library.getBooks().size());
        Assert.assertEquals(3, cloneLibrary.getBooks().size());
        Assert.assertEquals(4, deepCloneLibrary.getBooks().size());
        Assert.assertEquals(library.getBooks(), cloneLibrary.getBooks());
        Assert.assertNotEquals(deepCloneLibrary.getBooks(), library.getBooks());
    }
}
