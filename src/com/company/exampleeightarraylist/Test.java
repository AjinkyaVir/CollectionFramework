package com.company.exampleeightarraylist;

import java.util.ArrayList;
import java.util.Iterator;

public class Test {

    public static void main(String[] args) {

        ArrayList<String> arl = new ArrayList<>();
        arl.add("Mango");
        arl.add("JackFruit");
        arl.add("Chickoo");
        arl.add("Cachew");

        System.out.println(arl);

        arl.add(2,"Banana");
        System.out.println(arl);

        arl.remove(2);
        System.out.println(arl); //To remove specified element object from arrayList

        arl.add(2,"Banana");
        System.out.println(arl);

        arl.set(2,"Peru");
        System.out.println(arl); //This method replace replace an element at specified position

        String s = String.valueOf(arl.contains("Peru"));
        System.out.println(s); // This method returns true if the array list contains the specified object

        System.out.println("Extracting array elements::");

        for (String value : arl) {
            System.out.println(value);
        }

    }

}
