package com.kodilla.hibernate.invoice.dao;

import java.util.Objects;

public class Book {
    private String title;
    private int year;

    public Book(String title, int year) {
        this.title = title;
        this.year = year;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Book book = (Book) o;
        return year == book.year &&
                Objects.equals(title, book.title);
    }

    @Override
    public int hashCode() {
        return Objects.hash(title, year);
    }
}
