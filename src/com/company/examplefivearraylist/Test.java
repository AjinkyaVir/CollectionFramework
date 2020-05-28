package com.company.examplefivearraylist;

import java.util.ArrayList;

public class Test {

    public static void main(String[] args) {
        ArrayList a = new ArrayList();
        a.add(10);
        a.add(10.5);
        a.add("Ajinkya");
        a.add(15);
        a.add(null);

        System.out.println(a); // To print array list
        System.out.println(a.size()); // To check size of array list

        a.add(2,"Gajani"); // To add data into array list
        System.out.println(a);

        a.remove(2); // To remove data from array list by index number
        System.out.println(a);

        a.remove("Ajinkya"); // To remove data from array list by data
        System.out.println(a);

        a.add(2,"Gajani");
        System.out.println(a);

        a.set(2,"Ajinkya"); // To replace data at given index number
        System.out.println(a);

        // To check array is empty or not
        System.out.println(a.isEmpty());

        a.clear(); // To clear array list
        System.out.println(a);

        a.remove(15); //Exception in thread "main" java.lang.IndexOutOfBoundsException: Index: 15, Size: 0

    }

}
