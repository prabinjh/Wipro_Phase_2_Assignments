package com.s;



public class BookPrinter {
    public void printBookDetails(Book book) {
        System.out.println("Book: " + book.getTitle() + " | Author: " + book.getAuthor() + " | ISBN: " + book.getIsbn());
    }
}

