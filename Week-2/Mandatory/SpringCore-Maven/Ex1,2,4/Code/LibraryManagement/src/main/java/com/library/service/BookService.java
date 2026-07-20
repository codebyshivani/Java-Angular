package com.library.service;

import com.library.repository.BookRepository;

public class BookService {

    private BookRepository bookRepository;

    public void setBookRepository(BookRepository bookRepository) {
        this.bookRepository = bookRepository;
    }

    public void addBook() {

        System.out.println("========== Library Management System ==========");
        System.out.println("Connecting to Book Repository...");
        System.out.println("Book Repository Connected Successfully.");
        System.out.println("Book Service Started Successfully.\n");

        System.out.println("Available Book:");
        System.out.println(bookRepository.getBookTitle());

        System.out.println("\nDependency Injection Successful!");
        System.out.println("==============================================");
    }
}