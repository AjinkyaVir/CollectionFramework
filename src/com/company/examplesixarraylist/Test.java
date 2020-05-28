package com.company.examplesixarraylist;

import java.util.ArrayList;

public class Test {

    public static void main(String[] args) {

        /*
        * ArrayList have three constructor
        *
        * */

        ArrayList<Integer> a1 = new ArrayList<Integer>();
        a1.add(10);
        a1.add(20);
        a1.add(30);

        ArrayList<Integer> a2 = new ArrayList<Integer>(a1);
        a2.add(100);
        a2.add(200);
        a2.add(300);

        System.out.println(a2);

    }

}
