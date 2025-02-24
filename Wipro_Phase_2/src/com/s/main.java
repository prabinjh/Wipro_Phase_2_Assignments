package com.s;

public class main {
    public static void main(String[] args) {
        Book book = new Book("The Alchemist", "Paulo Coelho", "978-0061122415");
        BookPrinter printer = new BookPrinter();
        
        printer.printBookDetails(book);
    }
}
