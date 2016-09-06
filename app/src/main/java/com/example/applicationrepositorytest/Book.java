package com.example.applicationrepositorytest;

/**
 * Created by antoniods311 on 06/09/16.
 */
public class Book {

    private String title;
    private String isbn;

    public Book(String title, String isbn){
        this.isbn = isbn;
        this.title = title;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }
}
