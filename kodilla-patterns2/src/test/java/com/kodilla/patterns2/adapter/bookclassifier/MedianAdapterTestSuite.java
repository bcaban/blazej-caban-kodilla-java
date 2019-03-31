package com.kodilla.patterns2.adapter.bookclassifier;

import com.kodilla.patterns2.adapter.bookclasifier.MedianAdapter;
import com.kodilla.patterns2.adapter.bookclasifier.librarya.Book;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

import java.util.HashSet;
import java.util.Set;

public class MedianAdapterTestSuite {
    @Test
    public void publicationYearMedianTest() {
        //Given
        Set<Book> books = new HashSet<>();
        books.add(new Book("Author 1", "Title1", 1905, "111"));
        books.add(new Book("Author 2", "Title2", 1985, "222"));
        books.add(new Book("Author 3", "Title3", 2005, "333"));
        books.add(new Book("Author 4", "Title4", 2012, "444"));
        books.add(new Book("Author 4", "Title4", 2018, "444"));
        //When
        MedianAdapter medianAdapter = new MedianAdapter();
        int bookSetPublicationYearMedian = medianAdapter.publicationYearMedian(books);
        System.out.println(bookSetPublicationYearMedian);
        //Then
        assertEquals(2005, bookSetPublicationYearMedian);
    }
}
