package com.company.cursor.exampleoneenumeration.listiterator.example;

import java.util.ArrayList;
import java.util.ListIterator;

public class Demo {

    public static void main(String[] args) {

        ArrayList<String> al = new ArrayList<>();
        al.add("Ajinkya");
        al.add("Sayali");
        al.add("Shra");
        al.add("Abhi");

        System.out.println(al);
        System.out.println("=>>>>>>>>>>>>>=>>>>>>>>>>>>");
        ListIterator<String> listIterator = al.listIterator();
        listIterator.add("Rupa");
        System.out.println(al);
        while (listIterator.hasNext()){
            String s = listIterator.next();
            if (s.equals("Abhi")){
                listIterator.remove();
            }
            if (s.equals("Shra")){
                listIterator.set("Shraddha");
            }
        }
        System.out.println("+++++++++++++++++++++++++++++++++++++++");
        System.out.println(al);


    }

}
