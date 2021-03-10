package com.company;


public class Main {

    public static void main(String[] args) {

        Book MasterMargarita = new Book("Мастер и Маргарита", "Булгаков");
        Book WarAndPeace2 = new Book("Война и Мир", "Толстой", 2, 320 );
        Book WarAndPeace1 = new Book("Война и Мир", "Толстой", 1, 308);
        Book Idiot = new Book("Идиот", 640, "Достоевский");

        Book[] library = {MasterMargarita, WarAndPeace2, WarAndPeace1, Idiot};

        Reader man = new Reader();

        Book book = Reader.choiceBook(library);
        man.readBook(book);
        man.rating(book);


    }
}
