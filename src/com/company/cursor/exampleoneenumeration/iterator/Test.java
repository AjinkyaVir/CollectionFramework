package com.company.cursor.exampleoneenumeration.iterator;

import java.util.ArrayList;
import java.util.Iterator;

public class Test {

    public static void main(String[] args) {
        ArrayList<String> al = new ArrayList<>();
        al.add("Aju");
        al.add("Sau");
        al.add("Shra");
        al.add("Abhi");

        // Iterator cursor to remove the data
        Iterator<String> iterator = al.iterator();
        while (iterator.hasNext()){
            String s = iterator.next();
            System.out.println(s);
            if (s.equals("Abhi")){
                iterator.remove();
            }

        }
        System.out.println(al);
    }

}
