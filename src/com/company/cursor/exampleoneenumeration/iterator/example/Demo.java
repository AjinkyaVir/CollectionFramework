package com.company.cursor.exampleoneenumeration.iterator.example;

import java.util.ArrayList;
import java.util.Iterator;

public class Demo {

    public static void main(String[] args) {

        ArrayList<Book> books = new ArrayList<>();
        books.add(new Book(111,"Java","Ajinkya"));
        books.add(new Book(112,"VB","Abhishek"));
        books.add(new Book(113,"C","Shraddha"));
        books.add(new Book(114,"C++","Abhinay"));

        Iterator<Book> bookIterator = books.iterator();
        while (bookIterator.hasNext()){
            Book s = bookIterator.next();
            System.out.println("Book  Id : " + s.id + "Book Name : " + s.bookName + "Book Author : " +s.author);

            if (s.id == 111){
                bookIterator.remove();
            }
            if (s.bookName.equals("JavaBook")){
                bookIterator.remove();
            }
        }
        System.out.println("*************************");
        for (Book b: books
             ) {
            System.out.println("Book  Id : " + b.id + "Book Name : " + b.bookName + "Book Author : " +b.author);
        }
    }

}
