package com.company;

import com.company.Book;

import java.util.Random;

public class Reader {

    public static Book choiceBook(Book[] args) {
        Random random = new Random();
        int length = args.length;
        int choice = random.nextInt(length);
        return args[choice];
    }


    public void readBook(Book book) {
        System.out.println("Вы выбрали книгу: " + book);
    }


    public void rating(Book book){
        Random random = new Random();
        int a1 = random.nextInt(10);
        int b1 = random.nextInt(10);
        int a;
        int b;
        if (book.number_of_pages == 0){
            a = a1;}
        else { a = book.number_of_pages;}

        if (book.serial_number == 0){
            b = b1;}
        else { b = book.serial_number;}

        int rating = book.name.length() + book.author.length() - a - b;
        System.out.println("Рейтинг книги " + "'" + book.name + "': " + rating);

    }


}
