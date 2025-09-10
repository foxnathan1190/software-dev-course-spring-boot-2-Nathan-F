package com.example.mycollections.models;

public class Book extends LibraryItem {
    private String author;
    private int pages;

    public Book(String name, String author, int year, int pages) {
        super(name, year);
        this.author = author;
        this.pages = pages;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public int getPages() {
        return pages;
    }

    public void setPages(int pages) {
        this.pages = pages;
    }

    @Override
    public String toString() {
        return getName() + " by " + author + " (" + getYear() + ") – " + pages + " pages";
    }
}