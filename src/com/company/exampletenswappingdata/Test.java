package com.company.exampletenswappingdata;

import java.util.ArrayList;
import java.util.Collections;

public class Test {
    public static void main(String[] args) {



        ArrayList<String> arrayList = new ArrayList<>();
        arrayList.add("Aju");
        arrayList.add("Sau");
        arrayList.add("Abhi");
        arrayList.add("Shra");
        System.out.println("Before swapping :: " + arrayList);
        Collections.swap(arrayList,1,3); // swapping the data
        System.out.println("After swapping :: " + arrayList);
        Collections.swap(arrayList,1,3);

        ArrayList<String> a2 = new ArrayList<>(arrayList.subList(0,4)); // to print sublist
        System.out.println(a2);

        ArrayList<Integer> arrayList1 = new ArrayList<>(100);
        for (int i=0; i<=100; i++){
           arrayList1.add(i);
           System.out.println(arrayList1.get(i));
       }

       ArrayList<Integer> a3 = new ArrayList<>(arrayList1.subList(33,45));
        System.out.println(a3);

    }
}
