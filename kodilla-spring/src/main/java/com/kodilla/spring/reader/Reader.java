package com.kodilla.spring.reader;

public final class Reader {
    final Book book;

    public Reader(final Book book) {
        this.book = new Book("the book");
    }

    public void read() {
        System.out.println("Reading: " + book.getTitle());
    }
}
