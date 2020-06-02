package com.company.cursor.exampleoneenumeration.listiterator;

import java.util.ArrayList;
import java.util.ListIterator;

public class Test {

    public static void main(String[] args) {

        ArrayList<String > al = new ArrayList<>();
        al.add("Aju");
        al.add("Sau");
        al.add("Shra");
        al.add("Abhi");

        // List Iterator cursor : normal version : print data forward direction

        ListIterator listIterator = al.listIterator();
        while (listIterator.hasNext()){
            String s = (String) listIterator.next();
            System.out.println(s);
        }

        System.out.println("***********************************************************************");

        // List Iterator cursor : normal version : print data backward direction
        while (listIterator.hasPrevious()){
            String ss = (String) listIterator.previous();
            System.out.println(ss);
        }

        System.out.println("<><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><>");

        // List Iterator cursor : generic version : print data forward direction

        ListIterator<String> listIterator1 = al.listIterator();
        while (listIterator1.hasNext()){
            String ss = listIterator1.next();
            System.out.println(ss);
        }
        System.out.println("=================================================================================");

        // List Iterator cursor : generic version : print data backward direction

        while (listIterator1.hasPrevious()){
            String ss1 = listIterator1.previous();
            System.out.println(ss1);
        }
    }

}
