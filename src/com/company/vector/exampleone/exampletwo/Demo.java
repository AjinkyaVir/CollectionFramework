package com.company.vector.exampleone.exampletwo;

import java.util.ArrayList;
import java.util.Vector;

public class Demo {

    public static void main(String[] args) {

        /* We can add any collection data into any collection*/
        ArrayList<String> arrayList = new ArrayList<>();
        arrayList.add("aaa");
        arrayList.add("bbb");

        Vector<String> vector = new Vector<>(arrayList);
        vector.add("Aju");
        vector.add("Sau");
        System.out.println(vector);

    }

}
