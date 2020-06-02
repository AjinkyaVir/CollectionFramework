package com.company.cursor.exampleoneenumeration.iterator;

import java.util.ArrayList;
import java.util.Iterator;

public class Demo {

    public static void main(String[] args) {

        /*
         * Cursors 1. Enumeration 2. Iterator 3.ListIterator
         *
         * Iterator
         * 1. Introduce in version 1.2 is called legacy cursor.
         * 2.read data  form All classes
         * 3.universal cursor
         * 4.We can get iterator object by using iterator()
         * 5.Contains three methods 1. hasNext() 2. next() 3.remove()
         * 6.read data in forward direction
         * 7.Enumeration is interface
         * 8.support normal and generic enumeration
         * */

        ArrayList<String> al = new ArrayList<>();
        al.add("Aju");
        al.add("Sau");
        al.add("Shra");
        al.add("Abhi");

        // Read the data by using iterator : normal version
        System.out.println("Read the data by using iterator : normal version");
        Iterator itr = al.iterator();
        while (itr.hasNext()){
            String s = (String) itr.next();
            System.out.println(s);
        }
        System.out.println("************************************************************");

        System.out.println("Read the data by using iterator : generic version");

        ArrayList<String> arrayList = new ArrayList<>();
        arrayList.add("Anu");
        arrayList.add("Andy");
        arrayList.add("Dinu");
        arrayList.add("Swapna");

        Iterator<String> iterator = arrayList.iterator();
        while (iterator.hasNext()){
            String s = iterator.next();
            System.out.println(s);
        }

    }

}
