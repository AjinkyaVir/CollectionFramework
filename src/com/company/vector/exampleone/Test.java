package com.company.vector.exampleone;

import java.util.Vector;

public class Test {

    public static void main(String[] args) {

        Vector<String> vector = new Vector<>(); //Default constructor
        //Vector<String> vector = new Vector<>(2); New capacity will be double
        //Vector<String> vector = new Vector<>(2,6); after capacity finished capacity increment
        System.out.println(vector.capacity());
        vector.add("Aju");
        vector.add("Sau");
        vector.add("Shra");
        vector.add("Abhi");
        vector.add("Aju");
        vector.add("Sau");
        vector.add("Shra");
        vector.add("Abhi");


        System.out.println(vector);
        System.out.println(vector.capacity());

    }

}
