package com.company;

public class Book {
    String name;
    String author;
    int serial_number;
    int number_of_pages;


    public Book(String name, int number_of_pages, String author) {
        this.name = name;
        this.author = author;
        this.number_of_pages = number_of_pages;
    }

    public Book(String name, String author, int serial_number, int number_of_pages) {
        this.name = name;
        this.author = author;
        this.serial_number = serial_number;
        this.number_of_pages = number_of_pages;
    }
    public Book(String name, String author) {
        this.name = name;
        this.author = author;
    }

    @Override
    public String toString() {
        return "Название = '" + name + '\'' +
                ", Автор = '" + author + '\'' +
                ", Порядковый номер в серии = " + serial_number +
                ", Количество страниц = " + number_of_pages;
    }
}
