package com.company.examplesevenarraylist;

import java.util.ArrayList;

public class Test {

    public static void main(String[] args) {


        /* Approach 1 : Constructor Approach
        *
        * only one collection into another collection
        * */

        ArrayList<Integer> a1 = new ArrayList<>();
        a1.add(10);
        ArrayList<Integer> a2 = new ArrayList<>(a1);
        a2.add(10);
        System.out.println(a2);


        /*
        * Approach 2 : addAll()
        *
        * to add more than one collection into another collection
        *
        * */
        ArrayList<Integer> b1 = new ArrayList<>();
        b1.add(1000);
        ArrayList<Integer> b2 = new ArrayList<>();
        b2.add(2000);
        ArrayList<Integer> b3 = new ArrayList<>();
        b3.addAll(b1);
        b3.addAll(b2);
        System.out.println(b3);


    }

}
