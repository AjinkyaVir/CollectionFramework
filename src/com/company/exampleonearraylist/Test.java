package com.company.exampleonearraylist;

import java.util.ArrayList;

public class Test {

    public static void main(String[] args) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(10);
        arrayList.add(10.5);
        arrayList.add("Aju");
        arrayList.add('a');
        arrayList.add(null);
        arrayList.add(10);
        System.out.println(arrayList);
        System.out.println(arrayList.toString());

    }

}
