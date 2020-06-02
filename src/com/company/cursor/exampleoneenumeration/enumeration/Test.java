package com.company.cursor.exampleoneenumeration.enumeration;

import java.util.Enumeration;
import java.util.Vector;

public class Test {

    public static void main(String[] args) {

        /*
        * Cursors 1. Enumeration 2. Iterator 3.ListIterator
        *
        * Enumeration
        * 1. Introduce in version 1.0 is called legacy cursor.
        * 2.read data only form legacy classes
        * 3.Not universal cursor
        * 4.We can get enumeration object by using element()
        * 5.Contains two methods 1. hasMoreElements 2. nextElements()
        * 6.Only read operation is done.
        * 7.read data in forward direction
        * 8.Enumeration is interface
        * 9.support normal and generic enumeration
        * */

        Vector<String> vector = new Vector<>();
        vector.add("Aju");
        vector.add("Sau");
        vector.add("Abhi");
        vector.add("Shra");

        // Read the data by using Enumeration : normal version
        System.out.println("Read the data by using Enumeration : normal version");
        Enumeration enumeration = vector.elements();
        while (enumeration.hasMoreElements()){ //hasMoreElements() to check data is available or not
            String s = (String) enumeration.nextElement(); //nextElement() to read data
            System.out.println(s);

        }

        System.out.println("------------------------------------------------------------------------------");

        // Read the data by using Enumeration : generic version
        System.out.println("Read the data by using Enumeration : generic version");
        Enumeration<String> enumeration1 = vector.elements();
        while (enumeration1.hasMoreElements()){
            String s = enumeration1.nextElement();
            System.out.println(s);
        }

    }


}
